/*
 * If a class extends the thread class,the thread can be run by creating an instance of the class
 * and call its start() method.
 */
package threads;

public class Main extends Thread{

	public static void main(String[] args) {
		
		Main thread = new Main(); //create object of class main.
		thread.start();
		System.out.println("This code is outside of the thread");
	}
	public void run()
	{
		System.out.println("This code is running in the thr thread");
	}
}
