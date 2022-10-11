/*Q.Print any multiplication table using for loop.
 * Name:Shruti Trimukhe 
 * Date:11-10-2022 */
package Practice;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

	
		//Taking user input
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter number: ");       
		int num=sc.nextInt();  
		
		//loop start execution form and execute until the condition i<=10 becomes false  
		for(int i=1; i <= 10; i++)  
		{  
		
		//prints table of the entered number      
		System.out.println(num+" * "+i+" = "+num*i);  
		}  
		
	}

}
