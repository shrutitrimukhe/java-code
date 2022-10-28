package Practice;

import java.util.Stack;

class Stack_Ex {

	public static void main(String[] args) {

		Stack<String> obj1 = new Stack<>();
		obj1.push("Shruti");
		obj1.push("jyoti");
		
		System.out.println("Stack Value: " + obj1);
		
		//pop element from the top
		obj1.pop();
		System.out.println("Stack after pop: " + obj1);
	}

}
