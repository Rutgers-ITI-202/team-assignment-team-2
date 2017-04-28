import java.util.Scanner;


/**
 * 
 * @author Corey Yelo, Angelo Ciaramello, Alexia Melhado
 * @version 2.0
 * @since 2/24/2017
 * AdventureModel contains the code used to create the game map, as well as
 * intializing it and adding information to each room. Contains createMap,
 * getInput, and printRoom methods.
 */


public class AdventureModel{

	public static void createMap(Map map[][]){
		
		
		//intializing 2d array
		for(int i = 0; i<=2; i++){
			for(int j = 0; j<=3; j++){
				map[i][j] = new Map(i, "", "", null);
			}
		}
		
		/*Map CommandRoom = new Map(1, "Command Room", "This is the Command Room. All of the ship's navigation occurs here. There is a\n"
        		+ "helmet on the ground in front of you. To the west is the Crew Quarters and to the north is the\n"
        		+ "recreation room");
        		*/
		
        map[1][0].setRoomNumber(1);
        map[1][0].setRoomName("Command Room");
        map[1][0].setRoomDescription("This is the Command Room. All of the ship's navigation occurs here. There is a\n"
        		+ "helmet on the ground in front of you. To the west is the Crew Quarters and to the north is the\n"
        		+ "recreation room.");
        map[1][0].setItems("helmet");
        
        map[0][0].setRoomNumber(2);
        map[0][0].setRoomName("Crew Quarters");
        map[0][0].setRoomDescription("This is the Crew Quarters where the entire crew bunks and stores personal items.\n"
        		+ "Inside of your locker is your backpack containing a gun and a flashlight. To the north are the Emergency\n"
        		+ "Stairs and to the east is the Command Room.");
        map[0][0].setItems("gun");
        map[0][0].setItems("flashlight");
		
        map[1][1].setRoomNumber(3);
        map[1][1].setRoomName("Recreation Room");
        map[1][1].setRoomDescription("This is the Recreation Room where the crew would pass time before the incident. It\n"
        		+ "looks like the Airlock's keycard sitting on the table, but you cannot tell without some sort\n"
        		+ "of light. To the north is the Airlock, to the west are the Emergency Stairs, to the south is the\n"
        		+ "Command Room, and to the east is the Medical Facility");
        map[1][1].setItems("Keycard");
        
        map[2][1].setRoomNumber(4);
        map[2][1].setRoomName("Medical Facility");
        map[2][1].setRoomDescription("The Medical Facility is where crew members would go to heal incase of injury. There\n"
        		+ "is a Medical Kit laying on the main table. To the north is the Cryogenic Lab, and to the West is the\n"
        		+ "Recreation Room.");
        map[2][1].setItems("Medical Kit");
        
        map[2][2].setRoomNumber(5);
        map[2][2].setRoomName("Cryogenic Lab");
        map[2][2].setRoomDescription("You have entered the Cryogenic Lab. Here is where you and your fellow austronauts performed\n"
        		+ "tests and experiments and captured aliens. You hear a noise coming from in front of you. If you had a Light \n"
        		+ "you would be able to make out the figure the sound is coming from, as well as read the first half of the\n"
        		+ "escape pod instructions. To the west is the Airlock and to the south is the Medical Facility");
        map[2][2].setItems("Instructions1");
      
        map[0][1].setRoomNumber(6);
        map[0][1].setRoomName("Emergency Staircase");
        map[0][1].setRoomDescription("You have entered the emergency stairs. To the North is \n the Research and Development\n"
        		+ "room, to the east is the Recreation Room, and to the south is the Crew Quarters.");
        
        map[0][2].setRoomNumber(7);
        map[0][2].setRoomName("Research and Development");
        map[0][2].setRoomDescription("You have entered the R&D room. It is very dark, but you hear a voice coming from\n"
        		+ "a headset on the other side of the room. To the north is the Storage room, to the south are the Emergency\n"
        		+ "Staris, and to the east is the Airlock ");
        map[0][2].setItems("headset");
        
        map[0][3].setRoomNumber(8);
        map[0][3].setRoomName("Storage");
        map[0][3].setRoomDescription("You are in the storage room. This is where the crew keeps all of their equipment during\n"
        		+ ".");
        map[0][3].setItems("Red Key");
        map[0][3].setItems("Blue Key");
        map[0][3].setItems("Green Key");
        
        map[1][2].setRoomNumber(9);
        map[1][2].setRoomName("Airlock");
        map[1][2].setRoomDescription("You are in the airlock that leads to the escape pod.");
        map[1][2].setItems("Launch Button");
        
        map[1][3].setRoomNumber(10);
        map[1][3].setRoomName("Escape Pod");
        map[1][3].setRoomDescription("You have succesfully made it to the Escape Pod. It looks like the control panel has buttons\n" +
        		"labeled 1, 2, 3, and 4, as well as a hole the size of a key.");
        map[1][3].setItems("Control Panel with Key hole and four buttons");
       }
	
	public static String getInput(){
		
		System.out.print("- ");
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		text.toLowerCase();
		return text;
	}
	
	public static void printRoom(Map[][] room, int x, int y){
		System.out.println(room[x][y].getRoomDescription());
		System.out.println();
	}
	
	
}
