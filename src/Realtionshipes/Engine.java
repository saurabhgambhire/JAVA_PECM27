package Realtionshipes;

public class Engine
{
	String fuel;
	int php;
	String cc;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	
	Engine(String fuel, int php, String cc)
	{
		this.fuel= fuel;
		this.php = php;
		this.cc=cc;
		
		System.out.println("Engine Created..");
	}
	
	public void displayEngine()
	{
		System.out.println("fuel : "+fuel);
		System.out.println("php :" + php);
		System.out.println("cc : " +cc);
	}
}
