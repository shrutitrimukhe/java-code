package inheritance;

public class College {
	
	String col_name;
	String location;
	String university;
	
	public College(String col_name,String location,String university)
	{
		this.col_name=col_name;
		this.location=location;
		this.university=university;
	}
	
	void getlocation(String city)
	{
		System.out.println("location is : " + location + "and city is : " + city);
	}

}
