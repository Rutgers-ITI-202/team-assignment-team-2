/*
This class:
•	Creates the Rooms, the Things, and the Adventurer.
•	Connects the Rooms with "paths" to other Rooms.
•	Places Things in the Rooms.
•	Places the Adventurer in some Room.
•	Accepts commands from the player, and executes them.
	o	As commands are entered, they should be copied to the main text area.
	o	The method that executes commands should return a String to be displayed in the main text area.
*/

import java.util.*;

public class AdventureModel {
	
	public static Scanner sc = new Scanner (System.in);
	public static int[] rooms = new int[10];
	public static String stringInput;
	public static boolean helmet;
	
	
	//setMap method(Sets up room array)
	public AdventureModel(){
		startGame();
	}
	
	
	public static void startGame(){
		
		//Room Declaration
		rooms[0] = 1;
		rooms[1] = 2;
		rooms[2] = 3;
		rooms[3] = 4;
		rooms[4] = 5;
		rooms[5] = 6;
		rooms[6] = 7;
		rooms[7] = 8;
		rooms[8] = 9;
		rooms[9] = 10;
		
		//Game start text
		System.out.println("Welcome to Escape the Spaceship. You are stranded in a\n"
				+ "space ship and need to reach your crewmates in the ship's escape\n"
				+ "pod to make it out of there alive. This is just a tech demo of\n"
				+ "the game's engine within a single room\n\n");
		//first prompt
		System.out.println("You open your eyes and notice that you are alone in the command room\n");
				
		
	}
	
	public static void commandRoom(){
		
		System.out.println("You are in the command room. In front of you there is an astronaut\n"
				+ " helmet. If you do not pick it up you will suffocate. Do you wish to pick up the\n"
				+ "the helmet?\n\n>");
		//string input (helmet)
		String stringInput = sc.next();
		if(stringInput.equalsIgnoreCase("yes")){
			Adventurer.helmet = true;
			System.out.println("You put the helmet on your head. You feel a rush\n"
					+ "of fresh air.\n\n");
		}


	}
	
	
}


}
