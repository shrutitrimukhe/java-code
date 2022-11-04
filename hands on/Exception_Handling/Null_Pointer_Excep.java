/*
 * Q.Perform the program null pointer exception
 * Name:Shruti Trimukhe
 * Date:04-11-22
 */
package Practice;

public class Null_Pointer_Excep {

	public static void main(String[] args) {

		try
		{
			Integer num=null; // null value
			System.out.println(num.intValue());
		}
catch(NullPointerException e)
		{
	System.out.println("NullPointerException =>" + e.getMessage());
		}

	}

}
