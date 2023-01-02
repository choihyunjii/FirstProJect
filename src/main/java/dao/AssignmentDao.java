package dao;
//JDBC 기초
////1.IMPORT JAVA.SQL
////2.드라이버 로드
////3단계 Connection 객체 생성
////4단계 Statement 객체 생성
////5단게 SQL 결과물이 있다면 ResultSet 객체 생성
////6단계 객체를 닫는다 순서로 진행
////DriverManager ->Connection -> Statement ->ResultSet 순서로 진행 닫을떄는 반대로 진행!

import dto.Assignment;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.PreparedStatement;


import java.sql.ResultSet;

public class AssignmentDao {
    private static String dburl ="jdbc:mysql://localhost:3306/guest_bookdb";
    private static String dbuser ="root";
    private static String dbpassword="Guswl0105@@"; //2번째

    public Assignment getUser(Integer id){
        Assignment assignment=null;
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection(dburl,dbuser,dbpassword); // database 실질적 접근 부분  연결
            String sql="SELECT * FROM assignment WHERE id=?";   //statement 쿼리문
            ps=conn.prepareStatement(sql);   // 쿼리문 실행 //4           쿼리문 연결해서 실행
            ps.setInt(1,id);                       //쿼리문 연결됐으면 1 실행?
            rs=ps.executeQuery(); // rs 쿼리실행
            if(rs.next()){ // rs 값이 있다면
                int Userid =rs.getInt(1);
                String name=rs.getString(2);
                String year=rs.getString(3);
                String ss=rs.getString(4);
                String phone_number=rs.getString(5);
                String etc=rs.getString(6);

                assignment=new Assignment(Userid,name,year,ss,phone_number,etc);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return assignment;
    }
    public int adduser(Assignment assignment){
        int insertCount=0;
        Connection conn=null;
        PreparedStatement ps=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection(dburl,dbuser,dbpassword);
            String sql = "insert into assignment values(?,?,?,?,?,?)";
            ps=conn.prepareStatement(sql);
            ps.setInt(1,assignment.getId());
            ps.setString(2,assignment.getName());
            ps.setString(3,assignment.getYear());
            ps.setString(4,assignment.getSs());
            ps.setString(5,assignment.getPhone_number());
            ps.setString(6,assignment.getEtc());
            insertCount=ps.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
        return insertCount;

    }
    public int deleteuser(Assignment assignment){
       int deleteCount = 0;
       Connection conn = null;
       PreparedStatement ps=null;
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn=DriverManager.getConnection(dburl,dbuser,dbpassword);
           String sql="delete from assignment where id =? ";
           ps=conn.prepareStatement(sql);   // 쿼리문 실행 //4           쿼리문 연결해서 실행
           ps.setInt(1,assignment.getId());
           deleteCount=ps.executeUpdate();


       }catch(Exception e){
           e.printStackTrace();
       }
       return deleteCount;
    }
    public int updateuser(Assignment assignment,int id){
        int updateCount = 0;
        Connection conn = null;
        PreparedStatement ps = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(dburl,dbuser,dbpassword);
            String sql ="update assignment set name=?, year=?, ss=?, phone_number=?,etc=? where id=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,assignment.getName());
            ps.setString(2,assignment.getYear());
            ps.setString(3,assignment.getSs());
            ps.setString(4,assignment.getPhone_number());
            ps.setString(5,assignment.getEtc());
            ps.setInt(6,id);

            updateCount=ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
        return updateCount;
    }

}
