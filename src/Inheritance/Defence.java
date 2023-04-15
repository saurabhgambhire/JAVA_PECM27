package Inheritance;

public class Defence
{
	String minister;
	double budget;
	String cds;
	int soldires;
	
	public Defence() {
		// TODO Auto-generated constructor stub
	}

	public Defence(String minister, double budget, String cds, int soldires) 
	{
		this.minister = minister;
		this.budget = budget;
		this.cds = cds;
		this.soldires = soldires;
	}
	
	public void displayDefence() 
	{
		System.out.println("Minister :"+minister);
		System.out.println("Budget :"+budget);
		System.out.println("cds : "+cds);
		System.out.println("Soldires : "+soldires);
		System.out.println("=============================");
	}
	
	
	
	
}
