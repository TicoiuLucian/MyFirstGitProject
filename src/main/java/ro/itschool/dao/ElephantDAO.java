package ro.itschool.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import ro.itschool.entity.Elephant;
import ro.itschool.utils.HibernateUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElephantDAO {

    SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
    Session session;
    Transaction transaction;

    public void saveElephant(Elephant elephant) {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        try {
            session.save(elephant);

        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }

    public void updateElephant(int id) {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("give the new value of kg");
            int kgElephant = scanner.nextInt();

            Elephant updateElephant = session.get(Elephant.class, id);
            updateElephant.setKg(kgElephant);

            session.update(updateElephant);

        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }

    public void deleteElephant(Elephant elephant) {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        try {
            session.delete(elephant);

        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }

    public void getAllElephants() {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        List<Elephant> elephantList = new ArrayList<>();

        try {
            Query query = session.createQuery("from Elephant");
            elephantList = query.list();
            System.out.println(elephantList);

        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }
}