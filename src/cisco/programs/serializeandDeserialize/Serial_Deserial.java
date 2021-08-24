package cisco.programs.serializeandDeserialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serial_Deserial {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Student stu = new Student(101,21,"Aarlo","Delhi",180);
        //====================== serialization ===========================
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try{
			
			
		    fos = new FileOutputStream("C://KChaudharyTrainingsCisco//student.ser");
			
		    oos = new ObjectOutputStream(fos);
			
		    oos.writeObject(stu);
		    
		    System.out.println("Serialization done");
			
			
			
		}
		catch(IOException ioe){
			System.out.println(ioe);
			
		}
		finally{
		    fos.close();
		}
		
		//===================== deserialization ========================
		
		Student o = null;
		
		try{
			FileInputStream fis = new FileInputStream("C://KChaudharyTrainingsCisco//student.ser");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
		    o=(Student)ois.readObject();
		
		ois.close();
		fis.close();
			
			
		}
		catch(IOException ioe){
			ioe.printStackTrace();
			return;
		}
		catch(ClassNotFoundException cnfe){
			System.out.println("Student class not found");
			cnfe.printStackTrace();
			return;
		}
		
		System.out.println("Student Name: "+o.getName());
		System.out.println("Student Age: "+o.getAge() );
		System.out.println("Student Roll No: "+o.getRollNum());
		System.out.println("Student Address: "+o.getAddress());
		System.out.println("Student Height: "+o.getHeight());
	}

}


class Student implements java.io.Serializable{
	
	private int RollNum;
	private int Age;
	private String Name;
	private String Address;
	private int Height;
	
	
	public Student(int rollNum, int age, String name, String address, int height) {
		super();
		RollNum = rollNum;
		Age = age;
		Name = name;
		Address = address;
		Height = height;
	}
	public int getRollNum() {
		return RollNum;
	}
	public void setRollNum(int rollNum) {
		RollNum = rollNum;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getHeight() {
		return Height;
	}
	public void setHeight(int height) {
		Height = height;
	}
	
	
	
}
