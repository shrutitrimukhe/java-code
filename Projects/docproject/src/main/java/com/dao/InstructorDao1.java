package com.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.entity.Instructor1;
import com.util.HibernaeteUtil1;

public class InstructorDao1 {
    
    /**
     * Save Instructor
     * @param instructor
     */
    public void saveInstructor1(Instructor1 instructor) {
        Transaction transaction = null;
        try (Session session = HibernaeteUtil1.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(instructor);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    /**
     * Update Instructor
     * @param instructor
     */
    public void updateInstructor(Instructor1 instructor) {
        Transaction transaction = null;
        try (Session session = HibernaeteUtil1.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(instructor);
            
            Instructor1 p = session.get(Instructor1.class,1);
            p.setFirstName("shruti");
            p.setLastName("Trimukhe");
            p.setEmail("shruti@gmail.com");
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    /**
     * Delete Instructor
     * @param id
     */
    public void deleteInstructor(int id) {

 

        Transaction transaction = null;
        try (Session session = HibernaeteUtil1.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

 

            // Delete a instructor object
            Instructor1 instructor = session.get(Instructor1.class, id);
            if (instructor != null) {
                session.delete(instructor);
                System.out.println("instructor is deleted");
            }

 

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

 

    /**
     * Get Instructor By ID
     * @param id
     * @return
     */
    public Instructor1 getInstructor(int id) {

 

        Transaction transaction = null;
        Instructor1 instructor = null;
        try (Session session = HibernaeteUtil1.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an instructor object
            instructor = session.get(Instructor1.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return instructor;
    }
    
    /**
     * Get all Instructors
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<Instructor1> getAllInstructor() {

 

        Transaction transaction = null;
        List<Instructor1> listOfInstructor = null;
        try (Session session = HibernaeteUtil1.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an instructor object
            
            listOfInstructor = session.createQuery("from Instructor").getResultList();
            
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfInstructor;
    }
}