package string;

public class ReverseString {

	public static void main(String[] args) {

		String s1 = "shruti";
		
		String reversedStr = "";
		
		for (int i = s1.length()-1;i>=0;i--)
		{
			reversedStr = reversedStr + s1.charAt(i);
		}
		
		System.out.println("Original s1: "+ s1);
		
		System.out.println("Reverse of given s1: "+ reversedStr);
	}

}
