package ro.itschool.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import ro.itschool.entity.Cat;
import ro.itschool.utils.HibernateUtils;

import java.util.ArrayList;
import java.util.List;

public class CatDAO {

    SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
    Session session;
    Transaction transaction;

    public void saveCat (Cat cat){
        session = sessionFactory.openSession();
        transaction=session.beginTransaction();
        try{
            session.save(cat);
        }catch (Exception e){
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }

    public void deleteCat (Cat cat){
        session = sessionFactory.openSession();
        transaction=session.beginTransaction();
        try{
            session.delete(cat);
        }catch (Exception e){
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }

    public void getAllCats(){
        session = sessionFactory.openSession();
        transaction=session.beginTransaction();

        List<Cat> catList = new ArrayList<>();
        try{
            Query query = session.createQuery("from Cat");
            catList = query.list();
            System.out.println(catList);
        }catch (Exception e){
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
    }


}
