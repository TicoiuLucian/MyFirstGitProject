package ro.itschool.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import ro.itschool.entity.Eagle;
import ro.itschool.utils.HibernateUtils;

import java.util.List;
import java.util.Scanner;

public class EagleDAO {
    SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
    Session session;
    Transaction transaction;

    public void saveEagle(Eagle eagle){
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        try{
            session.save(eagle);
        }catch (Exception e){
            e.printStackTrace();
        }

        transaction.commit();
        session.close();

    }

    public void updateEagle(String name){

        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Set age");
            int age = scanner.nextInt();
            Eagle updateEagle = session.get(Eagle.class, name);
            updateEagle.setAge(age);

            System.out.println("Set breed");
            String breed = scanner.nextLine();
            updateEagle.setBreed(breed);

            System.out.println("Set name");
            String nume = scanner.nextLine();
            updateEagle.setName(nume);
        }catch (Exception e){
            e.printStackTrace();
        }
        transaction.commit();
        session.close();

    }




    public void getAllEagles(){
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        try{
            Query<Eagle> query = session.createQuery("from Eagle", Eagle.class);
            List<Eagle> eagleList = query.list();
            System.out.println(eagleList);
        }catch (Exception e){
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }

    public void deleteEagle(Eagle eagle){
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        try {
            session.delete(eagle);
        }catch (Exception e){
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }




}
