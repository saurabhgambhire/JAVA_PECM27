package Realtionshipes;

import java.util.StringTokenizer;

public class Mobile 
{
	String brand;
	String color;
	double price;
	int camera;
	Sim s;
	
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	
	Mobile(String brand, String color, double price, int camera)
	{
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.camera = camera;
		System.out.println("mobile created..");
	}
	
	public void insertSim(String service, String speed, long no)
	{
		s=new Sim(service, speed, no);
		System.out.println("Sim Inserted");
	}
	
	public void displayMobile()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Color : "+color);
		System.out.println("price : "+price);
		System.out.println("camera : "+camera);
		System.out.println("======================");
		
	}
}
