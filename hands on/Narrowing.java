/*Name:Shruti Trimukhe.
 * Date:14-10-2022
 */
package Practice;

import java.util.Scanner;

public class Narrowing {

	public static void main(String[] args) {

		double d = 100.04;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		d=sc.nextInt();
		//explicit type casting required.
		
		long l =(long)d;
		//explicit type casting required.
		
		int i = (int)l;
		//explicit type casting required.
		System.out.println("double value: "+ d);
		System.out.println("long value: "+ l);
		System.out.println("int value: "+ i);

	}

}
