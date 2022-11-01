// Name : Shruti Trimukhe.
//Date:10-10-22

package Practice;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no:  ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd no: ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		//Bitwise AND operator 
		System.out.println("num1&num2="+(num1&num2));
		//0 1 0 1
		//0 1 0 1
		//-------
		//0 1 0 0 = 4
		
		//Bitwise OR operator 
		System.out.println("num1|num2="+(num1|num2));
		//0 1 0 1
		//0 1 1 1
		//-------
		//0 1 1 1 = 7
				
		//Bitwise XOR operator 
		System.out.println("num1^num2="+(num1^num2));
		//0 1 0 1
		//0 1 1 1
		//-------
		//0 0 1 1 = 3
		
	}

}
