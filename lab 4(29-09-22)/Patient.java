package lab4;

public class Patient  {
	
	public Patient(String name,int age)
	{
		System.out.println("Patient name :" +name+ " " + "age :" +age );
	}
	
	Patient(Doctor d)
	{
		d.appointment();
		d.checkup();
		d.fees();
	}

	public void Patient(Doctor d) {
		
	}

  
		
	}




