README.txt – Create a file that lets me know where and how you have met
each of the above requirements, so I properly award you the points you are
entitled to.

TextAdventure.java class contains the main method used to start the game.
	- AdventureModel.createMap(map); is called from the main method and begins the game.
	Code for any interactions or movements are also located in the TextAdventure.java class.

The Inventory method in the Adventurer.java class has all of the information regarding the inventory and how it works
like the implemetation of adding an item to your inventory.

The AdventureModel.java class creates the rooms, their descriptions and places items in the room:
Our game's location is outerspace. Our rooms are 10 rooms on a spacecraft which are the Command Room, Crew 
Quarters, Recreation Room, Medical Facility, Cryogenic Lab, Emergency Staircase, Research and Development, 
Air Lock and the Escape Pod. The implementation of these rooms can be found in the AdventureModel.java class. 

Most of these rooms contain objects and can also be found in the AdventureModel.java class.

The name of each room along with the description of the room itself and what items are located in that room
are printed each time the player enters the room. 
	- The player also has the ability to "look" at the room they are currently in by entering "look" 
	followed by the name room they are in which will print the description of the room once again.
	For example: "look command room" will print the description of the Command Room.

Move from room to room by entering any of the following commands: north, south, east or west. 
	- If the player is located in the Command Room, simply enter "north" will move them to the 
	Recreation Room.

To pick up any object, the player must enter "interact" followed by the name of the object they would 
like to add  to their inventory (found in Adventurer.java class).
	- For example, "interact flashlight" will add the flashlight to your inventory.

- The Map.java class has all of the method for creating rooms on the map.



