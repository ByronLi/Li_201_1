import java.util.ArrayList;
import java.util.Vector;

public class Staff {
	
	private String type;
	private int id;
	private Name name;
	private String email;
	private String phone;
	private String office;
	private ArrayList<OfficeHours> officeHours;
	private String image;
	
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
