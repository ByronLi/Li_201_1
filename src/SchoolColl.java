import java.util.ArrayList;

public class SchoolColl {
	public ArrayList<School> getSchools() {
		return schools;
	}

	public void setSchools(ArrayList<School> schools) {
		this.schools = schools;
	}
	
	public boolean isEmpty() {
		if (schools.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public ArrayList<School> schools = new ArrayList<School>();
	
	public SchoolColl(ArrayList<School> schools) {
		
		this.schools = schools;
		
	}

}
