class Prime
{
     public static void main(String[] args)
     {
           java.util.Scanner sc = new java.util.Scanner(System.in);
           System.out.println("Enter a number");
           int number = sc.nextInt();
           if(isPrime(number))
        {
             System.out.println(number + " is prime number");
        }
        else
        {
             System.out.println(number + " is non-prime number");
        }
}
     static boolean isPrime(int num)
{
            if(num<=1)
        {
              return false;
        }
            for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
               return false;
        }
           return true;
}
}