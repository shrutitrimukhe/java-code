/* Q. Check user age and see he/she will be adult/not adult/senior citizen.
 * Name:Shruti Trimukhe
 * Date:11-10-2022
 */

package Practice;

import java.util.Scanner;
//Create class
public class SwitchEx {
//Main method	     
 public static void main(String args[])  
 {            
	         //Taking input from user
	    	  Scanner sc = new Scanner(System.in);
	    	  
	    	   System.out.println("Enter your age: ");
	    		  int a = sc.nextInt();
	    	  
	            Integer age = a;        
               //
	            switch (a)  
              {  
                  case (16):            

	                    System.out.println("You are not an adult.");  

	                    break;  

	                case (18):                

	                    System.out.println("You are an adult.");  

	                    break;  

	                case (65):                

	                    System.out.println("You are senior citizen.");  

	                    break;  

	                default:  

	                    System.out.println("Please give the valid age.");  

	                    break;  

	            }             

	      }

}



