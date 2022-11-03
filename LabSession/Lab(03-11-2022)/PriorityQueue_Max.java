/*
 * Q.5 Write a java program to change priority queue to 
 * maximum priority queue.(you can use any loop).
 * Name:Shruti Trimukhe
 * Date:30-11-2022
 */
package Practice;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Max {

	public static void main(String[] args) {
		
		//Using PriorityQueue class to create queue
				Queue<Integer> num = new PriorityQueue<>();
				//Offer elements to the queue
				num.offer(14);
				num.offer(22);
				num.offer(30);
				num.offer(5);
				num.offer(82);
				num.offer(2);
				num.offer(45);
				
				System.out.println("Queue is: "+num);
				
				System.out.println("Maximum Priority Queue is: ");
				
				Integer val = null;
				//Using While loop
				while((val=num.poll())!=null)
				{
					System.out.println(val+" ");
				}
				


		
	}

}
