package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		Person person = new Person("Bill", "Gates", "333445555", new DateAndPlaceOfBirth(1955, 10, 28, "Seattle", "WA", "USA"), new StreetUSAddress("123 Main Street", "", "Portland", "OR", "97035") );
		Computer comp1 = new Computer("Microsoft", "a decent one", 8, 750, true, 700.00);
		Computer comp2 = new Computer("Samsung", "a terrible one", 4, 500, false, 400.00);
		Computer comp3 = new Computer("MSI", "a powerful one", 8, 1000, true, 1500.00);
		Computer comp4 = new Computer("HP", "a mediocre one", 16, 500, false, 600.00);
		ComputerOwner owner  = new ComputerOwner(person);
		owner.addComputer(comp1);
   	owner.addComputer(comp2);
   	owner.addComputer(comp3);
   	owner.addComputer(comp4);
		System.out.println(owner);
		owner.removeComputer(0);
   	owner.removeComputer(1);
		System.out.println(owner);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwnerTester.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

		Person person2 = new Person("Bill", "Gates", "333445555", new DateAndPlaceOfBirth(1955, 10, 28, "Seattle", "WA", "USA"), new StreetUSAddress("123 Main Street", "", "Portland", "OR", "97035") );
		Computer comp12 = new Computer("Microsoft", "a decent one", 8, 750, true, 700.00);
		Computer comp22 = new Computer("Samsung", "a terrible one", 4, 500, false, 400.00);
		Computer comp32 = new Computer("MSI", "a powerful one", 8, 1000, true, 1500.00);
		Computer comp42 = new Computer("HP", "a mediocre one", 16, 500, false, 600.00);
		ComputerOwner owner2  = new ComputerOwner(person2);
		owner2.addComputer(comp12);
		owner2.addComputer(comp22);
		owner2.addComputer(comp32);
		owner2.addComputer(comp42);
		output.println(owner2);
		owner2.removeComputer(0);
		owner2.removeComputer(1);
		output.println(owner2);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		}
	}
}
