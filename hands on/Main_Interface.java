package Practice;

import java.util.Scanner;

public class Main_Interface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.next();
		
		System.out.println("Enter your bank name : ");
		String bankname = sc.next();
		
		System.out.println("Enter you account no : ");
		int accountno = sc.nextInt();   
		
		sc.close();     

		Bank_Account b0 = new Bank_Account();
		
		//b0.display();
		
		b0.ruppes(690);
		b0.Dollers(600000);
		b0.Ponds(60);        
		
		
	}

}
