package STRINGS;

import java.util.Iterator;
import java.util.Scanner;

import ARRAYS.charReapt;

class String1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String ");
		String str = sc.next();
	
//		System.out.println("Enter sub-String ");
//		String substr = sc.next();
		
//		System.out.println(isSubStringOfString(str,substr));
		
		replaceWithClosestVowel(str);
		
		
		
	}

	public static boolean isSubStringOfString(String str, String substr)
	{
		char[] main = str.toCharArray();
		char[] sub = substr.toCharArray();
		
		int count =0;
		int k=0;
		for (int i = 0; i < main.length; i++)
		{			
			if (main[i]==sub[k])
			{
				count++;
				k++;
				if (count==sub.length)
				{
					return true;
				}
			}
			else {
				count=0;
				k=0;
			}
		}

		return false;
	}

	private static void replaceWithClosestVowel(String str)
	{
		String ans="";
		String vowel = "aeiou";
		for (int i = 0; i < str.length(); i++) 
		{
			String ch = String.valueOf(str.charAt(i));
			
			if (!vowel.contains(ch)) 
			{
				ans= ans + closestVowel(str.charAt(i));
			}
			else {
				ans = ans + str.charAt(i);
			}
		}
		
		System.out.println(ans);
	}

	public static char closestVowel(char charAt) 
	{
		String vowel ="aeiou";
		
		int[] differnce = new int[vowel.length()];
		
		for (int i = 0; i < vowel.length(); i++) 
		{
			int d = vowel.charAt(i)-charAt;
			differnce[i]=Math.abs(d);
		}
		
		int min =Integer.MAX_VALUE;
		int min_index=0;
		for (int i = 0; i < differnce.length; i++)
		{
			if (min>differnce[i]) 
			{
				min = differnce[i];
				min_index=i;
			}
		}
		
	
		
		return vowel.charAt(min_index);
	}

//private static boolean isSubStringOfString(String str, String substr)
//	{
//				int n = substr.length();
//				int count =0;
//				int k=0;
//				for (int i = 0; i < str.length();i++ ) 
//				{    
//					if (str.charAt(i)== substr.charAt(k))
//					{
//						count++;
//						k++;
//						if (count == n)
//						{
//							return true;
//						}
//					}
//					else {
//						count=0;
//						k=0;
//						
//					}
//					
//					
//				}
//				
//				return false;
//	}
	
	
	
}