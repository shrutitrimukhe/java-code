// Name : Shruti Trimukhe.

package Practice;

import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args) {

		//creating scanner class object to take the input from the user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		int i = sc.nextInt();
		
		System.out.println("Enter 2nd no: ");
		int j = sc.nextInt();
		
		sc.close();
		
		//writing operation
		int add,sub,mul,div,mod;
		
		add = i + j;
		sub = i - j;
		mul = i * j;
		div = i / j;
		mod = i % j;
		
		//printing values
		
		System.out.println("Addition: " + add);
		System.out.println("substraction: " + sub);
		System.out.println("multiplication: " + mul);
		System.out.println("division: " + div);
		System.out.println("modulus: " + mod);

		
	}

}
