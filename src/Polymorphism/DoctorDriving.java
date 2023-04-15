package Polymorphism;

public class DoctorDriving 
{
	String name ;
	public DoctorDriving() {
		// TODO Auto-generated constructor stub
	}
	
	DoctorDriving(String  name)
	{
		this.name = name;
		
		System.out.println("Hello "+name+" Game Started :)");
		
		
	}
	
	
	public void right() 
	{
		System.out.println("Turn right ");
	}
	
	public void left() {
		System.out.println("left- right");
	}
	
	public void forword() {
		System.out.println("Go Forword");
	}
	
	public void backword()
	{
		System.out.println("Go BackWord");		
	}
}

