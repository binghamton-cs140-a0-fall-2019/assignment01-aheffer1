package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different 
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
		public comp1(String aBrand, String cpuDesc, int ram, int disk, boolean ssd, double purchPrice) {
			brand = "Intel";
			cpuDescription = cpuDesc;
			ramGB = "16gb";
			diskGB = "800mb";
			SSD = "None";
			purchasePrice = "$500";
		}
		public comp2(String aBrand, String cpuDesc, int ram, int disk, boolean ssd, double purchPrice) {
			brand = "Apple";
			cpuDescription = cpuDesc;
			ramGB = "8gb";
			diskGB = "1tb";
			SSD = "a bad one";
			purchasePrice = "$600";
		}
		public comp3(String aBrand, String cpuDesc, int ram, int disk, boolean ssd, double purchPrice) {
			brand = "Dell";
			cpuDescription = cpuDesc;
			ramGB = "8gb";
			diskGB = "500mb";
			SSD = "None";
			purchasePrice = "400";
		}
		public comp4(String aBrand, String cpuDesc, int ram, int disk, boolean ssd, double purchPrice) {
			brand = "Alienware";
			cpuDescription = cpuDesc;
			ramGB = "16gb";
			diskGB = "2tb";
			SSD = "a good one";
			purchasePrice = "$800";
		}
		System.out.println(comp1);
		System.out.println(comp2);
		System.out.println(comp3);
		System.out.println(comp4);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		}
		public comp1_2(String aBrand, String cpuDesc, int ram, int disk, boolean ssd, double purchPrice) {
			brand = "Intel";
			cpuDescription = cpuDesc;
			ramGB = "16gb";
			diskGB = "800mb";
			SSD = "None";
			purchasePrice = "$500";
		}
		public comp2_2(String aBrand, String cpuDesc, int ram, int disk, boolean ssd, double purchPrice) {
			brand = "Apple";
			cpuDescription = cpuDesc;
			ramGB = "8gb";
			diskGB = "1tb";
			SSD = "a bad one";
			purchasePrice = "$600";
		}
		public comp3_2(String aBrand, String cpuDesc, int ram, int disk, boolean ssd, double purchPrice) {
			brand = "Dell";
			cpuDescription = cpuDesc;
			ramGB = "8gb";
			diskGB = "500mb";
			SSD = "None";
			purchasePrice = "400";
		}
		public comp4_2(String aBrand, String cpuDesc, int ram, int disk, boolean ssd, double purchPrice) {
			brand = "Alienware";
			cpuDescription = cpuDesc;
			ramGB = "16gb";
			diskGB = "2tb";
			SSD = "a good one";
			purchasePrice = "$800";
		}
		output.println(comp1_2);
		output.println(comp2_2);
		output.println(comp3_2);
		output.println(comp4_2);
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}


