package Test;

import dao.AssignmentDao;
import dto.Assignment;

public class AssignmentDelete {
    public static void main(String[] args) {
        int id = 10;

        Assignment assignment = new Assignment(id); //자바 생성자 공부
        AssignmentDao assignmentDao = new AssignmentDao(); //
        int deleteCount=assignmentDao.deleteuser(assignment);
        System.out.println(deleteCount);

    }
}
