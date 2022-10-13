/* Ques4:WAP to print sum of only positive numbers using do-while loop. Take the input from the user.
 *  if the user enters any negative number then that number should not be added in sum.
 *  Name:Shruti Trimukhe
 *  Date:13-10-2022
 */
package Practice;

import java.util.Scanner;

public class PosiNo {

	public static void main(String[] args) {

		  int sum = 0;
		    int num = 0;

		    // create an object of Scanner class
		    Scanner input = new Scanner(System.in);
			   
		    // do-while loop continues 
		    // until entered number is positive
		    do {
		      // add only positive numbers
		      sum += num;
		      System.out.println("Enter a number");
		      num = input.nextInt();
		    } while(num >= 0); 
			   
		    System.out.println("Sum = " + sum);
		    input.close();
		  }
		
	}


