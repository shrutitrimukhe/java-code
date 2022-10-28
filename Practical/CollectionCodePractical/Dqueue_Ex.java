package Practice;

import java.util.ArrayDeque;
import java.util.Queue;

public class Dqueue_Ex {

	public static void main(String[] args) {

		ArrayDeque<String> obj1 = new ArrayDeque<>();
		obj1.add("shruti");
		obj1.add("jyoti");
		
		//using addfirst() method
		obj1.addFirst("Hello");
		
		//using addLast() method
		obj1.addFirst("hii");
		
		System.out.println("Array Dequeue: "+ obj1);
		

	}

}
