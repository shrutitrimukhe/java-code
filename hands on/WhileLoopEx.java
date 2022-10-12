/* Q.Program to demostrate while loop continue until entered number is positive. Take the input from 
 * the user.
 * Name:Shruti Trimukhe.
 * Date:12-10-2022     */
 
package Practice;

import java.util.Scanner;

public class WhileLoopEx {

	public static void main(String[] args) {

		//Taking input from the user.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:  ");
		int num = sc.nextInt();
		sc.close();
		
		int sum = 0;
		
		//Test condition.
		while(num >= 0)
		{
			sum +=num;
			System.out.println("This is java program ");
	        break;
		}
		
		
		
	}

}
