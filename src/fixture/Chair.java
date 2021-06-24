package fixture;

public class Chair extends Fixture{
	String name = "Chair";
	String shortDescription = "There is a wooden chair in front of you. It does not look very comfortable.";
	String longDescription = "There is a wooden chair in front of you. It does not look very comfortable.";

	public String getName() {
		return name;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}
	
	public String getLongDescription() {
		return longDescription;
	}
}
