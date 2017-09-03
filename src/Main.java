import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class Main {


	public static void main(String[] args) throws IOException, FileNotFoundException, JsonSyntaxException {
		
		//Vector<School> schools;
		SchoolColl schools;
		String input = null;
		int menuChoice = 0;
		Scanner sn = new Scanner(System.in);
		Gson gson = new Gson();
		boolean exit = false;
		boolean noFile = true;
		
		while(noFile) {
			input = sn.next();
			BufferedReader test = null;
			
			try {
				test = new BufferedReader(new FileReader(input));
					if (	isJsonValid(test)) {
						noFile = false;
					}
					else {
						System.out.println("That file is not a well-formed JSON file");
					}
				}
			catch(FileNotFoundException fnfe) {
					System.out.println("The file could not be found");
				}
			catch(JsonSyntaxException jse) {
				System.out.println(jse);
			}		
		}	
		
			try {
								
					BufferedReader br = new BufferedReader(new FileReader(input));				
					schools = gson.fromJson(br, SchoolColl.class);		
					//System.out.print(schools.getSchools().get(0).getName());		
					br.close();
					
				
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
	}
		
	

	public static boolean isMissingAttributes(SchoolColl schools) {
		if (schools.isEmpty()) {
			return true;
		}
		for (School sch: schools.getSchools()) { //Checking for departments
			if (!sch.hasDepartments()) {
				return true;
			}
			for (Department dept: sch.getDepartments()) { //Checking for courses
				if (!dept.hasCourses()) {
					return true;
				}
				for (Course c : dept.getCourses()) {
					if (!c.hasStaff() && c.hasMeeting()) {
						return true;
					}
				}
			}
		}
		
		return false;
		
	}
/* From https://stackoverflow.com/questions/10174898/how-to-check-whether-a-given-string-is-valid-json-in-java */
	public static boolean isJsonValid(BufferedReader test) throws JsonSyntaxException{
	    try {
	    		JsonParser parser = new JsonParser();
	    		parser.parse(test);
	    }
	    catch(JsonSyntaxException jse) {
	    		System.out.println(jse + "Json Syntax Invalid");
	    		return false;
	    }
	    return true;
	}
}
