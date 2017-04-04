package com.sunt.user;

import com.sunt.user.model.Cities;
import com.sunt.user.model.Department;
import com.sunt.user.model.User;
import com.sunt.user.model.UserInfo;
import junit.framework.TestCase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * Created by suntrian on 17-4-4.
 */
public class HiberMapTest extends TestCase{
    private SessionFactory sessionFactory;

    @Override
    public void tearDown() throws Exception {
        if (sessionFactory != null){
            sessionFactory.close();
        }
    }

    @Override
    public void setUp() throws Exception {
        Configuration configuration = new Configuration().configure();
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                //.applySettings(configuration.getProperties())
                .configure()
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        }catch (Exception e){
            e.printStackTrace();
            StandardServiceRegistryBuilder.destroy(registry);
        }

    }
    @Test
    public void testHiberMapConnectionUsage(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Department department = new Department(0,"Helo","another");
        session.save(department);

        User user = new User();
        user.setName("LiLei");
        user.setPassword("123456");

        UserInfo userInfo = new UserInfo();
        userInfo.setTelphone("666123456778");
        userInfo.setAddress("this is address");
        Cities city = (Cities) session.load(Cities.class, 1);
        userInfo.setNationality(city);

        user.setUserInfo(userInfo);
        userInfo.setUser(user);


        Department depart = (Department) session.load(Department.class, 1);
        user.setDepartment(depart);

        session.save(user);

        System.out.println(depart.getUsers().size());

        //session.save(userInfo);
        session.getTransaction().commit();
        session.close();

    }

//    @Test
//    public void testQuery(){
//        //Session session = sessionFactory.openSession();
//        //User user = (User)session.load(User.class, 1);
//        //System.out.println(user);
//    }

}
