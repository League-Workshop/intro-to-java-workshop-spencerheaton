package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		Random ranGen=new Random();
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int PD = 7;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int DD = 14;
		
		JOptionPane.showMessageDialog(null, "Punches can deal damage from 5 - 15 \n Kicks deal anywhere from 0 - 25");
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
			JOptionPane.showMessageDialog(null, "New round \n Your Health: "+playerHealth+"\n Dragon Health:"+dragonHealth);
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String AC = JOptionPane.showInputDialog("Would you like to Punch or Kick?");
		// 9. If they typed in "yell":
		if(AC.equalsIgnoreCase("punch")) {
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			PD = ranGen.nextInt(10)+5;
			//-- Subtract that number from the dragon's health variable 
		dragonHealth-=PD;
		JOptionPane.showMessageDialog(null,"your attack did: "+PD+"\n Dragon Health:"+dragonHealth);
		}
		// 10. If they typed in "kick":
		if(AC.equalsIgnoreCase("kick")) {
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			PD = ranGen.nextInt(26);
			//-- Subtract that number from the dragon's health variable
			dragonHealth-=PD;
			JOptionPane.showMessageDialog(null, "your attack did: "+PD+"\n Dragon Health:"+dragonHealth);
		}
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		DD = ranGen.nextInt(36);
		// 12. Subtract this number from the player's health
		playerHealth-=DD;
		JOptionPane.showMessageDialog(null, "The Dragon's attack did: "+DD+"\n Your Health:"+playerHealth);
		}
		
		
		// 13. If the user's health is less than or equal to 0
		if(playerHealth <= 0) {
			JOptionPane.showMessageDialog(null, "you lose!");
		}
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		if(dragonHealth<= 0) {
			JOptionPane.showMessageDialog(null, "you win the GOLD!");
		}
			//-- Tell the user that the dragon is dead and they took a ton of gold!
		else {
	   //  15.  Else
			JOptionPane.showMessageDialog(null, "Final Score \nYour Health:" + playerHealth + "\n Dragon Health:" + dragonHealth);}
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		}
		}
	

