package Non_Primitive_Type_Casting;

public class SonDriver {

	public static void main(String[] args)
	{
		   Son s = new Son();
		   
		   s.drinking();  // father property
		   s.smoking();   // son property
		   
		   
		   Father f = s;  // upcating
		   
		   f.drinking();
//		   f.smoking(); not possible

	}

}
