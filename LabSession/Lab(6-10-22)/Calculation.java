/*create a program for calculation.read three values from the user for operation first and second values are operands. third value is operator.
 * if user press1=>print addition of first and second ,if user press2=>print substraction of first and second,if user press3=>print multiplication of first and second
 * if user press4=>print division of first and second 
 * Name:shruti
 * Date : 6-10-22
 */
package lab;

	import java.util.Scanner;
	//Creating class
	public class Calculation
	 {
		public static void main(String[] args)
		 {
	//creating variable
	int a,b,c;
	int add;
	int sub;
	int mul;
	int div;

	//Creating scanner object

	Scanner sc = new Scanner(System.in);
	//taking first value from the user

	System.out.println("Enter the first value");
	a=sc.nextInt();

	//taking second value from the user
	System.out.println("Enter the second value");
	b=sc.nextInt();

	//Give choice to user
	System.out.println("Enter 1: If you want to addition");
	System.out.println("Enter 2: If you want to subtraction");
	System.out.println("Enter 3: If you want to multiplication");
	System.out.println("Enter 4: If you want to Division");
	c=sc.nextInt();

	//use Ifelse
	if  (c==1)
	{
	add = a+b;
	System.out.println("The addition of a and b is" +add);
	}
	else if(c==2)
	{
	sub = a-b;
	System.out.println("The subatraction of a and b is" +sub);
	}
	else if(c==3)
	{
	mul = a*b;
	System.out.println("The multiplication of a and b is" +mul);
	}

	else if(c==4)
	{
	div = a/b;
	System.out.println("The division of a and b is" +div);
	}
	else
	{
		System.out.println("Invalid input");
	}
}
}

