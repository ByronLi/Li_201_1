import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

public class School{
	
	//@Expose()
	private String name;
	//@Expose()
	private ArrayList<Department> departments;

	public String getName() {
		return name;
	}


	public ArrayList<Department> getDepartments() {
		return departments;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}



	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}
	
	public boolean hasDepartments() {
		return departments.size() != 0;
	}
	
	
	public School(String name, ArrayList<Department> departments) {
		this.departments = departments;
		this.name = name;
	}

}
