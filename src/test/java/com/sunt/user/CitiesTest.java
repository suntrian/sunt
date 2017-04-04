package com.sunt.user;

import com.sunt.user.model.Cities;
import junit.framework.TestCase;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;

import java.util.List;

/**
 * Created by suntrian on 17-4-3.
 */
public class CitiesTest extends TestCase{

    private SessionFactory sessionFactory;

    @Override
    public void tearDown() throws Exception {
        if (sessionFactory != null){
            sessionFactory.close();
        }
    }

    @Override
    public void setUp() throws Exception {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        }catch (Exception e){
            e.printStackTrace();
            StandardServiceRegistryBuilder.destroy(registry);
        }

    }

    public void testCitiesUsage(){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Cities cities = new Cities(0,"ShengYan",0,0);
        session.save(cities);
        List result = session.createQuery( "from Cities" ).list();
        for ( Cities city : (List<Cities>) result ) {
            System.out.println( "City (" + city.getName() + ") : " + city.getId() );
        }
        session.getTransaction().commit();
        session.close();
    }


    public static void main(String[] args){
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        Cities cities = new Cities();
        cities.setName("Shanghai");
        cities.setLevel(0);
        cities.setUpper(0);
        s.save( cities);
        s.getTransaction().commit();
        s.close();
        sf.close();
    }
}
