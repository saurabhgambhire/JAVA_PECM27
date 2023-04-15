package ARRAYS;

public class ArrayObject implements Comparable<ArrayObject>
{	
	int id;
	String name;
	String branch;
	Long mobile;
	
	public ArrayObject() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", branch=" + branch + ", mobile=" + mobile + "]";
	}

	public ArrayObject(int id, String name, String branch, Long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.mobile = mobile;
	}
	
	public int compareTo(ArrayObject o)
	{
		return this.name.compareTo(o.name);
	}
	
	
	
}
