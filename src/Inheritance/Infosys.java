package Inheritance;



public class Infosys extends SoftwareCompany
{
	String type;
	int projects;
	int employee;
	double turnover;
	
	
	public Infosys() {
		// TODO Auto-generated constructor stub
	}


	public Infosys( String ceo, String name, String loc,String type, int projects, int employee, double turnover) {
		
//		this.ceo = ceo;
//		this.name = name;
//		this.loc = loc;
		
		super(ceo, name, loc);
		
		this.type = type;
		this.projects = projects;
		this.employee = employee;
		this.turnover = turnover;
	}
	
	public void displayInfosys() 
	{
		displaySoftwareCompany();
		System.out.println("============================");
		System.out.println("Type : "+type);
		System.out.println("projects : "+projects);
		System.out.println("Employee : "+employee);
		System.out.println("TurnOver : "+turnover);
	}
	
	
}
