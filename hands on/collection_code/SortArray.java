/*
 * Q.WAP to sort arraylist in descending order
 * Name:Shruti trimukhe
 * Date:1-11-2022
 */
package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		
		ArrayList<Integer>num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		 System.out.println("Arraylist num is: "+num);
		 
		 Collections.sort(num, Collections.reverseOrder());
		  
	        // Print the sorted ArrayList
	        System.out.println("Sorted ArrayL in Descending order : " + num);
		
	}

}
