package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embed.FullName;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getInstance().getSession();

        FullName fullName = new FullName("udantha","panthaka");
        Student student = new Student();
        student.setId(1);
        student.setFullName(fullName);
        student.setAddress("panadura");

        Transaction transaction = session.beginTransaction();

        session.save(student);
        transaction.commit();
        session.close();

    }
}