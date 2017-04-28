import java.util.ArrayList;

/**
 * 
 * @author Corey Yelo, Angelo Ciaramello, Alexia Melhado
 * @version 2.0
 * @since 2/24/2017
 * 
 * The Map class contains all of the methods for creating
 * rooms in the map as well as storing and retrieving information
 * stored within these rooms. Contains the Map, setRoomNumber, getRoomNumber,
 * setRoomName, getRoomName, setRoomDescription, getRoomDescription,
 * setItems, removeItems, and getInventory methods.
 */

public class Map{
	
	
	//Variable Declaration
	public int roomNumber;
	public String roomName;
	public String roomDescription;
	public ArrayList<String> items = new ArrayList<>();
	
	/**
	 * This is used as the Constructor method for the Map object.
	 * @param num
	 * @param name
	 * @param description
	 * @param item
	 */
	public Map(int num, String name, String description, ArrayList<String> item){
		roomNumber = num;
		roomName = name;
		roomDescription = description;
		//items = item; if changed add ArrayList<String> item back
	}
	
	/**
	 * The setRoomNumber method stores information on the room number for a given Map object.
	 * @param roomNumber Room Number
	 */
	public void setRoomNumber(int roomNumber){
		this.roomNumber = roomNumber;
	}
	
	/**
	 *getRoomNumber retrieves the stored room number within any given Map object
	 * @return roomNumber Number of the room
	 */
	public int getRoomNumber(){
		return this.roomNumber;
	}
	
	
	/**
	 * setRoomName stores the passed String from roomName into any given Map object.
	 * @param roomName Name of the Room
	 */
	public void setRoomName(String roomName){
		this.roomName = roomName;
	}
	
	/**
	 * getRoomName retrieves the stored room name from any given Map object
	 * @return String roomName Name of the room
	 */
	public String getRoomName(){
		return this.roomName;
	}
	
	
	/**
	 * setRoomDescription stores the passed String from roomDescription into any given Map object
	 * @param roomDescription Description of the Room
	 */
	public void setRoomDescription (String roomDescription){
		this.roomDescription = roomDescription;
	}
	
	
	/**
	 * getRoomDescription retrieves the stored description from any given Map object
	 * @return roomDescription Room Description
	 */
	public String getRoomDescription(){
		return this.roomDescription;
	}
	
	/**
	 * setItems places items into any given Map object based off the String passed from item
	 * @param item 
	 */
	public void setItems(String item){
		this.items.add(item);
	}
	
	/**
	 * removeItems removes items from a given object based off the String passed from item
	 * @param item
	 */
	public void removeItems(String item){
		this.items.remove(item);
	}
	
	/**
	 * getInventory returns the name of each object within the player's inventory
	 * @return items Items currently in Inventory
	 */
	public ArrayList<String> getInventory(){
		return this.items;
	}
	
}