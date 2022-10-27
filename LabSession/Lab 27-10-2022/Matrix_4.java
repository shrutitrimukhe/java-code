/*Q.1 Write a program to perform 4*4 matrix take input from the user.
 * Name:Shruti Trimukhe
 * Date:27-10-2022
 */
package Practice;

import java.util.Scanner;

public class Matrix_4 {

	public static void main(String[] args) {
		
		int m, n, i, j;   
		Scanner sc=new Scanner(System.in);   
		System.out.print("Enter the number of rows: ");   
		//taking row as input  
		m = sc.nextInt();   
		System.out.print("Enter the number of columns: ");   
		//taking column as input  
		n = sc.nextInt();   
		// Declaring the two-dimensional matrix   
		int array[][] = new int[m][n];   
		// Read the matrix values   
		System.out.println("Enter the elements of the array: ");   
		//loop for row  
		for (i = 0; i < m; i++)   
		//inner for loop for column  
		for (j = 0; j < n; j++)   
		array[i][j] = sc.nextInt();   
		//accessing array elements   
		System.out.println("Elements of the array are: ");   
		for (i = 0; i < m; i++)   
		{   
		for (j = 0; j < n; j++)   
		//prints the array elements  
		System.out.print(array[i][j] + " ");   
		
		System.out.println();   
		}   

	}
}
