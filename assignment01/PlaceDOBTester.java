package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth dob1 = new DateAndPlaceOfBirth(1975, 4, 25, "Binghamton", "New York", "USA");
		DateAndPlaceOfBirth dob2 = new DateAndPlaceOfBirth(1975, 4, 25, "Houston", "Texas", "USA");
		DateAndPlaceOfBirth dob3 = new DateAndPlaceOfBirth(1985, 4, 25, "Moscow", "Russia");
		DateAndPlaceOfBirth dob4 = new DateAndPlaceOfBirth(2008, 10, 17, "San Diego", "California", "USA");
		DateAndPlaceOfBirth dob5 = new DateAndPlaceOfBirth(2013, 5, 2, "Hell", "Norway");

		System.out.println(dob1);
		System.out.println(dob2);
		System.out.println(dob3);
		System.out.println(dob4);
		System.out.println(dob5);

		System.out.println(dob1.hasSameBirthDayAs(dob2));
    System.out.println(dob1.hasSameBirthDayAs(dob3));
    System.out.println(dob1.hasSameBirthDayAs(dob4));
    System.out.println(dob1.hasSameBirthDayAs(dob5));
    System.out.println(dob2.hasSameBirthDayAs(dob3));
    System.out.println(dob2.hasSameBirthDayAs(dob4));
    System.out.println(dob2.hasSameBirthDayAs(dob5));
    System.out.println(dob3.hasSameBirthDayAs(dob4));
    System.out.println(dob3.hasSameBirthDayAs(dob5));
    System.out.println(dob4.hasSameBirthDayAs(dob5));

    System.out.println(dob1.hasSameBirthDateAs(dob2));
    System.out.println(dob1.hasSameBirthDateAs(dob3));
    System.out.println(dob1.hasSameBirthDateAs(dob4));
    System.out.println(dob1.hasSameBirthDateAs(dob5));
    System.out.println(dob2.hasSameBirthDateAs(dob3));
    System.out.println(dob2.hasSameBirthDateAs(dob4));
    System.out.println(dob2.hasSameBirthDateAs(dob5));
    System.out.println(dob3.hasSameBirthDateAs(dob4));
    System.out.println(dob3.hasSameBirthDateAs(dob5));
    System.out.println(dob4.hasSameBirthDateAs(dob5));

    System.out.println(dob1.youngerThan(dob2));
    System.out.println(dob1.youngerThan(dob3));
    System.out.println(dob1.youngerThan(dob4));
    System.out.println(dob1.youngerThan(dob5));
    System.out.println(dob2.youngerThan(dob3));
    System.out.println(dob2.youngerThan(dob4));
    System.out.println(dob2.youngerThan(dob5));
    System.out.println(dob3.youngerThan(dob4));
    System.out.println(dob3.youngerThan(dob5));
    System.out.println(dob4.youngerThan(dob5));

    System.out.println(dob1.olderThan(dob2));
    System.out.println(dob1.olderThan(dob3));
    System.out.println(dob1.olderThan(dob4));
    System.out.println(dob1.olderThan(dob5));
    System.out.println(dob2.olderThan(dob3));
    System.out.println(dob2.olderThan(dob4));
    System.out.println(dob2.olderThan(dob5));
    System.out.println(dob3.olderThan(dob4));
    System.out.println(dob3.olderThan(dob5));
    System.out.println(dob4.olderThan(dob5));

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

			DateAndPlaceOfBirth dob12 = new DateAndPlaceOfBirth(1975, 4, 25, "Binghamton", "New York", "USA");
			DateAndPlaceOfBirth dob22 = new DateAndPlaceOfBirth(1975, 4, 25, "Houston", "Texas", "USA");
			DateAndPlaceOfBirth dob32 = new DateAndPlaceOfBirth(1985, 4, 25, "Moscow", "Russia");
			DateAndPlaceOfBirth dob42 = new DateAndPlaceOfBirth(2008, 10, 17, "San Diego", "California", "USA");
			DateAndPlaceOfBirth dob52 = new DateAndPlaceOfBirth(2013, 5, 2, "Hell", "Norway");

			output.println(dob12);
			output.println(dob22);
			output.println(dob32);
			output.println(dob42);
			output.println(dob52);

			output.println(dob12.hasSameBirthDayAs(dob22));
			output.println(dob12.hasSameBirthDayAs(dob32));
			output.println(dob12.hasSameBirthDayAs(dob42));
			output.println(dob12.hasSameBirthDayAs(dob52));
			output.println(dob22.hasSameBirthDayAs(dob32));
			output.println(dob22.hasSameBirthDayAs(dob42));
			output.println(dob22.hasSameBirthDayAs(dob52));
			output.println(dob32.hasSameBirthDayAs(dob42));
			output.println(dob32.hasSameBirthDayAs(dob52));
			output.println(dob42.hasSameBirthDayAs(dob52));

			output.println(dob12.hasSameBirthDateAs(dob22));
			output.println(dob12.hasSameBirthDateAs(dob32));
			output.println(dob12.hasSameBirthDateAs(dob42));
			output.println(dob12.hasSameBirthDateAs(dob52));
			output.println(dob22.hasSameBirthDateAs(dob32));
			output.println(dob22.hasSameBirthDateAs(dob42));
			output.println(dob22.hasSameBirthDateAs(dob52));
			output.println(dob32.hasSameBirthDateAs(dob42));
			output.println(dob32.hasSameBirthDateAs(dob52));
			output.println(dob42.hasSameBirthDateAs(dob52));

			output.println(dob12.youngerThan(dob22));
			output.println(dob12.youngerThan(dob32));
			output.println(dob12.youngerThan(dob42));
			output.println(dob12.youngerThan(dob52));
			output.println(dob22.youngerThan(dob32));
			output.println(dob22.youngerThan(dob42));
			output.println(dob22.youngerThan(dob52));
			output.println(dob32.youngerThan(dob42));
			output.println(dob32.youngerThan(dob52));
			output.println(dob42.youngerThan(dob52));

			output.println(dob12.olderThan(dob22));
			output.println(dob12.olderThan(dob32));
			output.println(dob12.olderThan(dob42));
			output.println(dob12.olderThan(dob52));
			output.println(dob22.olderThan(dob32));
			output.println(dob22.olderThan(dob42));
			output.println(dob22.olderThan(dob52));
			output.println(dob32.olderThan(dob42));
			output.println(dob32.olderThan(dob52));
			output.println(dob42.olderThan(dob52));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
