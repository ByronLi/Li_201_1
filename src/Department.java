import java.util.Vector;

public class Department{
	
	private String longName;
	private Vector<Course> courses;
	private String prefix;
	
	public Department() {}
	
	public Department(String longName, String prefix, Vector<Course> courses){
		this.prefix = prefix;
		this.longName = longName;
		this.courses = courses;
	}

}
