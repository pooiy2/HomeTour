package Game;

import java.util.Hashtable;
import java.util.Scanner;
//import java.util.Arrays;

import fixture.Fixture;
//import fixture.Room;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	Hashtable<String, Integer> directions ;
	static Player player = new Player();
	
	public static void main(String[] args) {
		RoomManager house = new RoomManager();
		house.init();
		player.setRoom(house.getStartingRoom());
		do {
			printRoom();
		} while (parse(collectInput()));
	}
	
	public static void printRoom() {
		System.out.println(player.getRoom().getShortDescription());
	}
	
	private static String[] collectInput() {
		System.out.println("What would you like to do?");
		String input = scanner.nextLine();
		return input.split(" ");
	}
	
	private static void examineFixture(Fixture[] fixture, String name) {
		for (int i = 0; i < fixture.length; i++) {
			if (fixture[i].getName().equalsIgnoreCase(name)) {
				System.out.println(fixture[i].getShortDescription());
			}
		}
	}
	
	private static boolean parse(String[] command) {
		if (command[0].equalsIgnoreCase("go")) {
			player.move(command[1]);
		} else if (command[0].equalsIgnoreCase("examine")) {
			Fixture[] fixtures =  player.getRoom().getFixtures();
			examineFixture(fixtures, command[1]);
		} else if (command[0].equalsIgnoreCase("quit")) {
			return false;
		} else if (command[0].equalsIgnoreCase("more")) {
			System.out.println(player.getRoom().getLongDescription());
		}
		return true;
	}
}
