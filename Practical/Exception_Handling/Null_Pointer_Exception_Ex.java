package Practice;

public class Null_Pointer_Exception_Ex {

	public static void main(String[] args) {

		try
		{
			String s=null; // null value
			System.out.println(s.charAt(0));
		}
catch(NullPointerException e)
		{
	System.out.println("NullPointerException =>" + e.getMessage());
		}
	}

}
