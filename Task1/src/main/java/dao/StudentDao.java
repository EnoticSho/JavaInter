package dao;

import Entity.Student;
import conf.MySessionFactory;
import org.hibernate.Session;

import java.util.List;

public class StudentDao {
    private final Session session;

    public StudentDao() {
        this.session = MySessionFactory.getSessionFactory().openSession();
    }

    public void persist(Student student) {
        session.save(student);
    }

    public Student findById(Integer id) {
        return session.get(Student.class, id);
    }

    public void update(Student entity) {
        session.update(entity);
    }

    public void delete(Student entity) {
        session.delete(entity);
    }

    public List<Student> findAll() {
        return (List<Student>)
                session.createQuery("from Student").list();

    }

    public void deleteAll() {
        session.beginTransaction();
        List<Student> entityList = findAll();
        for (Student entity : entityList) {
            session.delete(entity);
        }
        session.getTransaction().commit();
    }
}
