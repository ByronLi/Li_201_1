import java.util.ArrayList;
import java.util.Vector;

public class Staff {
	
	private String type = null;
	private int id = -1;
	private Name name;
	private String email = null;
	private String phone = null;
	private String office = null;
	private ArrayList<OfficeHours> officeHours;
	private String image = null;
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public ArrayList<OfficeHours> getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(ArrayList<OfficeHours> officeHours) {
		this.officeHours = officeHours;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(type + "\nName: " + name.toString() +"\n"+"Email: " + email + "\n" + "Image: " + image + "\n" + "Phone: " + phone + "\n" + "Office: " + office + "\n" + "Office Hours: ");
		if (officeHours.size() == 0) {
			sb.append("None");
			return sb.toString();
		}
		for (OfficeHours oh: officeHours) {
			sb.append(oh.toString() + " ");
		}
		return sb.toString();
	}

	
	public Staff(String type, int id, Name name, String email, String image, String phone, String office, ArrayList<OfficeHours> officeHours) {
		this.type = type;
		this.id = id;
		this.name = name;
		this.email = email;
		this.image = image;
		this.phone = phone;
		this.office = office;
		this.officeHours = officeHours;
		
	}
	

}
