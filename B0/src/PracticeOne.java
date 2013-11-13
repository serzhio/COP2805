import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;



public class PracticeOne {

	public static void main(String[] args) {

		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance();
		
		Locale loc = Locale.getDefault();
		
		System.out.println(loc.getDisplayCountry() + " " + df.format(d));
		
		ArrayList<String> al = new ArrayList();
		
		PracticeOne pe = new PracticeOne();
		int x = 5;
		pe.dostuff(x);
		System.out.print(" main = " + x);
		
	}

	public void dostuff(int x) {
		System.out.println("dostuff = " + x);
	}
}

interface Foo { int bar(); }

class Spirte {
	public int fubar(Foo foo) { return foo.bar(); }
	public void testFoo() { 
		fubar(new Foo() { public int bar(){return 1;} }
		);
	}
}



//class Nav {
//	public enum Direction { NORTH, SOUTH, EAST, WEST }
//}
// class Sprite {
//	Direction d = Direction.n
//}

//class Money {
//	
//	private String country, name;
//	public String getCountry() {
//		return country; 
//	}
//}
//
//class Yen extends Money {
//	public String getCountry() {
//		return super.country; 
//	}
//	
//}
//
//class Euro extends Money {
//	public String getCountry(String timeZone) {
//		return super.getCountry();
//	}
//}

