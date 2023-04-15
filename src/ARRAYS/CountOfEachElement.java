package ARRAYS;

public class CountOfEachElement {

	public static void main(String[] args) 
	{

		int[] a = {2,4,5,6,2,3,4};
		for (int i = 0; i < a.length-1; i++)
		{
			int ct = 1;
			int ele = a[i];
			if (a[i]== Integer.MIN_VALUE) 
			{
				continue;
			}
			
			for (int j = i+1; j < a.length; j++) 
			{
				if (ele == a[j])
				{
					ct++;
					a[j]=Integer.MIN_VALUE;
				}
			}
			
			System.out.println(a[i] +"==> "+ct);
		}

	}

}
