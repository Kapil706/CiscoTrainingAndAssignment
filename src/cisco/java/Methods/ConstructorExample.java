package cisco.java.Methods;

public class ConstructorExample {
	int id;
	String name;
	
	ConstructorExample(){
		id=10;
		name="hello";
		System.out.println("I am inside the default Constructor");
	}
	
	void display(){
		System.out.println(id+""+name);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	  ConstructorExample s2 = new ConstructorExample();
	  s2.display();
	  
	}

}
