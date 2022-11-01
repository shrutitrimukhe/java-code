/*
 * creating linkedHashset from arrayList
 */
package Practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashset_ex1 {

	public static void main(String[] args) {

		ArrayList<Integer> obj1 = new ArrayList<>();
		
		//Using add() method
		obj1.add(40);
		obj1.add(30);
		obj1.add(50);
		
		System.out.println("Array list is: "+obj1);
		
		//creating hashset from an arrayList
		
		LinkedHashSet<Integer> obj2 = new LinkedHashSet<>(obj1);
		
		System.out.println("Linkedhashset is: "+obj2);
	}

}
