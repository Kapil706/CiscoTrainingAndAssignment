package cisco.program.regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssignmentRegexOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> gmail = new ArrayList<String>();  
		
	  
        gmail.add("firstname@gmail.com");  
        gmail.add("virendra@gmail.com");  
        gmail.add("test123prepare@co.edu.com");  
      
        
        String emailreg = "^[A-Za-z0-9]+@(.+)$"; 
        // + is for setting as length or as many characters
        // @ for @
        // ^ if for checking any character before
        // $ is for checking any character after last
     
         
        Pattern pattern = Pattern.compile(emailreg);  
      
        for(String email : gmail){  
           
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  

	}


