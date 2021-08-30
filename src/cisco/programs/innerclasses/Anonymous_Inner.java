package cisco.programs.innerclasses;

class Demo{
	
	void show(){
		System.out.println("I am in show method of super class");
	}
}
public class Anonymous_Inner {
	
	// an anonymous class with demo as base class
	
	static Demo d = new Demo(){
		void show(){
			super.show();
			System.out.println("I am in anonymous class");
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         d.show();
	}

}
