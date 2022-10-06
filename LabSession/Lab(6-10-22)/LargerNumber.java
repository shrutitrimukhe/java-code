/* Create a program to find largest of two numbers
 * Name: shruti
 * Date:6-10-22
 */

package lab;
  //import
	import java.util.Scanner;
	// Create class
	public class LargerNumber
	{
	//main method
	   public static void main(String[] args)
	   {
	      int numberOne, numberTwo, largest;
	      Scanner scan = new Scanner(System.in);
	//Enter first nunber      
	      System.out.print("Enter the First Number: ");
	      numberOne = scan.nextInt();
	//Enter second number     
	       System.out.print("Enter the Second Number: ");
	      numberTwo = scan.nextInt();
	//use if-else   
	      if(numberOne>numberTwo)
	         largest  = numberOne;
	      else
	         largest = numberTwo;
	//Print the output      
	      System.out.println("\nLargest = " +largest );
	   }
	}


