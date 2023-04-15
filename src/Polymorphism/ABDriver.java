package Polymorphism;

public class ABDriver {

	public static void main(String[] args) 
	{
	
		A a	= new B();  // upcasting 
		
		a.abc();
		a.xyz();
		
		System.out.println(a.s);
		System.out.println(a.a);
		
		
	}

}
