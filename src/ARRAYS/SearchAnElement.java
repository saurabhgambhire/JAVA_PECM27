package ARRAYS;
import java.util.Scanner;

public class SearchAnElement {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		char[] c = {'s','a','u','r','a','b','h'};
		System.out.println("Enter your character = ");
		char ch = sc.next().charAt(0);
		
		if (isCharPresent(c,ch)) 
		{
			System.out.println("Character is presesnt :) ");
		}
		else {
			System.out.println("Character is not present :( ");
		}
		
		System.out.println("The character repeated "+howManyTimesCharReapeted(c,ch)+" times");
		
		System.out.println(NoOfVowelPresent(c));

	}

	public static int  NoOfVowelPresent(char[] c)
	{
		int ct =0;
		char[] v = {'a','e','i','o','u'};
		for (int i = 0; i < v.length; i++) 
		{
			for (int j = 0; j < c.length; j++) 
			{
				if (v[i]==c[j])
				{
					ct++;
				}
			}
		}
		
		return ct;
	}

	public static int howManyTimesCharReapeted(char[] c, char ch) 
	{
		int ct =0;
		for (int i = 0; i < c.length; i++)
		{
			if (c[i]==ch)
			{
				ct++;
			}
		}
		return ct;
	}

	public static boolean isCharPresent(char[] c, char ch)
	{
		for(int i =0; i<c.length; i++)
		{
			if (c[i]==ch)
			{
				return true;			
			}
		}
		
		return false;
	}

}
