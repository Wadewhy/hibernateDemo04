package xyz.wadewhy.test;

import org.hibernate.Session;
import org.junit.Test;

import xyz.wadewhy.pojo.Course;
import xyz.wadewhy.pojo.Student;
import xyz.wadewhy.util.HibernateUtil;

public class HibernateTest {

    // 添加数据
    @Test
    public void fun1() {
        Session session = HibernateUtil.openSession();
        session.beginTransaction();
        // 创建两个学生
        Student s1 = new Student();
        s1.setSname("张三");
        Student s2 = new Student();
        s2.setSname("李四");
        // 创建两门科目
        Course c1 = new Course();
        c1.setCname("Java基础入门");
        Course c2 = new Course();
        c2.setCname("MySQL基础入门");
        // 学生关联科目
        s1.getCourses().add(c1);
        s2.getCourses().add(c1);
        s1.getCourses().add(c2);
        s2.getCourses().add(c2);
        // 存储
        session.save(c1);
        session.save(c2);
        session.save(s1);
        session.save(s2);
        session.getTransaction().commit();
        session.close();
    }
}
