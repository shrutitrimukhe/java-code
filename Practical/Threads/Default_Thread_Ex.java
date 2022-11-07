package threads;

public class Default_Thread_Ex extends Thread {

	public static void main(String[] args)
	{
		Thread t1 = new Thread();
		t1.start();
		
		System.out.println("Thread has been created with name: "+t1.getName());
    }

}
