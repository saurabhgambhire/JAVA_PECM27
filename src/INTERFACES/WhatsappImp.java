package INTERFACES;


public class WhatsappImp implements Whatsapp
{
	String name;
	String no;
	
	
	public WhatsappImp() {
		// TODO Auto-generated constructor stub
	}
	
	public WhatsappImp(String name, String no) {
		super();
		this.name = name;
		this.no = no;
		
		System.out.println("user Created .. ");
	}

	@Override
	public void sendMessage(String message, String name)
	{
		System.out.println(message);
		System.out.println("Message sent to "+ name);
	}
	
	public  void sendImage(String name)
	{
		System.out.println("IMAGE sent :)");
		System.out.println("IMAGE sent to "+name);
	}
	
	public void call(String name) 
	{
		System.out.println("Calling to "+name);
	}

}
