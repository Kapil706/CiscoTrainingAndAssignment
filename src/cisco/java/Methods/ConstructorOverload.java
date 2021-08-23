package cisco.java.Methods;

public class ConstructorOverload {

	long id;
	String name;
	int age = 10;
	
	
	
	public ConstructorOverload(long id, String name) {
		
		this.id = id;
		this.name = name;
	}



	ConstructorOverload(long id, String name, int age) {
	
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	void display(){
		System.out.println(id+""+name+""+age);
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ConstructorOverload s1= new ConstructorOverload(111,"Kapil");
         ConstructorOverload s2= new ConstructorOverload(111,"Kapil", 25);
	     s1.display();
	     s2.display();
	}

}
