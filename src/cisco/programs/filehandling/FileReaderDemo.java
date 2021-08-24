package cisco.programs.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		
	   char[] str = new char[100];
		// TODO Auto-generated method stub
       try{
    	   // create the file and read it char by char
    	   FileReader fr = new FileReader("C://KChaudharyTrainingsCisco//Myfile.txt");
    	   
    	   fr.read(str);
    	   
    	   System.out.println(str);
    	   
    	   fr.close();
    	   
       }
       catch(IOException e){
    	   e.printStackTrace();
       }
	}

}
