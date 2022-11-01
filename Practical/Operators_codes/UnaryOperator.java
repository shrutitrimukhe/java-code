// Name : Shruti Trimukhe.
//Date:10-10-22

package Practice;

import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no:  ");
		int num1 = sc.nextInt();
		sc.close();
		
		//Performing pre increment operation
		
		++num1;
			System.out.println("preincrement value:   " + num1);
			
		//Performing post increment operation
			
		num1++;
	    System.out.println("postincrement value:   " + num1);

	  //Performing pre decrement operation
		
	  	--num1;
	  	System.out.println("predrecrement value:   " + num1);
	  	
     //Performing post decrement operation
		
	  	num1--;
	  	System.out.println("postdrecrement value:   " + num1);



	}

}
