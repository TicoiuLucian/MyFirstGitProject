package ro.itschool.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import ro.itschool.entity.Chimpanzee;
import ro.itschool.utils.HibernateUtils;

import java.util.List;
import java.util.Scanner;

public class ChimpanzeeDAO {

    SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
    Session session;
    Transaction transaction;

    public void saveChimpanzee(Chimpanzee chimpanzee) {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        try {
            session.save(chimpanzee);

        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }

    public void updateChimpanzee(int id) {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Set the correct age");
            int ageChimpanzee = scanner.nextInt();
            Chimpanzee updateChimpanzee = session.get(Chimpanzee.class, id);
            updateChimpanzee.setAge(ageChimpanzee);

            System.out.println("Set hours of sleep");
            byte hoursOfSleepChimpanzee = scanner.nextByte();
            updateChimpanzee.setHoursOfSleep(hoursOfSleepChimpanzee);

            session.update(updateChimpanzee);

        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }

    public void getAllChimpanzees() {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();


        try {
            Query<Chimpanzee> query = session.createQuery("from Chimpanzee", Chimpanzee.class);
            List<Chimpanzee> chimpanzeeList = query.list();
            System.out.println(chimpanzeeList);

        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }


    public void deleteChimpanzee(Chimpanzee chimpanzee){
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        try{
            session.delete(chimpanzee);
        }catch (Exception e){
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }



}
