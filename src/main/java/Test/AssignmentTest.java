package Test;

import dao.AssignmentDao;
import dto.Assignment;

import java.util.Scanner;

public class AssignmentTest {
    public static void main(String[] args) {
       /* Scanner insert = new Scanner(System.in);
        System.out.println("id:");
        int id = Integer.parseInt(insert.nextLine());
        System.out.println("name:");
        String name = insert.nextLine();
        System.out.println("year:");
        String year = insert.nextLine();
        System.out.println("ss:");
        String ss = insert.nextLine();
        System.out.println("phone_number:");
        String phone_number = insert.nextLine();
        System.out.println("etc:");
        String etc = insert.nextLine();
        Assignment assignment = new Assignment(id,name,year,ss,phone_number,etc);
        AssignmentDao assignmentDao = new AssignmentDao();
        int insertCount=assignmentDao.adduser(assignment);
        System.out.println(insertCount);



       AssignmentDao dao = new AssignmentDao();
        Assignment assignment = dao.getUser(3);
        System.out.println(assignment);*/

       int id=10;
        String name="변백현";
        String year="1991-05-06";
        String ss="남자";
        String phone_number="010-1234-1234";
        String etc="나의 것.";
        Assignment assignment = new Assignment(id,name,year,ss,phone_number,etc);
        AssignmentDao assignmentDao = new AssignmentDao();
        int insertCount=assignmentDao.adduser(assignment);
        System.out.println(insertCount);
    }
}
