/*Q.2 Write a program to enter even number in array and print in ascending order
 * Name:Shruti Trimukhe
 * Date:20-10-22
 */
package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingEvenArray {

	public static void main(String[] args) {
        //Taking input from the user
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Even number in array: ");
		int n = sc.nextInt();
		
		    int s[] = new int[n];
		    System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            int n1 = sc.nextInt();
	            s[i] = n1;
	        }

	        Arrays.sort(s);
	        // Even number in ascending
	        System.out.println("Even numbers in ascending order:");
	        for (int j = 0; j < n; j++) {

	            if (s[j] % 2 == 0) {
	                System.out.print(s[j] + " ");
	            }
	        }
	}

}
