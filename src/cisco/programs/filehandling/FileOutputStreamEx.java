package cisco.programs.filehandling;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
       
		// attach dis to keyboard
		DataInputStream dis = new DataInputStream(System.in);
		
		// attach to fileoutpustream
		
		FileOutputStream fout = new FileOutputStream("C://KChaudharyTrainingsCisco//Myfile.txt",true);
		// true means append the data
		
		// here data is being appended not override
		
		BufferedOutputStream bout = new BufferedOutputStream(fout,1024);
		 
	    System.out.println("Enter text @ at the end");
		
		
		char ch;
		
		while((ch=(char)dis.read())!='@'){
			
			bout.write(ch);
			
		}
		
		bout.close();
		
		
	}

}
