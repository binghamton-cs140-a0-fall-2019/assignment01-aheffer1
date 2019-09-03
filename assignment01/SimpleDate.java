package assignment01;
public class SimpleDate {
	public static SimpleDate of(int yr, int m, int d) {
		var returnValue = new SimpleDate(); 
		SimpleDate returnValue = SimpleDate.of(2019, 8, 26);
		returnValue.year = yr;
		returnValue.month = m;
		returnValue.day = d;
		return returnValue;
	}
	public boolean before(SimpleDate other) {
		if SimpleDate[0] < other[0] {
			return true;
		}
		else if SimpleDate[0] > other[0] {
			return false;
		}
		else if SimpleDate[1] < other[1] {
			return true;
		}
		else if SimpleDate[1] > other[1] {
			return false;
		}
		else if SimpleDate[2] < other[2] {
				return true
		}
		else return false;
	}
		
}


