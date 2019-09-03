package assignment01;
public class USAddressTester {
	public static void main(String[] args) {
		public adr1(String address1, String address2, String cty, String state, String zip) {
			address1 = "725 5th Ave";
			address2 = "";
			cty = "New York";
			state = "NY";
			zip = "10022";
		}
		public adr2(String address1, String address2, String cty, String state, String zip) {
			addressLine1 = "123 Park Ave";
			addressLine2 = "124 Park Ave";
			city = "San Francisco";
			stateAbbreviation = "California";
			zipCode = "94016";
		}
		System.out.println(adr1);
		System.out.println(adr2);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
			public adr1_2(String address1_2, String address2_2, String cty_2, String state_2, String zip_2) {
				address1_2 = "725 5th Ave";
				address2_2 = "";
				cty_2 = "New York";
				state_2 = "NY";
				zip_2 = "10022";
			}
			public adr2_2(String address1_2, String address2_2, String cty_2, String state_2, String zip_2) {
				addressLine1_2 = "123 Park Ave";
				addressLine2_2 = "124 Park Ave";
				city_2 = "San Francisco";
				stateAbbreviation_2 = "California";
				zipCode_2 = "94016";
			}
			output.println(adr1);
			output.println(adr2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


