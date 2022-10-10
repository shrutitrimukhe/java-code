package Practice;

import java.util.Scanner;

public class BitwiseOperator1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no:  ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd no: ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		//Bitwise AND operator 
		System.out.println("num1&num2="+(num1&num2));
		//1 0 0 1
		//1 0 0 0
		//-------
		//1 0 0 0 = 8
		
		//Bitwise OR operator 
		System.out.println("num1|num2="+(num1|num2));
		//1 0 0 1
		//1 0 0 0
		//-------
		//1 0 0 1 = 9
				
		//Bitwise XOR operator 
		System.out.println("num1^num2="+(num1^num2));
		//1 0 0 1
		//1 0 0 0
		//-------
		//0 0 0 1 = 1
		
	}


}


