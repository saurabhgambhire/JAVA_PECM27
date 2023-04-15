package ObjectClass;

public class BottleDriver {

	public static void main(String[] args)
	{
		Bottle b1 = new Bottle("Melton", 200, 1);
		
//		System.out.println(b);
		
		Bottle b2 = new Bottle("Melton", 200, 1);
//		System.out.println(b1);
		
		System.out.println(b1.equals(b2));
		System.out.println(b1==b2);

	}

}
