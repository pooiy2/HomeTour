package Game;

//import fixture.Fixture;
import fixture.Room;

public class Player {
	Room currentRoom;
	
	public void setRoom(Room room) {
		currentRoom = room;
	}
	
	public void move(String direction) {
		int index = 0;
		switch (direction.toLowerCase().charAt(0)) {
		case 'n':
			index = 0;
			break;
		case 'e':
			index = 1;
			break;
		case 's':
			index = 2;
			break;
		case 'w':
			index = 3;
			break;
		case 'c':
			return;
		}
		currentRoom = currentRoom.exit(index);
	}
	
	public Room getRoom() {
		return currentRoom;
	}
}
