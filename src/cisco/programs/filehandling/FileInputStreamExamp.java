package cisco.programs.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExamp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     
		
		FileInputStream fs = new FileInputStream("C://KChaudharyTrainingsCisco//Myfile.txt");
		
		System.out.println("File contents");
		
		int ch;
		while((ch=fs.read())!=-1){
			System.out.println((char)ch);
		}
		
		fs.close();
		
	}

}
