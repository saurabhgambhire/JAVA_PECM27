package Inheritance;

public class SoftwareCompany
{
	String ceo;
	String name;
	String loc;
	
	SoftwareCompany()
	{}
	
	
	public SoftwareCompany(String ceo, String name, String loc) {
		
		this.ceo = ceo;
		this.name = name;
		this.loc = loc;
	}
	
	
	public void displaySoftwareCompany() 
	{
		System.out.println("CEO :"+ceo);
		System.out.println("Name :"+name);
		System.out.println("Location :"+loc);
		
		
	}
	

}
