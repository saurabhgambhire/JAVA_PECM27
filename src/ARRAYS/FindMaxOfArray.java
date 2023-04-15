package ARRAYS;

public class FindMaxOfArray {

	public static void main(String[] args) 
	{
		int[] a = {2,5,3,7,5,8};
		int max = a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (max<a[i]) 
			{
				max = a[i];
			}
		}
		
		System.out.println("Max of Array  ==> "+ max);

	}

}
