/*
 * Q.Write a java program to check if a particular element exists in a linked list.
 * Name:Shruti Trimukhe
 * Date:03-11-2022
 */
package Practice;

import java.util.LinkedList;

public class LinkedList_Check {

	public static void main(String[] args) {
		
		LinkedList<Integer> id = new LinkedList<>();
		
		//Using Add() method
		id.add(101);
		id.add(102);
		id.add(103);
		id.add(104);
		id.add(105);
		
		System.out.println("Student id is: "+id);
		
		//Check whether id 104 is exist or not
		if(id.contains(104))
		{
			System.out.println("Student id 104 is exists.");
		}
		else
		{
			System.out.println("Student id 104 does not exists.");
		}
		
		//Check whetger id 110 is exists or not
	    if(id.contains(110))
		{
			System.out.println("Student id 110 is exists.");
		}
		else
		{
			System.out.println("Student id 110 is does not exists.");
		}
		
	}

}
