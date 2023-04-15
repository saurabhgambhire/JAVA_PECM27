package STRINGS;

import java.util.Scanner;

public class Anagram 
{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your First String = ");
			String s1 = sc.next().toLowerCase();
			System.out.println("Enter your Secound String = ");
			String s2 = sc.next().toLowerCase();
			System.out.println(isAnagramm(s1,s2));
		}

		public static boolean isAnagramm(String s1, String s2) 
		{
			if (s1.length() == s2.length()) 
			{
				int ch1[] = new int[127];
				int ch2[] = new int[127];
				
				for (int i = 0; i < s1.length(); i++) 
				{
					int n1 = s1.charAt(i);
					ch1[n1]++;
					
					int n2 = s1.charAt(i);
					ch2[n2]++;
					
				}
				
				for (int i = 0; i < ch2.length; i++) 
				{
					if (ch1[i]!=ch2[i])
					{
						return false;
					}
				}
				
			} 
			else {
				return false;
			}
				return true;			
		}
}
