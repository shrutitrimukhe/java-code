package Encapculation;



public class MainEncapsulation {

	public static void main(String[] args) {

		Encapculation e = new Encapculation();
		
		//calling setter method using object of class.
		e.setCarname("BMW");
		e.setprice(10000000);
		
		//calling getter method using object of class.
		
		System.out.println("Carname is " + e.getCarname());
		System.out.println("price is " + e.price());

	}

}
