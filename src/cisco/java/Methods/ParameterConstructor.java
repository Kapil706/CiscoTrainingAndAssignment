package cisco.java.Methods;

public class ParameterConstructor {
    
	int id;
	String name;
	
	
	public ParameterConstructor(){
		System.out.println("inside");
	}
	
	public ParameterConstructor(int i, String n){
		id = i;
		name = n;
	}
	
	
	void display(){
		System.out.println(id+""+name);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ParameterConstructor s= new ParameterConstructor(111, "Kapil");
	    s.display();
	}

}
