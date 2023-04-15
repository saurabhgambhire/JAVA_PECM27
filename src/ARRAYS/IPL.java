package ARRAYS;

import java.util.Arrays;

public class IPL 
{
	String name;
	int points;
	char[] lastMatches;
	
	public IPL() {
		// TODO Auto-generated constructor stub
	}

	public IPL(String name, int points, char[] lastMatches) {
		super();
		this.name = name;
		this.points = points;
		this.lastMatches = lastMatches;
	}

	@Override
	public String toString() {
		return "IPL [name=" + name + ", points=" + points + ", lastMatches=" + Arrays.toString(lastMatches) + "]";
	}
	
	

}
