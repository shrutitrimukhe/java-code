// Name : Shruti Trimukhe.
//Date:10-10-22

package Practice;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no:  ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd no: ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		//Performing equal to operation.
		System.out.println("num1 == num2:  " +  (num1 == num2));
		
		//Performing not equal to operation.
		System.out.println("num1!=num2:  " + (num1!=num2));
		
		//performing greater than operator
		System.out.println("num1>num2:  " + (num1>num2));
		
		//performing less than operation
		System.out.println("num1<num2:  " + (num1<num2));
		
		//performing less than  equal to operator
		System.out.println("num1<=num2: " + (num1<=num2));
		
		//performing greater than equal to operator
		System.out.println("num1>=num2: " + (num1>=num2));
	}

}
