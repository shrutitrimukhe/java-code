package threads;

class Multithread_Ex implements Runnable
{

	public static void main(String[] args) 
	{
		Thread t1 = new Thread("Demo1");
		Thread t2 = new Thread("Demo2");
		t1.start();
		t2.start();
		System.out.println("Thread names are following: ");
		System.out.println(t1.getName());
		System.out.println(t2.getName());

	}
	@Override
	public void run()
	{
		
	}

}
