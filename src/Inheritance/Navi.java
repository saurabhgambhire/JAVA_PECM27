package Inheritance;

public class Navi extends Defence
{
	String attack;
	int batches;
	String color;
	int bases;
	
	public Navi() {
		// TODO Auto-generated constructor stub
	}

	public Navi(String attach, int batches, String color, int bases,String minister, double budget, String cds, int soldires) 
	{
		super( "Rajnath_Shingh", 265658723.00, "saurabh_Gambhhire", 21445);
		this.attack = attack;
		this.batches = batches;
		this.color = color;
		this.bases = bases;
	}
	
	private void displayNavi() 
	{
		displayDefence();
		System.out.println("Attach : "+attack);
		System.out.println("Batches : "+batches);
		System.out.println("Color : "+color);
		System.out.println("Bases : "+bases);
		System.out.println("========================");
	}
	
	
	
}
