package Realtionshipes;

public class Sim
{
	String service;
	String speed;
	long no;
	
	
	public Sim() {
		// TODO Auto-generated constructor stub
	}
	
	Sim(String service, String speed, long no )
	{
		this.service = service;
		this.speed = speed;
		this.no = no;
		System.out.println("Sim Created ..");
		
	}
	
	
	public void displaySim() 
	{
		System.out.println("Service : " +service);
		System.out.println("spedd : "+ speed);
		System.out.println("Mobile no : "+no);
	}

}
