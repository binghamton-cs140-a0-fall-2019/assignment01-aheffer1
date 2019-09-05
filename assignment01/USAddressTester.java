package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {

	public static void main(String[] args) {
		StreetUSAddress adr1 = new StreetUSAddress("725 5th Ave", "", "New York", "NY", "10022");
		StreetUSAddress adr2 = new StreetUSAddress("123 Park Ave", "124 Park Ave", "San Francisco", "CA", "94016");
		System.out.println(adr1);
		System.out.println(adr2);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println

			StreetUSAddress adr12 = new StreetUSAddress("725 5th Ave", "", "New York", "NY", "10022");
			StreetUSAddress adr22 = new StreetUSAddress("123 Park Ave", "124 Park Ave", "San Francisco", "CA", "94016");
			output.println(adr12);
			output.println(adr22);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
