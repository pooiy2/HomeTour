package fixture;

public class Room extends Fixture {
	String name;
	String shortDescription;
	String longDescription;
	Room[] exits;
	Fixture[] fixtures;
	
	public Room(String name1, String shortDescription1, String longDescription1){
		name = name1;
		shortDescription = shortDescription1;
		longDescription = longDescription1;
	}
	
	public Room(String name1, String shortDescription1){
		name = name1;
		shortDescription = shortDescription1;
		longDescription = shortDescription1;
	}
	
	public Room() {
		name = "Wall";
	}
	public String getName() {
		return name;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}
	
	public String getLongDescription() {
		return longDescription;
	}
	public void setRooms(Room[] exits1) {
		exits = exits1;
	}
	
	public Room[] getExits() {
		return exits;
	}
	
	public Room exit(int direction) {
		if (exits[direction].name.equalsIgnoreCase("Wall")) {
			System.out.println("You walked into a wall.");
			return this;
		}
		return exits[direction];
	}
	
	public void setFixtures(Fixture[] fixtures1) {
		fixtures = fixtures1;
	}
	
	public Fixture[] getFixtures() {
		return fixtures;
	}
}
