package ro.itschool.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import ro.itschool.entity.Lion;
import ro.itschool.utils.HibernateUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LionDAO {

    SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
    Session session;
    Transaction transaction;

    public void saveLion(Lion lion){
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        try{
            session.save(lion);

        }catch(Exception e){
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }

    public void deleteLion(Lion lion){
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        try{
            session.delete(lion);
        }catch (Exception e){
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }

    public void updateLion(int id){
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Another age");
            int anotherAge = scanner.nextInt();

            Lion updateLion = session.get(Lion.class, id);
            updateLion.setAge(anotherAge);
            System.out.println("The new age " + updateLion.getAge());

            session.update(updateLion);
        }catch (Exception e){
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }

    public void getLion(){
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        List<Lion> lionList = new ArrayList<>();

        try{
            Query query = session.createQuery("from Lion");
            lionList = query.list();
            System.out.println("My list " + lionList);

        }catch (Exception e){
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }

}
