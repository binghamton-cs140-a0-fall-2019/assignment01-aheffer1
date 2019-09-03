package assignment01;
public class TestDateAndPlaceOfBirth {
	public static void main(String[] args) {
		public dob1(int yearOfBirth, int monthOfBirth, int dayOfBirth, String cityOfBirth, String stateOfBirth,String countryBirth) {
			yearOfBirth = 1975;
			monthOfBirth = 4;
			dayOfBirth = 25;
			cityOfBirth = "New York City";
			stateOfBirth = "New York";
			countryOfBirth = "USA";
		}
		public dob2(int yearOfBirth, int monthOfBirth, int dayOfBirth, String cityOfBirth, String stateOfBirth,String countryBirth) {
			yearOfBirth = 1975;
			monthOfBirth = 4;
			dayOfBirth = 25;
			cityOfBirth = "Houston";
			stateOfBirth = "Texas";
			countryOfBirth = "USA";
		}
		public dob3(int yearOfBirth, int monthOfBirth, int dayOfBirth, String cityOfBirth, String countryBirth) {
			yearOfBirth = 1985;
			monthOfBirth = 4;
			dayOfBirth = 25;
			cityOfBirth = "Moscow";
			countryOfBirth = "Russia";			
		}
		public dob4(int yearOfBirth, int monthOfBirth, int dayOfBirth, String cityOfBirth, String stateOfBirth,String countryBirth) {
			yearOfBirth = 2008;
			monthOfBirth = 10;
			dayOfBirth = 17;
			cityOfBirth = "San Diego";
			stateOfBirth = "California";
			countryOfBirth = "USA";
		}
		public dob5(int yearOfBirth, int monthOfBirth, int dayOfBirth, String cityOfBirth, String countryBirth) {
			yearOfBirth = 2013;
			monthOfBirth = 4;
			dayOfBirth = 2;
			cityOfBirth = "Hell";
			countryOfBirth = "Norway";
		}
		System.out.println(dob1);
		System.out.println(dob2);
		System.out.println(dob3);
		System.out.println(dob4);
		System.out.println(dob5);
		System.out.println(dob1.olderThan(dob2));
		System.out.println(dob3.olderThan(dob2));
		System.out.println(dob2.olderThan(dob3));
		System.out.println(dob1.youngerThan(dob2));
		System.out.println(dob2.youngerThan(dob3));
		System.out.println(dob3.youngerThan(dob2));
		System.out.println(dob1.hasSameBirthDateAs(dob2));
		System.out.println(dob1.hasSameBirthDateAs(dob3));
		System.out.println(dob4.hasSameBirthDateAs(dob5));
		System.out.println(dob1.hasSameBirthDateAs(dob2));
		System.out.println(dob1.hasSameBirthDayAs(dob2));
		System.out.println(dob2.hasSameBirthDayAs(dob3));
		System.out.println(dob4.hasSameBirthDayAss(dob5));
		
		
	}
}


