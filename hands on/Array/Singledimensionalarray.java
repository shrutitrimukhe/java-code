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
		//Creating single dimension array a[] and passing the num and passing the length of array
		int a[]= new int[n];
		//Using for loop to add array is element
		for(int i=0;i<a.length;i++) {
			//Loop for taking input from the user
			System.out.println("Enter "+i+"Number of the Array: ");
			int s = sc.nextInt();
			a[i]=s;
		}
		
		//printing the single dimensional array
		System.out.println("Array is[ ");
		for(int j=0;j<a.length;j++) {
		    //if(j==(n-1)) {
				//System.out.println(a[j]+",");
			//}
		//}
	//	System.out.println("j");        
			
		}
	}
}
		

