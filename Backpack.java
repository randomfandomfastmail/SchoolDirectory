public class Backpack {
	
	String brand, type;
	
	int release;
	
	String colour, backpackID;
	
	Student wearer;
	
	boolean was_stolen;

	/**
	 * @param brand
	 * @param type
	 * @param release
	 * @param colour
	 * @param backpackID
	 */
	public Backpack(String brand, String type, int release, String colour, String backpackID) {
		this.brand = brand;
		this.type = type;
		this.release = release;
		this.colour = colour;
		this.backpackID = backpackID;
	}
	
	public Backpack() {
		this("<Brand>","<Type>",0,"<Colour>","<BackpackID>");
	}

	@Override
	public String toString() {
		return String.format(
				"%s, %d %s %s with ID: %s", 
				colour,release, brand, type, backpackID);
	}
	
	

}