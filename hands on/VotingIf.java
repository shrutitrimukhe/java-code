/*Q.Test whether the person is eligible to give vote usine if else.
 * Name:Shruti Trimukhe 
 * Date:11-10-2022 */
package Practice;

import java.util.Scanner;

//creating class
public class VotingIf {

	public static void main(String[] args) {

		//Taking user input
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		//Checking condition for voting.
		if(age>=18)
        {
	    System.out.println("Congratulation "+name+",You are eligible for voting.");
	
        }
		else
		{
		System.out.println("Sorry "+name+", You are not eligible for voting.");	
		}
	}

}
