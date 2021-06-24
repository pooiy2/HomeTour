package Game;

import fixture.Room;
import fixture.Fixture;
import fixture.Chair;
import fixture.Bed;

public class RoomManager {
	Room startingRoom;
	
	public void init() {
		/*Initializes the rooms in the house*/
		Room wall = new Room();
		Room hallway = new Room("Hallway", "You are in a hallway. It is really small. There is a living room to the east"
				+ " and a kitchen to the north.");
		Room livingRoom = new Room("Living Room", "You are in the living room. There is a hallway to the west and a "
				+ "bedroom to the north.");
		Room kitchen = new Room("Kitchen", "You are in the kitchen. There is a hallway to the south. There is a chair.");
		Room bedroom = new Room("Bedroom", "You are in a bedroom. The living room is south. There is a bed.");
		hallway.setRooms(new Room[] {kitchen, livingRoom, wall, wall});
		livingRoom.setRooms(new Room[] {bedroom, wall, wall, hallway});
		kitchen.setRooms(new Room[] {wall, wall, hallway, wall});
		kitchen.setFixtures(new Fixture[] {new Chair()});
		bedroom.setRooms(new Room[] {wall, wall, livingRoom, wall});
		bedroom.setFixtures(new Fixture[] {new Bed()});
		startingRoom = hallway;
	}
	
	public Room getStartingRoom() {
		/*Returns the starting room*/
		return startingRoom;
	}
	
	//TODO: Add a while loop to create a house configuration
}
