package ObjectClass;

public class Bottle 
{
	String name;
	double price; 
	int capacity;
	
	
	public Bottle() {
		// TODO Auto-generated constructor stub
	}
	
	public Bottle(String name, double price, int capacity) {
		super();
		this.name = name;
		this.price = price;
		this.capacity = capacity;
	}
	
	
//	public String toString()
//	{
//		return "[ Name : "+name+" Price : "+ price+"Capacity : "+capacity+"]";
//	}
	
	public boolean equals(Object i)
	{
		Bottle b = (Bottle) i;
		if (this.name == b.name && this.price == b.price && this.capacity == b.capacity ) {
			return true;
		}
		
		return false;
		
	}
	
	
	
}
