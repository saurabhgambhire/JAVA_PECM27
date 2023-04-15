package INTERFACES;

public interface Whatsapp 
{
	void sendMessage(String msg, String name);
	public abstract void sendImage(String name);
	public void call(String name);
	public static void welcome(String name )
	{
		System.out.println("welcome"+ name);
	}
	
}
