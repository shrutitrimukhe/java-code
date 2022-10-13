/*Ques3:WAP to print sum of 10 natural numbers using while loop.
 * Name:Shruti Trimukhe
 * Date:13-10-2022
 */
package Practice;

import java.util.Scanner;
//create class
public class NaturalNo {
//Main method
	public static void main(String[] args) {

		 int x, i = 1 ;
	        int sum = 0;
	        System.out.println("Enter the Number :");
	        //Taking input from the user
	        Scanner sc = new Scanner(System.in);
	        x = sc.nextInt();
	        //condition
	        while(i <= x)
	        {
	            sum = sum +i;
	            i++;
	        }
	        System.out.println("Sum of "+x+" numbers is :"+sum);
	}

}
