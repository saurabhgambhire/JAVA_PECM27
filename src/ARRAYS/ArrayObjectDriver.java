package ARRAYS;

import java.util.Arrays;

public class ArrayObjectDriver {

	public static void main(String[] args) 
	{
		ArrayObject[] arr = new ArrayObject[10];
		arr[0]=new ArrayObject(1, "saurabh", "cs", 9359691331l);
		arr[1]=new ArrayObject(2, "sumeet", "mechanical", 9359691331l);
		arr[2]=new ArrayObject(3, "rakesh", "mechanical", 9638527410l);
		arr[3]=new ArrayObject(4, "aniket", "mechanical", 9359691331l);
		arr[4]=new ArrayObject(5, "sachin", "cs", 9359691331l);
		arr[5]=new ArrayObject(6, "karan", "mechanical", 9359691331l);
		arr[6]=new ArrayObject(7, "vishal", "cs", 9359691331l);
		arr[7]=new ArrayObject(8, "ravindra", "cs", 9359691331l);
		arr[8]=new ArrayObject(9, "akash", "cs", 9359691331l);
		arr[9]=new ArrayObject(10, "sanket", "cs", 9359691331l);
		
		


		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i].id);
		}
//		System.out.println("==================================================");
//		Arrays.sort(arr);
//		
//		for (int i = 0; i < arr.length; i++) 
//		{
//			System.out.println(arr[i]);
//		}
		
		
	}

}
