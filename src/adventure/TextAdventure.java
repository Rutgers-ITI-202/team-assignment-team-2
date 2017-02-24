/*
This class:
•	Contains the main method used to start the game.
•	Talks to the AdventureModel and to the Adventurer classes, as needed.
*/

import java.util.*;
public class TextAdventure {

	public static int location = 0;
	public static Scanner sc;
	
	public static void main(String[] args){
		
		sc = new Scanner(System.in);
		AdventureModel.startGame();
		
		
		//To show player's location --- Bunks programmed in part two.
		System.out.println("To the left is the door to the bunks. Enter 1 to\n"
				+ "stay in the command room, and 2 to enter the bunks. \n\n> ");

		
		
		int intInput = sc.nextInt();
		
		
		
		//switch statement for room location
		switch(intInput){
				case 1:
					location = 1;
					AdventureModel.commandRoom();
					//shows item is in inventory
					Adventurer.showInventory();
					break;
				case 2:
					System.out.println("This part is not programmed yet\n\n");
					break;
				default: System.out.println("You have entered an invald command\n\n");
				
		}
		
	}
	
	
}



