package cisco.programs.oops;
// it is tightly coupled 
// it means child is dependent on parent of declaration
// or parent is dependent on child for definition 
abstract class Abstract{
	private String name ="abc";
	
	Abstract(){
		System.out.println("inside the abstract class");
		
		
	}
	
	public void myMethod(){
		System.out.println("Hello"+name);
		
	}
	
	abstract public void anotherMethod();
}



public class AbstractMain extends Abstract {

	AbstractMain(){
	    super();
		System.out.println("Inside child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Abstract obj = new AbstractMain();
      
      obj.anotherMethod();
      obj.myMethod();
	}

	@Override
	public void anotherMethod() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method");
	}

}
