import java.util.GregorianCalendar;

public class SchoolDirectoryTestProgram {

	public static void main(String args[]) {

		SchoolDirectory sd = SchoolDirectory.example();

		for (int i = 0; i < sd.number_of_students; i++)

			System.out.println(sd.students[i]);

		for (int i = 0; i < sd.number_of_backpacks; i++)

			System.out.println(sd.backpacks[i]);

		sd.backpackUnregistration("363727");

		for (int i = 0; i < sd.number_of_backpacks; i++)

			System.out.println(sd.backpacks[i]);

		System.out.println(sd.backpacks[0].wearer);

		System.out.println("\nNew penalties:");

		Penalty i = new Penalty(75, "Cheating during test",

				new GregorianCalendar(2010, 9, 4, 2, 1).getTime());

		i.paying_penalty();

		System.out.println(i);

	}

}