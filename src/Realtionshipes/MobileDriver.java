package Realtionshipes;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile m = new Mobile("iphone", "golden", 150000, 3);
		
		m.displayMobile();
		
		m.insertSim("Jio", "5G", 9359691331l);
		
		m.s.displaySim();

	}

}
