package lab3;

public class Town
{
  
	public static void main(String[] args) 
	{
		
				float p1,p2;
				
				p1 = 175000;
				p2 = 262500;
				
				float decade = 10;
				
				float equation = p2-p1;
				float percent = equation/p1*100;
				
				float ans = percent/decade;
				
				System.out.println("Average percent increase population per year is "+ans+" %");
				
	}
}
