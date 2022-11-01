package stringcode;

import java.util.Scanner;

//create class

class Main_Ovelo {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			//get input from user
			System.out.println("Enter three number : ");
			
			//input stored
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			
		//print the output
			System.out.println("Addition of first two number is:"+ArthmaticOverloading.add(x, y));  
		    System.out.println("Addition of three number is:"+ArthmaticOverloading.add(x, y, z)); 

		

	}

}
