
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

	private String day;
	private Time time;
	
	public OfficeHours(String day, Time time) {
		this.day = day;
		this.time = time;
	}

}
