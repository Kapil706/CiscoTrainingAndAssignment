package cisco.programs.innerclasses;


class Outer{
	private int age=90;
	
	void dis(){
		System.out.println("inside dis method");
	}
	
	void outerMethod(){
		System.out.println("inside outer method");
		
		// inner class is local to outermethod()
		
		class Inner{
			void innermethod(){
				dis(); // calling the outer class method
				
				System.out.println("inside  innerMethod" + age);
				
			}
		}
		
		Inner y = new Inner();  // object creation of the local innerClass
		
		y.innermethod(); // calling inner class method
	}
}


public class Method_Local_Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Outer x = new Outer();
         
         x.outerMethod(); // calling outer class method
	}

}
