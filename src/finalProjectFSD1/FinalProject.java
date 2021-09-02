package finalProjectFSD1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


/*  Creator of the Program : @KapilChaudhary Cisco India Technical Apprentice 
 * 
 */

/*  Project Name : Virutal Key for Your Repository 
 * 
 */


/* Java Concepts Used :
 * 1. static variables
 * 2. Collections
 * 3. Exception handling
 * 4. File handling
 * 5. Loops
 * 6. Functions
 * 7. Sorting technique
 * 8. switch
 * 9. Taking Every the User Side Only Means More Dynamic
 */


public class FinalProject {
	
	static Scanner scan = new Scanner(System.in);   // common scan object that's why static
	static String[] fileType ={".txt",".pdf",".doc",".png",".jpeg",".java","whatever you want"};  // common filetype

	public static void main(String[] args) {	
		 
        System.out.println("======================================Welcome to File Store Project (FSD1): ====================================\n");
        System.out.println("\n===== Developer Name : Kapil Chaudhary ======================\n");
        char ch;
        do{
            System.out.println("\n================================== File Store Operations ===============================");
            System.out.println("			1. Get File Store (Ascending-Order)");
            System.out.println("			2. Add    File to File Store");
            System.out.println("			3. Delete File from File Store");
            System.out.println("			4. Search File in File Store");
            System.out.println("	                5. Close File Store Application\n");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("File Store Contains:");
                try
                {
                     GetFileStore();
                }
                catch(Exception e)
                {
                    System.out.println("Error : " +e.getMessage());
                }                         
                break;                         
            case 2 : 
            	System.out.println("Adding file to File Store:");
                try
                {
                    AddToFileStore();
                }
                catch(Exception e)
                {
                    System.out.println("Error : " +e.getMessage());
                }
                break;                         
            case 3 : 
            	System.out.println("Deleting File from the File Store:");
                try
                {
                  DeleteFromFileStore();
                }
                catch(Exception e)
                {
                    System.out.println("Error : "+e.getMessage());
                }
                break;                            
            case 4 :
            	System.out.println("Searching the File from the File Store");
            	try
                {
                  SearchFileStore();
                }
                catch(Exception e)
                {
                    System.out.println("Error : "+e.getMessage());
                } 
                break;                
            case 5 : 
            	System.out.println("Hey You Like the File Store Thanks for Using Bye .......");
            	try
                {
                   CloseFileStore();
                }
                catch(Exception e)
                {
                    System.out.println("Error : "+e.getMessage());
                }
                break;                         
            default : System.out.println("Wrong Entry \n ");
                break;
            }         
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y'); 
        
        if(ch == 'N' || ch=='n'){  // this has been added here to make application more user friendly
        	System.out.println("Hey You Like the File Store Thanks for Using Bye .......");
        	try
            {
               CloseFileStore();
            }
            catch(Exception e)
            {
                System.out.println("Error : "+e.getMessage());
            }
        }

	}

	private static void CloseFileStore() {
		// TODO Auto-generated method stub
		
		System.exit(1);  // It will close the Application
		
	}
	
	/* This method searches the file inside the file store */

	private static void SearchFileStore() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the file to be searched..in File Store (Case-Sensitive) ");
		
		String fileName = scan.next();
		
        System.out.println("Searching for the File "+ fileName);
		
		System.out.println("Enter the extension of file that need to be Searched From the to File Store");
		
	    System.out.println("Available Types are:");
	    
	    for(String ftype:fileType){
	    	 System.out.println("file Type: "+ftype);
	    }
	     
	    String ftype = scan.next();
		
		String fullfileName = fileName+ftype;  
		
		File file = new File("C://KChaudharyTrainingsCisco//");  // opening the directory in which file needs to be searched
		
	
		List<String> listFile = Arrays.asList(file.list());  // listing all files and parsing them into List of type String
		
		boolean flag=false;
		
		for (String fname : listFile) {   // Searching the file inside the File Store i.e List
			if (fullfileName.equals(fname)) {
				
				flag=true;
				break;
			}
			else {
			
				flag=false;
			}
			
		}
		if(flag) {
			System.out.println("File "+fullfileName+" is present in File Store");
		}
		else{
			System.out.println("File is not present in File Store");
			
		}
		
	}

	/* This method deletes file from the file store */
	private static void DeleteFromFileStore() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the File Name you need to Delete From the File Store (Case-Sensitive)");
		
		String fileName = scan.next();
		
		System.out.println("Searching for the File "+ fileName +" that Needs to be Deleted");
		
		System.out.println("Enter the extension of file that need to be Delete From the to File Store");
		
	    System.out.println("Available Types are:");
	    
	    for(String ftype:fileType){
	    	 System.out.println("file Type: "+ftype);
	    }
	     
	    String ftype = scan.next();
		
		File file = new File("C://KChaudharyTrainingsCisco//"+fileName+ftype);  // opening the file that's need to be deleted from the directory
		
		if(file.exists()){
			System.out.println("File is in File Store");
			System.out.println("Deleting the "+file.getName()+" from the File Store..");
			boolean b = file.delete();  // deleting the file
			if(b){
				System.out.println("File deleted from the File Store..");
			}
			else{
				System.out.println("File not deleted...");
			}
		}
		else{
			System.out.println("File is not in File Store");
		}
		
		
			
		
	}

	private static void AddToFileStore() throws IOException {
		// TODO Auto-generated method stub
		
	     System.out.println("Enter the File Name you need to Add to File Store");
	     
	     String fileName = scan.next();
	     
	     
	     
	     System.out.println("Enter the Type of File you need to Add to File Store");
	     System.out.println("Available Types are:");
	     for(String ftype:fileType){
	    	 System.out.println("file Type: "+ftype);
	     }
	     
	     String ftype = scan.next();
	     
	     
	     File file = new File("C://KChaudharyTrainingsCisco//"+fileName+ftype);  // Opening the directory and appending the filename to the path
		
	     if(file.createNewFile()==true){   // creating the file in directory
	    	 System.out.println("New File"+" "+file.getName()+" "+"Created in File Store");
	     }else {
	    	 if (file.exists()) {
	    	 System.out.println("File already exists.");
	            }else {
	    	 System.out.println("File does not exists.");
	    	 }
	     } 	 
		
	}

	private static void GetFileStore() {
		// TODO Auto-generated method stub
		
		
		File file = new File("C://KChaudharyTrainingsCisco//");  // Main File Store Directory opening
		
		if(file != null){
			
			System.out.println("\nDirectory Name: "+file.getName()+ "\n"); 
			
			List<String> listFile = Arrays.asList(file.list());   // listing all files and parsing them into List of type String
			
			TreeSet<String> treeset = new TreeSet<String>(listFile);  // O(N) for Internal Sorting 
			
			System.out.println("\nFile Store in Sorted Order of Files: \n");
			
			for(String s : treeset){
	            System.out.println("********["+s+"]********");  // showing all the files in File Store
	        }  
		} 
		else
			System.out.println("\nFile Store is not present");   
	}

}
