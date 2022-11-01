// Name:Shruti Trimukhe

package Encapculation;

public class PlayerEncapEx {
	
	String player_name;
	int player_age;
	String game_type;


  // Create a constructor and initialize the three parameters pName, pAge, and gameType. 
  /* public PlayerEncapEx(String player_name,int player_age,String game_type)
   {
	   this.player_name = player_name;
	   this.player_age = player_age;
	   this.game_type = game_type;
   } */
   //creating getter and setter method.
   
   public String getplayer_name()
   {
	   return player_name;
   }

   public void setplayer_name(String player_name)
   {
	   this.player_name = player_name;
   }
   
   public int getplayer_age()
   {
	   return player_age;
   }

   public void setplayer_age(int player_age)
   {
	   this.player_age = player_age;
   }
   
   public String getgame_type()
   {
	   return player_name;
   }

   public void setgame_type(String game_type)
   {
	   this.game_type = game_type;
   }
   
 }