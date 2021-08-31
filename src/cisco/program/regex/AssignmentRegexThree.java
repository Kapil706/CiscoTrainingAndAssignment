package cisco.program.regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssignmentRegexThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// password validation 
		
		ArrayList<String> pass = new ArrayList<String>();
		
		pass.add("yahoo123oohya");
		pass.add("Yah123ooha");
		pass.add("Y123ahooHa");
		
		
		String password = "^[A-Z]{1}[0-9]{3}[A-Za-z]{6}$";
		
		Pattern p = Pattern.compile(password);
		
		for(String pas : pass){
			
			Matcher match = p.matcher(pas);
			
			System.out.println(pas+" : "+match.matches()+"\n");
			
		}

	}

}
