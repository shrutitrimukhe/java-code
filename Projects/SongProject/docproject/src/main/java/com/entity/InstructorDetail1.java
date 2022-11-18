package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail1 {
    
	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    //variables
    @Column(name="id")
    private int id;
    
    @Column(name="hospital")
    private String hospital;
    
    @Column(name="fees")
    private int fees;
    
    @OneToOne(mappedBy="instructorDetail", cascade=CascadeType.ALL)
    private Instructor1 instructor;

	
    
    //default constructor
    public InstructorDetail1() {
        
    }

 
    //Parameterized Constructor
    public InstructorDetail1(String hospital, int fees) {
        this.hospital = hospital;
        this.fees = fees;
    }

 
    //getter & setter
    public int getId() {
        return id;
    }

 

    public void setId(int id) {
        this.id = id;
    }

 

    public String getHospital() {
        return hospital;
    }

 

    public void sethospital(String hospitl) {
        this.hospital = hospital;
    }

 

    public int getFees() {
        return fees;
    }

 

    public void setFees(int fees) {
        this.fees = fees;
    }
    
    public Instructor1 getInstructor1() {
        return instructor;
    }

 

    public void setInstructor(Instructor1 instructor) {
        this.instructor = instructor;
    }

 

    @Override
    public String toString() {
       
		return "InstructorDetail1 [id=" + id + ", hospital=" + hospital + ", fees=" + fees + "]";
    }
}
