package Test;

import dao.AssignmentDao;
import dto.Assignment;

public class AsssignmentTest1 {
    public static void main(String[] args) {
        AssignmentDao assignmentDao = new AssignmentDao(); // 부르기
        Assignment assignment = assignmentDao.getUser(2);
        System.out.println(assignment);

    }


}
