
public class Time {
	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	private String start = "";
	private String end = "";
	
	public String toString() {
		return start+"-"+end;
	}
	
	public Time(String start, String end) {
		this.start = start;
		this.end = end;
	}

}
