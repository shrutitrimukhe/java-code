package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.InstructorDetail1;
import com.util.HibernaeteUtil1;


public class InstructorDetailDao1 {
    public void saveInstructorDetail(InstructorDetail1 instructorDetail1) {
        Transaction transaction = null;
        try (Session session = HibernaeteUtil1.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(instructorDetail1);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    public void updateInstructorDetail(InstructorDetail1 instructorDetail1) {
        Transaction transaction = null;
        try (Session session = HibernaeteUtil1.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(instructorDetail1);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    public InstructorDetail1 getInstructorDetail1(int id) {

 

        Transaction transaction = null;
        InstructorDetail1 instructor1 = null;
        try (Session session = HibernaeteUtil1.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an instructor object
            instructor1 = session.get(InstructorDetail1.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return instructor1;
    }
}
