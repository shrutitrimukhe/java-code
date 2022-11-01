package inheritance;

public class Reastuarent_Main {

	public static void main(String[] args) {

		FiveStarReastuarent f1 = new FiveStarReastuarent();
		
		LocalReastuarent r1 = new LocalReastuarent();
		
		
		System.out.println("For FiveStar : " + (f1.price + f1.extraamt));
		System.out.println("For Local : " + (r1.price - r1.discountamt));
		

		r1.totalPrice();
		
	}

}
