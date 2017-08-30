import java.util.Vector;

public class School{
	

	private String name;
	private Vector<Department> departments;

	public String getName() {
		return name;
	}


	public Vector<Department> getDepartments() {
		return departments;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}



	public void setDepartments(Vector<Department> departments) {
		this.departments = departments;
	}
	
	
	public School(String name, Vector<Department> departments) {
		this.departments = departments;
		this.name = name;
	}

}
