package Encapculation;

public class Main_PlayerEncapEx {

	public static void main(String[] args) {

		PlayerEncapEx p = new PlayerEncapEx();
		
		//calling setter method using object of class.
	 
		p.setplayer_name("Dhoni");
		p.setplayer_age(37);
		p.setgame_type("Cricket");
		
		//calling getter method using object of class
		
		System.out.println("Player name is: "+p.getplayer_name());
		System.out.println("Player age is: "+p.getplayer_age());
		System.out.println("The game type of player is: "+p.getgame_type());
				
	}

}
