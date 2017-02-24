/*
An adventurer has:
�	A location (some room).
�	An inventory (the things being carried).  When the player executes the �take thing� command, the item should be added to the inventory.

An adventurer can:
�	Move from room to room.
�	Carry a number of objects.
�	Pick up, drop, look at, and use various objects.
*/

import java.util.*;

public class Adventurer {
	
	//Item declarations(Start as false)
	public static boolean helmet;
	
	
	//Shows inventory with if-statements for each item (if true, then it displays)
		public static void showInventory(){
			
			System.out.println("Current Inventory: ");
			if(helmet == true){
				System.out.println("Helmet");
			}else{
				System.out.println("Your inventory is empty");
			}
		}
	
	//ETC. Methods
	
	
}

