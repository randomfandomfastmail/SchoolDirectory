public class SchoolDirectory {

	Backpack[] backpacks;

	int number_of_backpacks;

	Student[] students;

	int number_of_students;

	Penalty[] penalties;

	int number_of_penalties;

	static final int MAX_STUDENT = 2000;
	static final int MAX_BACKPACK = 1000;
	static final int MAX_PENALTY = 800;

	/**
	 * 
	 */
	public SchoolDirectory() {
		backpacks = new Backpack[MAX_BACKPACK];
		students = new Student[MAX_STUDENT];
		penalties = new Penalty[MAX_PENALTY];
	}

	public Student studentRegistration(Student xStudent) {
		return students[number_of_students++] = xStudent;
	}

	public Backpack backpackRegistration(Backpack xBackpack, String studentID) {

		Student student = null;

		for (int i = 0; i < number_of_students; i++) {
			if (students[i].studentID.equals(studentID)) {
				student = students[i];
				break;
			}
		}

		xBackpack.wearer = student;

		return backpacks[number_of_backpacks++] = xBackpack;

	}

	public boolean backpackUnregistration(String backpackID) {

		boolean isFound = false;

		for (int i = 0; i < number_of_backpacks; i++) {
			if (!isFound && backpacks[i].backpackID.equals(backpackID)) {
				isFound = true;
			}
			if (isFound) {
				backpacks[i] = backpacks[i + 1];
			}
		}

		if (isFound)
			number_of_backpacks--;

		return isFound;

	}

	public boolean wasStolen(String backpackID) {

		for (int i = 0; i < number_of_backpacks; i++) {
			if (backpacks[i].backpackID.equals(backpackID)) {
				return backpacks[i].was_stolen = true;
			}
		}

		return false;
	}

	public boolean backpackTransfer(String backpackID, String studentID) {

		Student student = null;

		for (int i = 0; i < number_of_students; i++) {
			if (students[i].studentID.equals(studentID)) {
				student = students[i];
				break;
			}
		}

		if (student == null)
			return false;

		Backpack backpack = null;

		for (int i = 0; i < number_of_backpacks; i++) {
			if (backpacks[i].backpackID.equals(backpackID)) {
				backpack = backpacks[i];
				break;
			}
		}

		if (backpack == null)
			return false;

		backpack.wearer = student;

		return true;
	}

	public static SchoolDirectory example() { // Register all students and their backpacks

		SchoolDirectory sd = new SchoolDirectory();

		sd.studentRegistration(new Student("h6547-74848-jui5", "Alex Jones",

				"55 maple rd.", "London", "TX"));

		sd.studentRegistration(new Student("b9547-1244re8-ud5", "Tom Jackson",

				"3 main st.", "Hamburg", "FT"));

		sd.backpackRegistration(new Backpack("nike", "one strap", 2021, "yellow", "7346yye7"), "h6547-74848-jui5");

		sd.backpackRegistration(new Backpack("adidas", "big", 2008, "pink", "363727"), "b9547-1244re8-ud5");

		return sd;

	}

}