/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.resource;

import java.io.File;
import lk.ijse.rmi.cab.entity.Customer;
import lk.ijse.rmi.cab.entity.InsuaranceCompany;
import lk.ijse.rmi.cab.entity.Reciption;
import lk.ijse.rmi.cab.entity.User;
import lk.ijse.rmi.cab.entity.Vehicle;
import lk.ijse.rmi.cab.entity.Payment;
import lk.ijse.rmi.cab.entity.Reservation;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author user
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    private static StandardServiceRegistry registry;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
//            // config file.
            registry=new StandardServiceRegistryBuilder().loadProperties(new File("settings/hib.properties")).build();
            sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(User.class)
                    .addAnnotatedClass(Customer.class)
                    .addAnnotatedClass(Reciption.class)
                    .addAnnotatedClass(Payment.class)
                    .addAnnotatedClass(InsuaranceCompany.class)
                    .addAnnotatedClass(Vehicle.class)
                    .addAnnotatedClass(Reservation.class)
                    .buildMetadata().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            StandardServiceRegistryBuilder.destroy(registry);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
