/* Interface program
* name:shruti
* date:7/10/22
*/
package Encapculation;

interface Polygon {
	
	//abstract method of interface.
	void getArea(int length, int breadth);
	
}

//implement the polygon interface
class Rectangle implements Polygon{
	
	//implementation of abstract method
	public void getArea(int length, int breadth)
	{
		System.out.println("The area of rectangle is: " + (length*breadth));
	}
	
}
