/*Name:Shruti Trimukhe
 * Dare:14-10-2022
 */
package Practice;

import java.util.Scanner;

public class Singledimensionalarray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Taking input from the user(length of the array).
		System.out.println("Enter The lenghth of Array: ");
		int n = sc.nextInt();
		
		int a[]= new int[n];
		for(int i=0;i<a.length;i++) {
			//Loop for taling input from the user
			System.out.println("Enter "+i+"Number of the Array: ");
			int s = sc.nextInt();
			a[i]=s;
		}
		
		//Loop for printing output
		System.out.println("Array is[ ");
		for(int j=0;j<a.length;j++) {
			if(j==(n-1)) {
				System.out.println(a[j]+",");
			}
		}
		System.out.println("j");
			
	}
}
		

