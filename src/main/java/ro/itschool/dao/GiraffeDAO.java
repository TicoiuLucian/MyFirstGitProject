package ro.itschool.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ro.itschool.entity.Giraffe;
import ro.itschool.utils.HibernateUtils;

public class GiraffeDAO {

    SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();

    public void saveGiraffe(Giraffe giraffe){
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();

        try{ session.save(giraffe);
    }catch (Exception e){
            e.printStackTrace();
        }
        transaction.commit();
        session.close(); }

    public void deleteGiraffe(Giraffe giraffe) {
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
        try {
            session.delete(giraffe);
        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }






}
