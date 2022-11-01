package casting;

public class PrimitiveDTCasting {

	public static void main(String[] args) {
		
		
		int i = 10;
		double d = 20.54;
		
		int ii= 15;
		double dd = 25.55;
		
		//i = d;       // higher type value storing to small type value= known as narrowing 
		              // non automated convert

		
		d = i;      // small type value storing to higher type value= known as widening 
		            //automatic convert
		
		ii = (int)dd;   //casting
		
		
		
		System.out.println(d);
		System.out.println(ii);

	}

}
