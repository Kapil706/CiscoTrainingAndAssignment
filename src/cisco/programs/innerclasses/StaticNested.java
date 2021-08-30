package cisco.programs.innerclasses;

public class StaticNested {
	
	static int u=90;
	
	private static void outerMethod(){
		System.out.println("inside outerMethod");
	}
	
	static class Inner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("inside inner class method " +u);
	     outerMethod();  // no need to create object as we are inside static class and calling a static method
	     
	 }
	}
}
