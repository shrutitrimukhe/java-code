/* Q.1 Write a program in Ascending and Descending order taking input from the user.
 * Name:Shruti Trimukhe
 * Date:20-10-22
 * 
 */
package Practice;

import java.util.Scanner;

public class AcenDecending_Order {

	public static void main(String[] args) {
		
		int i,j,k;
		//Taking input from the user
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in array: ");
		int m = sc.nextInt();
	
		int array [] = new int[m];
		
		System.out.println("Enter elements:");
        //use for loop
		for(i=0;i<m;i++)
		{
			array[i]=sc.nextInt();
		}
		for(i=0;i<m;i++)
		{
			for(j=i+1;j<m;j++)
			{
				if(array[i]>array[j]) {
					k=array[i];
					array[i]=array[j];
					array[j]=k;
				}
			}
		}
		//Print Ascending order
		System.out.println("Arrays in Acending order: ");
		for(j=0;j<m;j++)
		{
			System.out.println(array[j]);
		}
		for(i=0;i<m;i++)
		{
			for(j=i+1;j<m;j++)
			{
				if(array[i]<array[j])
				{
					k=array[i];
					array[i]=array[j];
					array[j]=k;

				}
			}
		}
		//Print Descending order
		System.out.println("Arrays in Decending Order: ");
		for(j=0;j<m;j++)
		{
			System.out.println(array[j]);
		}
		
	}

}
