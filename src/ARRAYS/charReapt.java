package ARRAYS;

public class charReapt {

	public static void main(String[] args)
	{
		char[] ch = {'a','b','c','a','b'};
		
		for (int i = 0; i < ch.length-1; i++) 
		{
			if (ch[i]=='1') 
			{
				continue;
			}
			
			char c = ch[i];
			int ct = 1;
			for (int j = i+1; j < ch.length; j++) 
			{
				if (c == ch[j]) 
				{
					ct++;
					ch[j]='1';
				}
			}
			
			System.out.println(c+" == "+ct);
		}

	}

}
