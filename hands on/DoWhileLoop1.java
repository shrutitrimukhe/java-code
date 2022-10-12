/* Q.Program to demonstrate do-while and print the reverse counting from the user input number.
 * Name:Shruti Trimukhe
 * Date:12-10-2022
 */
package Practice;

import java.util.Scanner;
//Create class
public class DoWhileLoop1 {

	public static void main(String[] args) {
		
		int n = 0,rev=0;
		//Taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:  ");
		int num = sc.nextInt();
		sc.close();
		//condition 
		do
		{
			int a1 = n%10;
			rev = rev*10 + a1;
			n = n/10;
		}
		
		//Test condition.
		while(num>0);
		
		System.out.println("Reversr no is: " + rev);
	

	}

}
