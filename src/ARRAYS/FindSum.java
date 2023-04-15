package ARRAYS;

public class FindSum {

	public static void main(String[] args)
	{
		int[] arr = {2,4,3,5,6,9};
		
		int even_sum =0;
		int prod_odd = 1;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i]%2==0) 
			{
				even_sum+=arr[i];
			}
			else {
				prod_odd*=arr[i];
			}
			
		}
		
		System.out.println(even_sum);
		System.out.println(prod_odd);

	}

}
