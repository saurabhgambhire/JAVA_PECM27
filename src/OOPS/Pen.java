package OOPS;

public class Pen 
{
	String name;
	int price; 
	String color;
	String type;
	
	public Pen() {
		
	}
	
	Pen(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	
	Pen(String name, int price, String color, String type)
	{
		this(name, price);
		this.color = color;
		this.type = type;
	}
	
	public void displayPen()
	{
		System.out.println("name "+name);
		System.out.println("price"+price);
		System.out.println("color"+color);
		System.out.println("type"+type);
		System.out.println("===========================");
	}
}
