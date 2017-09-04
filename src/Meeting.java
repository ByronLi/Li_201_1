import java.util.ArrayList;
import java.util.Vector;

public class Meeting {
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public ArrayList<OfficeHours> getMeetingPeriods() {
		return meetingPeriods;
	}

	public void setMeetingPeriods(ArrayList<OfficeHours> meetingPeriods) {
		this.meetingPeriods = meetingPeriods;
	}

	public ArrayList<Assistant> getAssistants() {
		return assistants;
	}

	public void setAssistants(ArrayList<Assistant> assistants) {
		this.assistants = assistants;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Section: " + section);
		sb.append("\nRoom:  " + room);
		sb.append("\nMeetings: ");
		if (meetingPeriods.size() == 0) {
			sb.append("None");
			return sb.toString();
		}
		for (OfficeHours oh: meetingPeriods) {
			sb.append(oh.toString() + "  ");
		}
		return sb.toString();
	}
	
	public ArrayList<Integer> getAssistantIDs(){
		ArrayList<Integer> asID = new ArrayList<Integer>();
		if (assistants == null) {
			return null;
		}
		for (Assistant as: assistants) {
			asID.add(as.getStaffMemberID());
		}
		return asID;
	}
	
	private String type = null;
	private String section = null;
	private String room = null;
	private ArrayList<OfficeHours> meetingPeriods = null;
	private ArrayList<Assistant> assistants = null;
	
	public Meeting(String type, String section, String room, ArrayList<OfficeHours> meetingPeriods, ArrayList<Assistant> assistants){
		this.type = type;
		this.section = section;
		this.room = room;
		this.meetingPeriods = meetingPeriods;
		this.assistants = assistants;
	}
	

}
