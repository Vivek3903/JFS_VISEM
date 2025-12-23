package com.skillnext2;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Employee emp = new Employee(sc.next(),sc.next(),sc.nextDouble());

        session.persist(emp); // insert record

        tx.commit(); // commit transaction
        session.close();

        System.out.println("Employee inserted successfully!");
    }
}

