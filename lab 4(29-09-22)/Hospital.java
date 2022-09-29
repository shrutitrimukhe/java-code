package lab4;

import java.util.Scanner;

public class Hospital {
	
       Doctor getDoctor()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the patient name: ");
		String Doctor = sc.nextLine();
		
		sc.close();
		
		if(Doctor.equalsIgnoreCase("Neurologist"))
		{
			return new Neurologist();
		}
		
		else if(Doctor.equalsIgnoreCase("Surgen"))
		{
			return new Surgen();
		}
		return null;
	
	}

}
