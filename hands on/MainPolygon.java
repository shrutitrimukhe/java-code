package Encapculation;

import java.util.Scanner;

//create class
class MainPolygon {

	//use main method
	public static void main(String[] args) {
		
		//use Scanner class to create object
		Scanner sc = new Scanner(System.in);
		
		//Enter length
		System.out.println("Enter length: ");
		
		//store input from user
		int a = sc.nextInt();
		
		//Enter breadth
		System.out.println("Enter breadth: ");
		
		//store input from user
		int b = sc.nextInt();
		
		//close object
		sc.close();
		
		//create object of rectangle
		Rectangle r = new Rectangle();
		r.getArea(a, b);

	}

}
