// Name : Shruti Trimukhe.
//Date:10-10-22

package Practice;

import java.util.Scanner;

public class AssighnmentOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no:  ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd no: ");
		int num2 = sc.nextInt();
		
		sc.close();
		
		//Adding and assigning value
		num1+=num2;
		System.out.println("num1= " + num1);
		
		num1-=num2;
		System.out.println("num1= " + num1);
		
		num1*=num2;
		System.out.println("num1= " + num1);

		num1/=num2;
		System.out.println("num1= " + num1);
		
		num1%=num2;
		System.out.println("num1= " + num1);



		
		

	}

}
