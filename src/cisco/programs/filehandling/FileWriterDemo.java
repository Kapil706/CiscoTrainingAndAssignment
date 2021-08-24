package cisco.programs.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //String data = "This is the data in the output file";
     
     Scanner scn = new Scanner(System.in);
     
     System.out.println("Enter the message to be written into file");
     
     String data = scn.nextLine();
     
     try{
    	 // create the file
    	 FileWriter fw = new FileWriter("C://KChaudharyTrainingsCisco//Myfile.txt");
    	 // write to the file
    	 fw.write(data);
    	 
    	 System.out.println("Data is written into file");
    	 
    	 
    	 //close the file
    	 fw.close();
    	 
    	 
    	 
     }
     catch(IOException e){
    	  e.printStackTrace();
     }
	}

}
