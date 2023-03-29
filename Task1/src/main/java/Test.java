import Entity.Student;
import dao.StudentDao;

public class Test {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        System.out.println(studentDao.findAll());
//        for (int i = 0; i < 1000; i++) {
//            studentDao.persist(new Student("student" + i, i));
//        }
        System.out.println(studentDao.findAll());
        System.out.println(studentDao.findById(2000));
        Student byId = studentDao.findById(2000);
        byId.setName("semen");
        studentDao.update(byId);
        System.out.println(studentDao.findById(2000));
    }
}
