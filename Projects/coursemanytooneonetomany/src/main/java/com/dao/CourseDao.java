package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Course;
import com.entity.Instructor;
import com.util.HibernetUtil;

public class CourseDao
{
	public void saveCourse(Course course) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(course);
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
     * Update Course
     * @param course
     */
    public void updateCourse(Course course) {
        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(course);
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
     * Delete Course
     * @param id
     */
    public void deleteCourse(int id) {

 

        Transaction transaction = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // Delete a instructor object
            Course course = session.get(Course.class, id);
            if (course != null)
            {
                session.delete(course);
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
     * Get Course By ID
     * @param id
     * @return
     */
    public Course getCourse(int id) {
        Transaction transaction = null;
       Course course = null;
        try (Session session = HibernetUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an instructor object
            course = session.get(Course.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return course;
    }
    

}