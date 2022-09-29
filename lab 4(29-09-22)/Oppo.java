package lab4;

public class Oppo {
	
	String RAM_Size;
	String Color_type;
	
	public Oppo(String ram_size,String color_type)
	{
		super();
		RAM_Size = ram_size;
		Color_type = color_type;
	}

	void display()
	{
		System.out.println("RAM_Size :" +RAM_Size+" "+"color is " +Color_type );

		
	}
}
