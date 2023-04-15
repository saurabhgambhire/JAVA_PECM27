package Non_Primitive_Type_Casting;

public class SonDriver1 {

	public static void main(String[] args)
	{
		Father father = new Father();
		
		Father father2 = new Son(); // upCasting 
		
		father2.drinking();
		
		Son son = (Son) father2; // DownCasting 
		son.drinking();
		son.smoking();

	}

}
