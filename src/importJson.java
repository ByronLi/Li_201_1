import java.util.List;
import java.io.*;
import java.util.Vector;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class importJson {
	
	public static School importJson(String input) throws IOException, FileNotFoundException{
		
		Gson gson = new Gson();
		//Vector<School> schools = null;
		School schools = null;
		
	//	School schools = gson.fromJson(input,School.class);
		
		try {
		
		BufferedReader br = new BufferedReader(new FileReader(input));
		String s;
		
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
		//School schol = gson.fro
	//	Type listType = new TypeToken<List<School>>() {}.getType();
		//String json = gson.fromJson(br, listType);
		
		//schools = gson.fromJson(br, new TypeToken<List<School>>(){}.getType());
		
		schools = gson.fromJson(br, School.class);
		
		br.close();
		
		}
		catch (FileNotFoundException fnfe){
			System.out.println("File Not Found: " + fnfe);
		}
		finally {
		}
		
		
		
		
		
		
		
		
		
		
		return schools;
	}

}
