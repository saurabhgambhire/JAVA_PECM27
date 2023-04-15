package INTERFACES;

public class SonDriver {

	public static void main(String[] args) 
	{
//		Father son = new Son();
		
		Son son = new Son();
		
		son.getDegree();
		System.out.println(Father.a);
		System.out.println(son.a);
		System.out.println(son.b);
	}

}
