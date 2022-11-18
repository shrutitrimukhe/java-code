package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor1 {

 
	//variables
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;

 

    @Column(name="email")
    private String email;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="instructor_detail_id")
    private InstructorDetail1 instructorDetail;
    
    //default constructor
    public Instructor1() {
        
    }

 
    //parameterized constructor
    public Instructor1(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

 
    //getter & Setter
    public int getId() {
        return id;
    }

 

    public void setId(int id) {
        this.id = id;
    }

 

    public String getFirstName() {
        return firstName;
    }

 

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

 

    public String getLastName() {
        return lastName;
    }

 

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

 

    public String getEmail() {
        return email;
    }

 

    public void setEmail(String email) {
        this.email = email;
    }

 

    public InstructorDetail1 getInstructorDetail() {
        return instructorDetail;
    }

 

    public void setInstructorDetail(InstructorDetail1 instructorDetail) {
        this.instructorDetail = instructorDetail;
    }

 

    @Override
    public String toString() {
        return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", instructorDetail=" + instructorDetail + "]";
    }
}
