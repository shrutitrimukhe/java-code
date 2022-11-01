package Encapculation;

public class Main_SchoolBagEncapEx {

	public static void main(String[] args) {

		SchoolBagEncapEx s = new SchoolBagEncapEx();
		
		//calling setter method using object of class.
 
		s.setbook("Science");
		s.setpen("Black");
		
		//calling getter method using object of class.

		System.out.println("Book is: " + s.getbook());
		System.out.println("Color Pen which allow for book is: " + s.getpen());
		
	}

}
