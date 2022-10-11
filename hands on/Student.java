/* Q.Demostrate if else statement of 5 subject the person who gets above 60% will be passed otherwise failed. 
 * Output should be like :Enter your name,marks of 5 subject. 
 * Name:Shruti Trimukhe
 * Date:11-10-22 */
package Practice;

import java.util.Scanner;

//Create class
public class Student {

	//Main method
	public static void main(String[] args) {
		
		//Taking user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter total mark of all subject: ");
		double mark = sc.nextInt();
		
		double totalmark = 500;
		
		//check whether student pass or not
		if(mark<300)
		{
			System.out.println("Sorry you are fail,Hard luck....");
		}
		else
		{
			System.out.println("Congratulation "+name+" You are pass.");
		}

		
	}

}
