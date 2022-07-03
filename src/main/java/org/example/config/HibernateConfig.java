package org.example.config;

import org.example.entity.Location;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {

    public static SessionFactory buildSessionFactory() {
        final SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Location.class)
                .buildSessionFactory();
        return sessionFactory;
    }
}
