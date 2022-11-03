/*
 * Q.Write a java program to compare two sets and retain elements which are 
 * same on both sets.(user retainAll method)
 * Name:Shruti Trimukhe
 * Date:03-11-2022
 */
package Practice;

import java.util.HashSet;

public class Set_RetainEx {

	public static void main(String[] args) {
		
		//Creating First Set
		HashSet<String> car = new HashSet<>();
		
		//Using add() method
		car.add("BMW");
		car.add("Audi");
		car.add("Toyota");
		car.add("Fortuner");
		car.add("Wagnar");
		
		System.out.println("First HashSet is: "+car);
		
		//creating second set
		HashSet<String> car1 = new HashSet<>();
		
		//Using add() method
		car1.add("BMW");
		car1.add("Audi");
		car1.add("Toyota");
		car1.add("Fortuner");
		
		//Print same elements in both sets using retainAll() method
		car.retainAll(car1);
		//Print the same element.
		System.out.println("Same elements are: "+car1);

		
	}

}
