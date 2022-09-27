package casting;

public class Player_Main {

	public static void main(String[] args) {

		Player p1 = new Cricketer();     //up-casting AUTOMATIC
		
		p1.stadium();
		p1.jersy();
		
		if(p1 instanceof Cricketer)
		{
			((Cricketer) p1).bat();        //Down-casting in non automatic
		}
		
		p1 = new Footballer();
		
		p1.stadium();
		p1.jersy();
		
		
		if(p1 instanceof Footballer)
		{
			((Footballer) p1).goal();
		}
	}

}
