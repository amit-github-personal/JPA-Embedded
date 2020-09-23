package com.example.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaEmbeddedEmbeddableApplicationTests {
	@Autowired
	private static SessionFactory sessionFactory;
    private Session session;
     
    @AfterAll
    public static void tearDown() {
        if (sessionFactory != null) sessionFactory.close();
        System.out.println("SessionFactory destroyed");
    }
    
    @Test
    public void log() {
    	session = sessionFactory.getCurrentSession();
    	Employee e = new Employee("abc", "555555", new Address("fdsfa", "noida", 2000));
    	session.beginTransaction();
    	Integer id = (Integer)session.save(e);
    	session.getTransaction().commit();
    	Assertions.assertTrue(id > 0);
    }
}
