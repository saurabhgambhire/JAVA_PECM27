package ARRAYS;

public class ReversOfEachOtherOrNot {

	public static void main(String[] args) 
	{

		int[] a = {1,2,3,4,5};
		int[] b = {5,4,3,2,1};
		
		if (a.length == b.length) 
		{
			int i;
			for ( i = 0; i < b.length; i++)
			{
				if (a[i]!=b[a.length-1-i])
				{
					break;
				}
				else {
					continue;
				}
			}
			
			if (i == a.length)
			{
				System.out.println("Arrays are reverse of eachother ");
			}
			else {
				System.out.println("Arrays are not reverse of eachOther");
			}
		}
		else {
			System.out.println("Arrays are not reverse of eachOther");
		}

	}

}
