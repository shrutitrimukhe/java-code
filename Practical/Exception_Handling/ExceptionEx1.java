package Practice;

public class ExceptionEx1 {

	//creating static dividebyzero() method
	public static void dividebyzero()
	{
		//throw an exception
		throw new ArithmeticException("Trying to divide by 0");
	}
		public static void main(String[] args)
		{
			dividebyzero();

		}
}


