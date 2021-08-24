package cisco.programs.filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try{
		File file = new File("C://KChaudharyTrainingsCisco//Myfile.txt");
	    
		if(file.createNewFile()==true){
			System.out.println("New File is created");
		}
		else{
			if(file.exists()){
				System.out.println("File already exists");
				
		        System.out.println("File path: "+file.getAbsolutePath());
		        System.out.println("File name "+file.getName());
		        System.out.println("File Class "+file.getClass());
		        System.out.println("File Space allocated"+file.getUsableSpace());
		        
			}
			else{
				System.out.println("File does not exist");
			}
			
			boolean b  = file.delete();
			
		    if(b==true){
				System.out.println("file deleted");
			}
			else{
			    System.out.println("File not deleted");
    		}
		}
	
	
	
	
	  }
       catch(IOException e){
    	   e.printStackTrace();
    	   
       }
	}
}
