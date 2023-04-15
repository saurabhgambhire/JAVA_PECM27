package Inheritance;

public class BDriver {

	public static void main(String[] args)
	{
		B b = new B();
		System.out.println(b.b);
		System.out.println(B.a);
		b.xyz();
		B.abc();// correct way of calling of static member
//		b.abc(); it's not correct way of calling the static members 
//		the parent class always call with
	}

}
