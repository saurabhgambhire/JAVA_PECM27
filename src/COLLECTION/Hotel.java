package COLLECTION;

import java.util.Arrays;

public class Hotel {

	
	int code;
	String name;
	String loc;
	int[] rooms;
	
	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	public Hotel(int code, String name, String loc, int[] rooms) {
		super();
		this.code = code;
		this.name = name;
		this.loc = loc;
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Hotel [code=" + code + ", name=" + name + ", loc=" + loc + ", rooms=" + Arrays.toString(rooms) + "]";
	}
	
	
}
