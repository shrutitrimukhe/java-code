/*
 * Q.Write a java Program to replace the second element of arraylist with the specified element.
 * Name:Shruti Trimukhe
 * Date:03-11-2022 
 */
package Practice;

import java.util.ArrayList;

public class Replace_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> color = new ArrayList<>(); 
		
		//Using Add() method
		color.add("Red");
		color.add("Black");
		color.add("White");
		
		System.out.println("Color is: "+color);
		
		//Using set() method
	    color.set(0, "Pink");
	    
	    //Print the Updated color
	    System.out.println("Updated color list is: "+color);
		
	}

}
