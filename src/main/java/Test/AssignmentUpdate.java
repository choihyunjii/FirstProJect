package Test;

import dao.AssignmentDao;
import dto.Assignment;



public class AssignmentUpdate {
    public static void main(String[] args) {
        int id =2;
        String name = "초이현지";
        String year = "2002-06-29";
        String ss ="남자";
        String phone_number="010-3351-4072";
        String etc = "누구세요?";
        Assignment assignment = new Assignment(name,year,ss,phone_number,etc);
        AssignmentDao assignmentDao = new AssignmentDao();
        int updateCount=assignmentDao.updateuser(assignment,id);
        System.out.println(updateCount);
    }

}
