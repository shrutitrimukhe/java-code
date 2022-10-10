// Name : Shruti Trimukhe.
//Date:10-10-22

package Practice;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd no: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter 3nd no: ");
		int num3 = sc.nextInt();
		
		sc.close();
		
		System.out.println("Performing AND operation");
		
		//using logical AND to verify 2 constraint.
		
		if((num1<num2)&&(num2==num3)) 
		{
		  int sum = num1 + num2 + num3;
		  System.out.println("Sum is: "+ sum);
		}
		else
		{
			System.out.println("False condition");
		}
		
		System.out.println("Performing or operation");
		
		//using logical OR to verify 2 constraints
		
		if((num1<num2)||(num2==num3)) 
		{
		  int sum = num1 + num2 + num3;
		  System.out.println("Sum is: "+ sum);
		}
		else
		{
			System.out.println("False condition");
		}
		
		System.out.println("Performing NOT operation");
		
		System.out.println("!(num1<num2)" + !(num1<num2) );
		System.out.println("!(num2==num3)" + !(num2==num3) );

		
	}

}
