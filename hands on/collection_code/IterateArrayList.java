/*
 * Q.WAP to iterate arrayList
 *Name:Shruti Trimukhe
 *Date:1-11-2022
 */
package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {

		ArrayList<String>color=new ArrayList<String>();
		color.add("Red");
		color.add("White");
		color.add("Black");
		color.add("Blue");
		 System.out.println("Arraylist color is: "+color);
		 
		//Calling iterator() method
			Iterator<String> obj = color.iterator();
			
			System.out.println("ArrayList using Iterator: ");
			while(obj.hasNext())
			{
				System.out.print(obj.next());
				System.out.print(",");
			}
			
		

	}

}
