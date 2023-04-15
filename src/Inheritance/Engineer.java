package Inheritance;



public class Engineer extends Infosys
{
	String ename;
	int eid;
	double salary;
	String designation;
	
	public Engineer() {
		// TODO Auto-generated constructor stub
	}

	public Engineer(String ceo, String name, String loc,String type, int projects, int employee, double turnover, 
			String ename, int eid, double salary, String designation)
	{
		
		
		
//		this.ceo = ceo;
//		this.name = name;
//		this.loc = loc;
//		
//		this.type = type;
//		this.projects = projects;
//		this.employee = employee;
//		this.turnover = turnover;
		super(ceo, ename, loc, type, projects, employee, turnover);
		
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
		this.designation = designation;
		
	}
	
	public void displayEngineer()
	{
		displayInfosys();
		System.out.println("====================");
		
		System.out.println("Ename : "+ename);
		System.out.println("Eid "+eid);
		System.out.println("Salary :"+salary);
		System.out.println("Designation : "+designation);
		
	}
	
	
	
}
