package Realtionshipes;



public class Car 
{
	String brand;
	String color;
	String name;
	double price;
	int milage;
	
	Engine e = new Engine("petrol",4,"4-Strokes");
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	Car(String brand, String color, String name, double price, int milage)
	{
		this.brand = brand;
		this.color = color;
		this.name = name;
		this.price = price;
		this.milage = milage;
		System.out.println("Car created....");
	}
	
	public void displayCar() {
		System.out.println("brand : "+brand);
		System.out.println("color : "+color);
		System.out.println("name : "+ name);
		System.out.println("price : "+price);
		System.out.println("milage : "+milage);
		System.out.println("=======================");
	}
	
}
