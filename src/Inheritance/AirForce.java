package Inheritance;

public class AirForce extends Defence
{
	String attack;
	int batches;
	String color;
	int bases;
	
	
	public AirForce() {
		// TODO Auto-generated constructor stub
	}


	public AirForce(String attack, int batches, String color, int bases,
			String minister, double budget, String cds, int soldires) 
	{
		super( "Rajnath_Shingh", 265658723.00, "saurabh_Gambhhire", 21445);
		this.attack = attack;
		this.batches = batches;
		this.color = color;
		this.bases = bases;
	}
	
	

}
