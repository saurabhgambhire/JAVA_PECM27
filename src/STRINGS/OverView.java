package STRINGS;

import java.util.Arrays;

public class OverView
{
	String planet;
	String[] gases;
	int moons;
	boolean rings;
	
	public OverView() {
		// TODO Auto-generated constructor stub
	}

	public OverView(String planet, String[] gases, int moons, boolean rings) {
		super();
		this.planet = planet;
		this.gases = gases;
		this.moons = moons;
		this.rings = rings;
	}

	@Override
	public String toString() {
		return "[planet=" + planet + ", gases=" + Arrays.toString(gases) + ", moons=" + moons + ", rings="
				+ rings + "]";
	}

	



	
	
	
	

}
