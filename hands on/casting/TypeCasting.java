/*Name:Shruti Trimukhe.
 * Date:14-10-2022
 */
package Practice;

import java.util.Scanner;
//Create class
public class TypeCasting {
//main method
	public static void main(String[] args) {
		
		//Taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:  ");
        int a = sc.nextInt();
		int i = 100;
		//no explict type cast required
		long l = i;
		//no explict type cast required
		float f = l;
		
		System.out.println("int value" + i);
		System.out.println("long value:" +l);
		System.out.println("float value:" +f);
		
	}

}
