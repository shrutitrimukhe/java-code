package Practice;

import java.util.Vector;

class Vector_ex {

	public static void main(String[] args) {

		Vector<String> obj1 = new Vector<>();
		//Using the add() method
		obj1.add("Shruti");
		
		//Using index number
		obj1.add(1,"Jyoti");
		System.out.println("Vector: " + obj1);
		
		//Using addall() method
		Vector<String> obj2 = new Vector<>();
		obj2.add("hey");
		obj2.add("huiii");
		obj2.addAll(obj1);
		System.out.println("New Vector: " + obj2);
	}

}
