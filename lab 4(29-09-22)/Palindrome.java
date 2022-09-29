package lab4;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		String value="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to check if it is a palindrome :");
	   String  input = sc.nextLine();
	     
	     int length = input.length();
	     sc.close();
	    
	    	    
	    for(int i= length-1; i>=0; i--) 
	    	
	    	 value = value+input.charAt(i);
	    
	    	if(input.equals(value))
	    	
   				System.out.println("string is palindrome.");
   				
   		else
   					
   				System.out.println("string is not palindrome.");
	    
	}

}
