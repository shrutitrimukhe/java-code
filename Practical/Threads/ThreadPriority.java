package threads;

public class ThreadPriority extends Thread
{
	public void run()
	{
		System.out.println("Running thread priority is: "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) 
	{
		ThreadPriority p1 = new ThreadPriority();
		ThreadPriority p2 = new ThreadPriority();
		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(Thread.MAX_PRIORITY);
		p1.start();
		p2.start();
	}

}
