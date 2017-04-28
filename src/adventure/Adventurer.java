import java.util.*;

/**
 * 
 * @author Corey Yelo, Angelo Ciaramello, Alexia Melhado
 * @version 2.0
 * @since 2/24/2017
 * 
 *The Adventurer class contains all of the methods relevant to the player's
 *inventory, including placing and removing items. Contains the Inventory and
 *printInventory methods.
 */

public class Adventurer {
	
	
	/**
	 * Inventory class keeps checked whether or not a given item is already in the inventory, 
	 * 
	 * @param x Array location width
	 * @param y Array location height
	 * @param itemName Name of item
	 * @param inventory Inventory Array
	 * @param map Map Array
	 */
	public static void Inventory(int x, int y, String itemName, ArrayList<String> inventory, Map[][] map){
		
		boolean in = false;
		for(String itemInInventory: inventory){
			if(itemInInventory.equalsIgnoreCase(itemName)){
				in = true;
				break;
			}
		}
		
		//Checks whether or not the item is a valid item in the room
		boolean valid = false;
		for(String items: map[x][y].items){
			if(items.equalsIgnoreCase(itemName)){
				valid = true;
					break;
			}
		}
		
		//inventory output
		if(!in){
			System.out.println("You have picked up the " + itemName + ".");
			inventory.add(itemName);
		}
		else if (in){
			System.out.println("That item is in your inventory already.");
		}
		else{
			System.out.println("Invalid Command");
		}
	}
	
	/**
	 * printInventory prints out the items currently in the user's inventory.
	 * @param inventory
	 */
	public static void printInventory(ArrayList<String> inventory){
		System.out.println("You currently have:");
		for(String name: inventory){
			System.out.println(name);
		}
	}
}
