/**
 * 
 * @author Corey Yelo, Angelo Ciaramello, Alexia Melhado
 * @version 2.0
 * @since 2/24/2017
 * 
 * This is the code for Space Isolation text adventure game.
 */

import java.util.*;


/**
 * 
 * 
 * The TextAdventure class contains the main method, and calls methods from
 * the other classes. This is where the program actually runs.
 * 
 */
public class TextAdventure {
	
	
	
	/**
	 * This is the main method.  Aside from declarations and
	 * some introductory code, the TextAdventure class contains the Movement statements
	 * and Command statements (Interact, Use, Look).
	 * @param args
	 */
	public static void main(String[] args){
		
		int width = 3;
		int height = 4;
		Map[][] map = new Map[width][height];
		AdventureModel.createMap(map);
		int x = 1;
		int y = 0;
		//intro message
		System.out.println("Welcome to Space Isolation! In this game you control an\n"
				+ "unspecified astronaut, stranded on your spaceship which has lost all power.\n"
				+ "Your mission is to escape the ship alive.\n\n\n "
				+ "COMMANDS:\n"
				+ "Directions - North, South, East, West\n"
				+ "Interact\n"
				+ "Look\n"
				+ "Use\n\n");
		
		AdventureModel.printRoom(map, x, y);
		
		//Creates inventory
		ArrayList<String> inventory = new ArrayList<>();
		
		
		
		//begin
		boolean winGame = false;
		System.out.println(x + " "+ y);
		while(!winGame){
			
			String textInput = AdventureModel.getInput();
					
			
			
			
			//movement
			if(textInput.equalsIgnoreCase("north")){
			//	System.out.println(x + ' ' + y);
				if(x==2 & y == 2){
					System.out.println("You cannot go in that direction.");
				}
				else if (y < 3) {
					y++;
					AdventureModel.printRoom(map, x, y);
				}
				else{
					System.out.println("You cannot go in that direction.");
				}
			}
			else if(textInput.equalsIgnoreCase("south")){
			//	System.out.println(x + ' ' + y);
				if(x == 2 & y == 1){
					System.out.println("You cannot go in that direction.");
				}
				else if (y > 0) {
					y--;
					AdventureModel.printRoom(map, x, y);
				}
				else{
					System.out.println("You cannot go in that direction.");
				}
			}
			else if(textInput.equalsIgnoreCase("east")){
				//System.out.println(x + ' ' + y);
				if(x==1 && y == 3 || x == 1 && y == 0){
					System.out.println("You cannot go in that direction.");
				}
				else if (x < 2) {
					x++;
					AdventureModel.printRoom(map, x, y);
				}
				else{
					System.out.println("You cannot go in that direction.");
				}
			}
			else if(textInput.equalsIgnoreCase("west")){
				//System.out.println(x + ' ' + y);
				if (x > 0) {
					x--;
					AdventureModel.printRoom(map, x, y);
				}
				else{
					System.out.println("You cannot go in that direction.");
				}
			}
			
			
			
			else if(textInput.length() > 9 && textInput.substring(0,9).equalsIgnoreCase("interact ")){
				if(textInput.substring(0, textInput.indexOf(' ')).equalsIgnoreCase("interact")){
					if(textInput.substring(textInput.indexOf(' ')).length() > 1){
						if(x == 1 && y == 0 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" helmet")){
							String item = textInput.substring(textInput.indexOf(' ') + 1);
							Adventurer.Inventory(x, y, item, inventory, map);
						}
						if(x == 0 && y == 0 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" gun")){
							String item = textInput.substring(textInput.indexOf(' ') + 1);
							Adventurer.Inventory(x, y, item, inventory, map);
						}
						if(x == 0 && y == 0 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" flashlight")){
							String item = textInput.substring(textInput.indexOf(' ') + 1);
							Adventurer.Inventory(x, y, item, inventory, map);
						}
						if(x == 1 && y == 1 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" keycard")){
							String item = textInput.substring(textInput.indexOf(' ') + 1);
							Adventurer.Inventory(x, y, item, inventory, map);
						}
						if(x == 2 && y == 1 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" medkit")){
							String item = textInput.substring(textInput.indexOf(' ') + 1);
							Adventurer.Inventory(x, y, item, inventory, map);
						}
						if(x == 2 && y == 2 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" instructions")){
							//String item = textInput.substring(textInput.indexOf(' ') + 1);
							//Adventurer.Inventory(x, y, item, inventory, map);
							System.out.println("The escape pod instructions list the numbers 3 4 1 2 and before the page becomes unreadable.");
						}
						if(x == 0 && y == 2 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" headset")){
							//String item = textInput.substring(textInput.indexOf(' ') + 1);
							//Adventurer.Inventory(x, y, item, inventory, map);
							System.out.println("The voice you hear over the headset lists the numbers 1 1 4 2 as well as something about a blue key.");
						}
						if(x == 1 && y == 2 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" button")){
							String item = textInput.substring(textInput.indexOf(' ') + 1);
							Adventurer.Inventory(x, y, item, inventory, map);
						}
						if(x == 0 && y == 3 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" bkey")){
							String item = textInput.substring(textInput.indexOf(' ') + 1);
							Adventurer.Inventory(x, y, item, inventory, map);
						}
						if(x == 1 && y == 3 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" controls")){
							String item = textInput.substring(textInput.indexOf(' ') + 1);
							Adventurer.Inventory(x, y, item, inventory, map);
						}
						if(x == 1 && y == 3 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" controls34121142bkey")){
							winGame = true;
						}
					}
				}
			}
			
			else if(textInput.length() > 4 && textInput.substring(0,4).equalsIgnoreCase("use ")){
				if(textInput.substring(0, textInput.indexOf(' ')).equalsIgnoreCase("use")){
					if(textInput.substring(textInput.indexOf(' ')).length() > 1){
						if(x == 1 && y == 0 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" helmet")){
							System.out.println("You have put the helmet on your head.");
						}
						if(textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" medkit")){
							System.out.println("You have used to medkit to heal your wounds.");
						}
						if(x == 2 && y == 2 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" gun")){
							System.out.println("You have shot the monster and killed it, but it managed to slice open your arm on its way down.\n" +
									"You may die soon if the wound is left untreated.");
						}
						if(x == 0 && y == 2 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" keycard")){
							System.out.println("You have used the keycard to unlock the door to the Airlock");
						}
						if(x == 1 && y == 1 && textInput.substring(textInput.indexOf(' '), textInput.length()).equalsIgnoreCase(" flashlight")){
							System.out.println("You have revealed the Keycard using the Flashlight.");
						}

					}
				}
			}
			
			//look statement
			else if(textInput.equalsIgnoreCase("look")){
				AdventureModel.printRoom(map, x, y);	
			}
			
			
			
		}
		System.out.println("You enter the code and hit the launch button. Instantly the Escape Pod shoots of the ship, with the\n" +
				"end destination being Earth. Congratulations! You have successfully managed to survive the atrocities" +
				"occuring on your ship and escape. \n");
			
	}
		
		
}

