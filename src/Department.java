import java.util.ArrayList;
import java.util.Vector;

public class Department{
	
	
	private String longName = null;
	private ArrayList<Course> courses = null;
	private String prefix = null;
	
	
	public String getLongName() {
		return longName;
	}


	public void setLongName(String longName) {
		this.longName = longName;
	}


	public ArrayList<Course> getCourses() {
		return courses;
	}


	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}


	public String getPrefix() {
		return prefix;
	}


	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public boolean hasCourses() {
		return courses.size() != 0;
	}
	
	
	public Department(String longName, String prefix, ArrayList<Course> courses){
		this.prefix = prefix;
		this.longName = longName;
		this.courses = courses;
	}

}
