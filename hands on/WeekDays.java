/*Q.Program to demonstrate switch and printing week days
 * Name:Shruti Trimukhe
 * Date:11-10-2022
*/ 
package Practice;


import java.util.Scanner;
//create class
public class WeekDays {

	public static void main(String[] args) {
         //Taking input from user
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a weekday number :");

	        int weekday = sc.nextInt();

	        switch (weekday) {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            case 4:
	                System.out.println("Thursday");
	                break;
	            case 5:
	                System.out.println("Friday");
	                break;
	            case 6:
	                System.out.println("Saturday");
	                break;
	            case 7:
	                System.out.println("Sunday");
	                break;
	            default:
	                System.out.println("Invalid");
	                break;
	        }
	}

}
