package cisco.program.regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssignmentRegexTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Indian Phone number validation
		
		
		ArrayList<String> number = new ArrayList<String>();
		
		number.add("+919868453432");
		number.add("+91-9868453432");
		number.add("+91 9868453432");
		number.add("9868453432");
		number.add("+119868453432");
		
		
		
		String phone = "(((\\+){1}91){1})? ?-?[9876]{1}[0-9]{9}";
		// \\ for making + a sequence
	    // + for plus sign
		// {1} only one time
		// ? before this the part is optional
		// [9876] start with this if indian number 
		// [0-9] any digit between 0-9 can come
		// - for if +91-9898 these type of number
		
		
		Pattern p = Pattern.compile(phone);
		
		
		for(String num : number){
			
		       Matcher match = p.matcher(num);	
		       
		       System.out.println(num+ " : "+match.matches()+"\n");
		
		}
		
		
		

	}

}
