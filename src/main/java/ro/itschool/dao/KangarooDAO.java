package ro.itschool.dao;

import com.github.javafaker.Faker;
import ro.itschool.entity.Kangaroo;
import ro.itschool.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class KangarooDAO {

    SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
    Session session;
    Transaction transaction;

    Faker faker = new Faker();

    public void openSessionBeginTransaction() {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    public void transactionCommitSessionClose() {
        transaction.commit();
        session.close();
    }

    public void saveKangaroos(Kangaroo kangaroo) {
        for (int i = 0; i < 10; i++) {
            openSessionBeginTransaction();
            kangaroo.setName("Kangaroo" + (kangaroo.getId() + 1));
            kangaroo.setAge(faker.number().numberBetween(1, 20));
            kangaroo.setMaxSpeed(faker.number().numberBetween(45, 70));
            session.save(kangaroo);
            transactionCommitSessionClose();
        }

    }

    public void getKangarooById(int id) {
        session = sessionFactory.openSession();
        System.out.println(session.get(Kangaroo.class, id));
        session.close();
    }

    public void getAllKangaroos() {
        openSessionBeginTransaction();
        System.out.println(session.createQuery("from Kangaroo").list());
        transactionCommitSessionClose();
    }

    public void updateKangaroosById(int id) {
        openSessionBeginTransaction();
        Kangaroo updateKangaroo = session.get(Kangaroo.class, id);
        System.out.println("The kangaroo " + updateKangaroo + " will be updated.");
        updateKangaroo.setName("updatedKangaroo");
        System.out.println("The new name of the kangaroo is " + updateKangaroo.getName() + ".");
        session.update(updateKangaroo);
        transactionCommitSessionClose();
    }

    public void deleteKangarooById(int id) {
        openSessionBeginTransaction();
        Kangaroo deleteKangaroo = session.get(Kangaroo.class, id);
        session.delete(deleteKangaroo);
        System.out.println("The kangaroo " + deleteKangaroo + " was deleted.");
        transactionCommitSessionClose();
    }

    public void deleteAllKangaroos() {
        openSessionBeginTransaction();
        session.createSQLQuery("truncate table kangaroo").executeUpdate();
        transactionCommitSessionClose();
    }


}

