/* Ques 1:WAP to demonstrate on nested if.Take the input from the user.
 * Name:Shruti Trimukhe.
 * Date:13-10-2022
 */
package Practice;

import java.util.Scanner;
//Create class
public class Grade {
//Main method
	public static void main(String[] args) {
//Taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Percentage to Check Grade");
		int prct = sc.nextInt();
		//condition
		if(prct>=90){
			
				System.out.println("grade A");
		}
		else if(prct>=84){
			
				System.out.println("grade A1");
		}
		else if(prct>=74){
			
				System.out.println("grade B");
		}
		else if(prct>=64){
				System.out.println("grade C");
			
		}
		else if(prct>=42){
			
				System.out.println("grade C");
		}
		
		else if(prct>=34){
			
				System.out.println("Fail");
		}
		
	}
}
	


