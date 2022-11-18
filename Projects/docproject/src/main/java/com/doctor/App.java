package com.doctor;

import java.util.List;

import com.dao.InstructorDao1;
import com.entity.Instructor1;
import com.entity.InstructorDetail1;

public class App 
{
    public static void main( String[] args )
    {
        // Save two instructors
        Instructor1 i = new Instructor1("hitesh", "wani", "wani45@gmail.com");
        InstructorDetail1 x = new InstructorDetail1("Aashirwad hospital", 2000);
        x.setInstructor(i);
        i.setInstructorDetail(x);
       
        Instructor1 a = new Instructor1("sai", "Kumar", "kumar@gmail.com");
        InstructorDetail1 y = new InstructorDetail1("D Y Patil", 3400);
        y.setInstructor(a);
        a.setInstructorDetail(y);
        
       
        
       
       
        InstructorDao1 instructorDao1 = new InstructorDao1();
        instructorDao1.saveInstructor1(i);
        instructorDao1.saveInstructor1(a);
        
        instructorDao1.updateInstructor(i);
        instructorDao1.deleteInstructor(2);
       
        // Get all instructors
        List<Instructor1> instructors1 = instructorDao1.getAllInstructor();
        instructors1.forEach(instructor1Temp -> System.out.println(instructor1Temp.getFirstName()));
    }
}
