package STRINGS;

import java.util.Iterator;

public class OverViewDriver {

	public static void main(String[] args) 
	{
		OverView[] planet = new OverView[6];
		
		planet[0] = new OverView("mercury",new String[] {}, 0, false);
		planet[1] = new OverView("venus",new String[] {"co2","n2"}, 0, false);
		planet[2] = new OverView("earth",new String[] {"n2", "o2"}, 1, false);
		planet[3] = new OverView("jupiter",new String[] {"h2", "he"}, 79, true);
		planet[4] = new OverView("saturn",new String[] {"h2", "he"}, 83, true);
		planet[5] = new OverView("uranus",new String[] {"h2", "he", "ch4"}, 27, true);
		
		System.out.println(CountOfMoonHavingRings(planet));
////		CountOfMoonHavingRings(planet);

		MaximumGasFound(planet);
//		
		
		
		
	}

	private static void MaximumGasFound(OverView[] planet) 
	{
		int count=0;
		for (int i = 0; i < planet.length; i++) 
		{
			if (planet[i].gases!=null) 
			{
				for (int j = 0; j < planet[i].gases.length; j++) 
				{
					count++;
				}
			}
		}

		String[] gasses = new String[count];
		int k=0;
		for (int i = 0; i < planet.length; i++) 
		{
			if (planet[i].gases!=null) 
			{
				for (int j = 0; j < planet[i].gases.length; j++) 
				{
					gasses[k] = planet[i].gases[j];
					k++;
				}
			}
		}
		
		
		
		int[] ct = new int[count];
		
		for (int i = 0; i < gasses.length; i++)
		{
			int CharCount = 1;
			for (int j = i+1; j < ct.length; j++) 
			{
				if (gasses[i]==gasses[j])
				{
					CharCount++;
					ct[j]= Integer.MIN_VALUE;
				}
			}
			
			ct[i]=CharCount;
		}
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < ct.length; i++) 
		{
				if (max<ct[i]) 
				{
					max = ct[i];
				}
		}
		
		
		for (int i = 0; i < ct.length; i++) 
		{
			if (max == ct[i])
			{
				System.out.println(gasses[i]);
			}
		}
		
		System.out.println("Is the Domenating Gas");
	

	}

	public static int  CountOfMoonHavingRings(OverView[] planet)
	{
		int sum = 0;
		
		for (int i = 0; i < planet.length; i++) 
		{
			if (planet[i].rings==true) 
			{

					sum+=planet[i].moons;
			}
		}
		
		return sum;
		
	}

}
