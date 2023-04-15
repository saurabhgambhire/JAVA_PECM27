package INTERFACES;

public class WhatsappDriver {

	public static void main(String[] args) 
	{
		
		Whatsapp w	= new WhatsappImp("Saurabh", "9359691331"); //upcasted
		
//		w.call("Divine");
//		w.sendImage("Aniket");
		w.sendMessage("LWD", "Tejus");
		
		Whatsapp.welcome("tejus");
	}

}
