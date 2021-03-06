import java.util.Vector;

public class Course {
	public Vector<Staff> getStaffMembers() {
		return staffMembers;
	}

	public void setStaffMembers(Vector<Staff> staffMembers) {
		this.staffMembers = staffMembers;
	}

	public Vector<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(Vector<Meeting> meetings) {
		this.meetings = meetings;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public boolean hasStaff() {
		return staffMembers.size() != 0;
	}
	public boolean hasMeeting() {
		return meetings.size() != 0;
	}

	private Vector<Staff> staffMembers = null;
	private Vector<Meeting> meetings = null;
	private int number = -1;
	private String term = null;
	private int year = -1;
	
	public Course(int number, String term, int year, Vector<Staff> staffMembers, Vector<Meeting> meetings) {
		this.number = number;
		this.term = term;
		this.year = year;
		this.staffMembers = staffMembers;
		this.meetings = meetings;
	}
	
	
	
	

}
