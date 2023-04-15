package ARRAYS;

public class ConvertEvenIfOdd {

	public static void main(String [] args)
	{
		int a[] ={2,3,5,6,9};
	  int ans[] = new int[a.length];
	  
	  for(int i=0; i<a.length; i++)
	  {
	  	 if(a[i]%2!=0)
	    {
	    	ans[i]=a[i]+1;
	    }
	    else
	    {
	    	ans[i]=a[i];
	    }
	  }
	  
	  for (int i = 0; i < ans.length; i++) 
	  {
		System.out.print(ans[i]+" ");
	  }
	}
}
