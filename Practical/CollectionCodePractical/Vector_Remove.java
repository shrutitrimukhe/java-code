/*
 * Name:Shruti Trimukhe
 */
package Practice;

import java.util.Vector;

class Vector_Remove {

	public static void main(String[] args) {

		Vector<String> obj1 = new Vector<>();
		//Using the add() method
		obj1.add("Shruti");
		
		//Using index number
		obj1.add(1,"Jyoti");
		System.out.println("Vector: " + obj1);
		
		//Using Remove() Method
		String s = obj1.remove(1);
		System.out.println("Remove element: " + s);
		System.out.println("New Vector: " + obj1);
		
		//Using clear() method
		obj1.clear();
		System.out.println("Vector after: "+ obj1);
		
	}

}
