
public class Name {
	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	private String fname = null;
	private String lname = null;

	
	public Name(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
}
