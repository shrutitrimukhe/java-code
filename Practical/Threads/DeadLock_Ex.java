package threads;

class DeadLock_Ex
{
	private final String name;
	public DeadLock_Ex(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public synchronized void call(DeadLock_Ex caller)
	{
		System.out.println(this.getName()+" has asked to call me "+ caller.getName());
		try 
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		caller.callMe(this);
	}
	public synchronized void callMe(DeadLock_Ex caller)
	{
		System.out.println(this.getName()+" has called me "+ caller.getName());
	}

	public static void main(String[] args)
	{
		DeadLock_Ex c1 = new DeadLock_Ex("caller-1");
		DeadLock_Ex c2 = new DeadLock_Ex("Caller-2");
		
		new Thread(new Runnable() {
			public void run() { c1.call(c2);}
		}).start();
		
		new Thread(new Runnable() {
			public void run() { c2.call(c1);}
		}).start();


	}

}
