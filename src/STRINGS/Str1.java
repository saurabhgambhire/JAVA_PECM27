package STRINGS;

public class Str1 
{
	public static void main(String[] args) 
	{
		String a= "abc";
		String b= "def";
		String c= "abcdef";
		String d= a+b;
		
		
		System.out.println(c==d);
		System.out.println();
		
		System.out.println(c);
		System.out.println(d);
		System.out.println();
		
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println();
		
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
		System.out.println();
		System.out.println(c.equals(d));
	}
}
