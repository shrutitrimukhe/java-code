package inheritance;

public class  LocalReastuarent extends SaiReastuarent {
	
	int discountamt = 150;
	
	void totalPrice()
	{
		System.out.println(super.price-discountamt);
	}

}
