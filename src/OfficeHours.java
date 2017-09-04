
public class OfficeHours {
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	public String toString() {
		if (time == null) {
			return day;
		}
		return day + " " + time.toString();
	}

	private String day = null;
	private Time time = null;
	
	public OfficeHours(String day, Time time) {
		this.day = day;
		this.time = time;
	}

}
