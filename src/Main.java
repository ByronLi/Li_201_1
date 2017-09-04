import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

import org.omg.CORBA.DynAnyPackage.TypeMismatch;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class Main {


	public static void main(String[] args) throws IOException, FileNotFoundException, JsonSyntaxException {
		
		//Vector<School> schools;
		SchoolColl schools = null;
		String input = null;
		int menuChoice = 0;
		int menu = 0;
		Scanner sn = new Scanner(System.in);
		Gson gson = new Gson();
		boolean exit = false;
		boolean noFile = true;
		
		while(noFile) {
			System.out.println("What is the name of the input file? ");
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
			
			String display = null;
			School menuSchool = null;
			Department menuDept = null;
			Course menuCourse = null;
			
			while (!exit) {
				int i = 1;
				
				if (menu == 0) {
					System.out.println("1) Display Schools");
					System.out.println("2) Exit");
				}
				
				else if (menu == 1) {
					System.out.println("Schools");
					for (School s: schools.getSchools()) {
						System.out.println(i + ") " + s.getName());
						i++;
					}
					System.out.println(i + ") Go to main menu");
					i++;
					System.out.println(i + ") Exit");
				}
				else if (menu == 2) {
					System.out.println(display + " Departments");
					for (Department d: menuSchool.getDepartments()) {
						System.out.println(i + ") " + d.getLongName() + " (" + d.getPrefix() + ")");
						i++;
					}
					System.out.println(i + ") Go to Schools Menu");
					i++;
					System.out.println(i + ") Exit");
					
				}
				else if (menu == 3) {
					System.out.println(display + " Courses");
					for (Course c: menuDept.getCourses()) {
						System.out.println(i + ") " + c.getNumber()+ " " + c.getTerm() + " " + c.getYear());
						i++;
					}
					System.out.println(i + ") Go to Departments Menu");
					i++;
					System.out.println(i + ") Exit");
					
				}
				else if (menu == 4) {
					System.out.println(display);
					System.out.println("View Course Staff");
					System.out.println("View Meeting Information");
					System.out.println(i + ") Go to Courses Menu");
					i++;
					System.out.println(i + ") Exit");
					
				}
				else if (menu == 5) {
					System.out.println(display);
					System.out.println("Meeting Information");
					for (Meeting m: menuCourse.getMeetings()) {
						System.out.println(i + ") " + m.getType());
						i++;
					}
					System.out.println(i + ") Go to " + display + " Menu");
					i++;
					System.out.println(i + ") Exit");
					
				}
				
				try {
					System.out.println("What would you like to do? ");
					menuChoice = sn.nextInt();
				}
				catch(InputMismatchException ime){
					System.out.println(ime + " " + sn.next() + " is Invalid Input");
					
				}
				
					if (menu == 0) {
						if (menuChoice > 2) {
						System.out.println("That is not a valid option");
						}
						else if (menuChoice == 1) {
							menu = 1;
						}
						else if (menuChoice == 2) {
							exit = true;
						}
					}
					else if (menu == 1) {
						if (menuChoice > i) {
							System.out.println("That is not a valid option");
						}
						else if (menuChoice == i) {
							exit = true;
						}
						else if (menuChoice == i-1) {
							menu--;
						}
						else {
							display = schools.getSchools().get(menuChoice).getName();
							menu ++;
							menuSchool = schools.getSchools().get(menuChoice-1);
							
						}
					}
					else if (menu == 2) {
						if (menuChoice > i) {
							System.out.println("That is not a valid option");
						}
						else if (menuChoice == i) {
							exit = true;
						}
						else if (menuChoice == i-1) {
							menu--;
						}
						else {
							display = menuSchool.getDepartments().get(menuChoice-1).getPrefix();
							menu ++;
							menuDept = menuSchool.getDepartments().get(menuChoice-1);
							
						}
					}
					else if (menu == 3) {
						if (menuChoice > i) {
							System.out.println("That is not a valid option");
						}
						else if (menuChoice == i) {
							exit = true;
						}
						else if (menuChoice == i-1) {
							menu--;
						}
						else {
							display = menuDept.getPrefix() + " " + menuDept.getCourses().get(menuChoice-1).getNumber() + " " + menuDept.getCourses().get(menuChoice-1).getTerm() + " " + menuDept.getCourses().get(menuChoice-1).getYear();
							menu ++;
							menuCourse = menuDept.getCourses().get(menuChoice-1);
							
						}
					}
					else if (menu == 4) {
						if (menuChoice > 4) {
							System.out.println("That is not a valid option");
						}
						else if (menuChoice == 4) {
							exit = true;
						}
						else if (menuChoice == 3) {
							menu--;
						}
						else if (menuChoice == 1) {
							menu += 2;
						}
						else if (menuChoice == 2) {
							menu ++;
						}
					}
					else if (menu == 5) {
						if (menuChoice > i) {
							System.out.println("That is not a valid option");
						}
						else if (menuChoice == i) {
							exit = true;
						}
						else if (menuChoice == i-1) {
							menu--;
						}
						else {
							
						}
					}
					
			}
			System.out.println("Thanks for using my program!");
	}
		
	

	public static boolean isMissingAttributes(SchoolColl schools) {
		if (schools.isEmpty()) {
			return true;
		}
		for (School sch: schools.getSchools()) { //Checking for departments
			if (sch.getName() == null) {
				return true;
			}
			if (!sch.hasDepartments()) {
				return true;
			}
			for (Department dept: sch.getDepartments()) { //Checking for courses
				if (dept.getLongName() == null) {
					return true;
				}
				if (dept.getPrefix() == null) {
					return true;
				}
				if (!dept.hasCourses()) {
					return true;
				}
				for (Course c : dept.getCourses()) {
					if (c.getNumber() == -1) {
						return true;
					}
					if (c.getYear() == -1) {
						return true;
					}
					if (c.getTerm() == null) {
						return true;
					}
					if (!c.hasStaff() || c.hasMeeting()) {
						return true;
					}
					for (Meeting m: c.getMeetings()) {
						if (m.getType() == null) {
							return true;
						}
						if (m.getSection() == null) {
							return true;
						}
					}
					for (Staff s: c.getStaffMembers()) {
						if (s.getType() == null || s.getId() == -1) {
							return true;
						}
						if (s.getName().getFname() == null || s.getName().getLname() == null) {
							return true;
						}
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
