class Employee
{
	String name;
	String email;
	
	static String company_name;
	static int salary;

	void displayData()
	{
	 System.out.println(name +" "+email);
	}

	static String completedTargets()
	{ 
	return "completed targets quickly" ;
 	}

	void AttendingMeetings(String s)
	{
		System.out.println(s);
	}

      public static void main(String[] args)
	{
	
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();

		e1.name="shruti";
		e1.email="shruti@gmail.com";

		e2.name="ritesh";
		e2.email="ritesh@gmail.com";

		e3.name="hello";
		e3.email="hello@gmail.com";

		e1.displayData();
		e2.displayData();
		e3.displayData();
		
		e1.AttendingMeetings("with very seriousness");
		e2.AttendingMeetings("attending meetiing but not work properly");
		e3.AttendingMeetings("not attending meetings");

		System.out.println(Employee.completedTargets());
	}
}