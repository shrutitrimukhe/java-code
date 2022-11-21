package com.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="instructor")
public class Instructor {

 
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
    private InstructorDetail instructorDetail;
    
    @OneToMany(mappedBy="instructor",cascade= {CascadeType.PERSIST,
    		CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<Course> courses;
    
    //default constructor
    public Instructor() {
        
    }

 
    //parameterized constructor
    public Instructor(String firstName, String lastName, String email) {
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

 

    public InstructorDetail getInstructorDetail() {
        return instructorDetail;
    }

 

    public void setInstructorDetail(InstructorDetail instructorDetail) {
        this.instructorDetail = instructorDetail;
    }

 

    @Override
    public String toString() {
        return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", instructorDetail=" + instructorDetail + "]";
    }


	public List<Course> getCourses() {
		return courses;
	}


	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
    
}