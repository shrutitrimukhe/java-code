class Doctor
{
	String Name;
	String Degree;
	String Location;

	Doctor(String n,String d,String l)
	{
	  Name =n;
	  Degree =d;
	  Location= l;	
	}
	
	void displayData()
	{
	System.out.println("Name:"+Name +"  "+"Degree:"+Degree+"  "+"Location:"+Location);

	}
	
	public static void main(String[] args)
	{
	 Doctor  d1=new Doctor("Dr.shruti","MBBS","Navi mumbai");
	 Doctor  d2=new Doctor("Dr.jyoti","BHMS","Mumbai");
	 Doctor  d3=new Doctor("Dr.kalu","BDS","Kolkata");

	 d1.displayData();
	 d2.displayData();
	 d3.displayData();
	}
}