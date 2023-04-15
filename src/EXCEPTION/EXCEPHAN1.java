package EXCEPTION;

import java.util.Scanner;

public class EXCEPHAN1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter first Number ");
			int n1 = sc.nextInt();
			System.out.println("Enter Secound Number ");
			int n2 = sc.nextInt();
			
			int res = n1/n2;
			System.out.println("The result id "+res);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
