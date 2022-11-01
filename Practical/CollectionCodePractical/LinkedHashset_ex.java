/*
 * Linked hashset is an ordered  and sorted collection of hashset and it maintains the insertion order 
 * of the element.
 */
package Practice;

import java.util.*;

public class LinkedHashset_ex {

	public static void main(String[] args) {

		LinkedHashSet<String> obj1 = new LinkedHashSet<>();
		
		//using add() method
		obj1.add("shruti");
		obj1.add("jyoti");
		obj1.add("mini");
		
		System.out.println("LinkedHashset is: "+obj1);
		
		//calling iterator() method
		Iterator<String> obj2 = obj1.iterator();
		
		System.out.println("LinkedHashset using iterator: ");
		while(obj2.hasNext())//Hashset is method to check next value in the array
		{
			System.out.print(obj2.next());
			System.out.print(",");
		}
		
		
	}

}
