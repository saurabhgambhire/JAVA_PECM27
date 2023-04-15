package COLLECTION;

import java.util.ArrayList;

public class HotelDriver 
{
	public static void main(String[] args) {
		ArrayList<Hotel> list = new ArrayList<>();
		list.add(new Hotel(101, "oyo1", "Deccan", new int[] {1,2,3,4,5}));
		list.add(new Hotel(101, "oyo2", "Deccan", new int[] {11,12,13}));
		list.add(new Hotel(102, "oyo3", "Hadapsar", new int[] {21,22,23,24,25,26,27}));
		list.add(new Hotel(103, "oyo4", "Nigadi", new int[] {1,2,3,4,5,6,7,8,9,10}));
		
		System.out.println(list);
	}
}
