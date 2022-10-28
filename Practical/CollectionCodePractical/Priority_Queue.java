package Practice;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

	public static void main(String[] args) {


		//Using PriorityQueue class to create queue
		Queue<Integer> obj1 = new PriorityQueue<>();
		//Offer elements to the queue
		obj1.offer(1);
		obj1.offer(22);
		obj1.offer(3);
		System.out.println("Queue is: "+obj1);
		
		//Access element queue using peek() method
		int i = obj1.peek();
		System.out.println("Access element: "+i);
		
		//Remove element from the queue using poll() method
		int j = obj1.poll();
		System.out.println("Removed element: "+j);
		
		System.out.println("The updated queue is: "+obj1);

	}

}
