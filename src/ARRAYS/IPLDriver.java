package ARRAYS;

import java.util.Iterator;

public class IPLDriver {

	public static void main(String[] args)
	
	{
		IPL[] teams = new IPL[9];
		
		teams[0] = new IPL("GT", 20, new char[] {'W','W','L','L','W'});
		teams[1] = new IPL("LGS", 18, new char[] {'W','L','L','W','W'});
		teams[2] = new IPL("RR", 16, new char[] {'W','L','W','L','L'});
		teams[3] = new IPL("DC", 14, new char[] {'W','W','L','W','L'});
		teams[4] = new IPL("RCB", 14, new char[] {'L','W','W','L','L'});
		teams[5] = new IPL("KKR", 12, new char[] {'L','W','W','L','W'});
		teams[6] = new IPL("PBKS", 12, new char[] {'L','W','L','W','L'});
		teams[7] = new IPL("CSK", 8, new char[] {'L','L','W','L','W'});
		teams[8] = new IPL("MI", 6, new char[] {'L','W','L','W','W'});
		
		
//		for (int i = 0; i < teams.length; i++) 
//		{
//			System.out.println(teams[i]);
//		}
		
		
		String[] ans =  twoConsecutiveLosses(teams,2,'w');
		for (int i = 0; i < ans.length; i++) 
		{
			if (ans[i]!=null) {
				System.out.println(ans[i]);
			}
		}



	}

	public static String[] twoConsecutiveLosses(IPL[] teams, int k, char c) 
	{
		if (c>='a'&&c<='z')
		{
			c-=32;
		}
		String[] sortedTeams = new String[teams.length];

		for ( int i = 0; i < teams.length; i++)
		{
			int count=0;
			for (int j = 0; j < teams[i].lastMatches.length; j++) 
			{
				if (teams[i].lastMatches[j]==c) 
				{
					count++;
					if (count == k) 
					{
						break;
					}					
				}
				else 
				{
					count=0;
				}
			}
			if (count>= k) 
			{
				sortedTeams[i]=teams[i].name;
			}
			
			
		}
		return sortedTeams;
		
		
	}

}
