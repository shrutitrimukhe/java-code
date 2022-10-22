/*
 * Name:Shruti Trimukhe
 */
package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Taking input from the user
		System.out.println("Enter the color name: ");
		String a = sc.nextLine();
		//Creatingarray list
		ArrayList<String> a1 = new ArrayList<String>();
		//Add
		a1.add(a);
		//Print the output
		System.out.println(a1);

		
	}

}
