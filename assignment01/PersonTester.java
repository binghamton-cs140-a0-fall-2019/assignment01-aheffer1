package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {
		Person person = new Person("Bob", "Ferguson", "000112222", new DateAndPlaceOfBirth(2000, 2, 14, "Seattle", "Washington", "USA"), new StreetUSAddress("623 Maple Street", "", "Boston", "MA", "02101") );
		System.out.println(person);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

			Person person2 = new Person("Bob", "Ferguson", "000112222", new DateAndPlaceOfBirth(2000, 2, 14, "Seattle", "Washington", "USA"), new StreetUSAddress("623 Maple Street", "", "Boston", "MA", "02101") );
			output.println(person2);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
