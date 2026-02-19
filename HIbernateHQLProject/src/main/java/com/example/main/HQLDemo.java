package com.example.main;

import com.example.entity.Product;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HQLDemo {

    public static void main(String[] args) {

        System.out.println("Starting Hibernate...");

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.persist(new Product("Laptop", "Electronics", 75000, 10));

        tx.commit();
        session.close();

        System.out.println("Done!");
    }
}
