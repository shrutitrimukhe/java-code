class PrimeN
{
   public static void main (String[] args)
   {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("Enter a range of prime numbers:");
	int low=sc.nextInt();
	int up=sc.nextInt();

	System.out.println("Prime Numbers are:");
	for(int n=low;n<=up;n++)
	{
		if(isPrime(n))
		{
		   	
		   System.out.println(n);
		}
	}
    }

  	static boolean isPrime(int num)
	{
	         if(num<=1)
			{
 		   	   return false;
			}	
	   for(int i=2;i<=num/i;i++)
	   {
		if(num%i==0)
		{
	           return false;
		}
	   }
	  return true;
	}
}	
	
	
	