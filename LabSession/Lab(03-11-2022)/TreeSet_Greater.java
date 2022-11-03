/*
 * Q.4Write a java program to get the element in a tree set which are strictly greater than or
 * equal to the given element.
 * Name:Shruti Trimukhe
 * Date:03-11-2022
 */
package Practice;

import java.util.TreeSet;

public class TreeSet_Greater {

	public static void main(String[] args) {
		
		TreeSet<Integer> num = new TreeSet<Integer>();
		
		//Using add() method
		num.add(50);
		num.add(28);
		num.add(46);
		num.add(13);
		num.add(60);
		
	    System.out.println(num.higher(10));
		
	}

}
