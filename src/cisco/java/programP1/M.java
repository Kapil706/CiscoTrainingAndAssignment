package cisco.java.programP1;

public class M {
       
	private int a=20;
	
	long u = 30L;
	
	protected float f = 7.6f;
	
	
	public void PublicMethod(){
		PrivateMethod();
//		defaultMethod();
//		ProtectedMethod();
		
	}
	
	void defaultMethod(){
	    PrivateMethod();
	}
	
	protected void ProtectedMethod(){
		PrivateMethod();
	}
	
	private void PrivateMethod(){
		System.out.println("private variable value " +a);
		System.out.println("protected variable value " +f);
		System.out.println("default variable value " +u); 
	}
	
	
	
	
}
