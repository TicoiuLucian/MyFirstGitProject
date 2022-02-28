package ro.itschool;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ro.itschool.entity.Armadillo;
import ro.itschool.utils.HibernateUtils;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session;
        Transaction transaction;
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        Armadillo armadillo = new Armadillo();
        armadillo.setName("Marcel");
        System.out.println("Armadillo " + armadillo.getName() + " was saved to DB");
        session.save(armadillo);

        armadillo.setAge((short) 2);

        Armadillo armadillo2 = new Armadillo();
        armadillo2.setName("Roy");
        System.out.println("Armadillo " + armadillo2.getName() + " was saved to DB");
        session.save(armadillo2);

        armadillo2.setAge((short) 6);

        transaction.commit();
        session.close();








    }


}
