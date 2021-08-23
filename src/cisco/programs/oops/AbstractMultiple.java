package cisco.programs.oops;

abstract class Bike{
	Bike(){
		System.out.println("Bike is created");
	}
	
	abstract void run1();
	
	void changeGear(){
		System.out.println("gear changed");
	}
}

abstract class Honda extends Bike{
	Honda(){
		System.out.println("honda is created");
	}
	
	abstract void run();
	
	abstract void run1();
}


class Hello extends Honda{
	void run(){
		System.out.println("running safely...");
		
	}

	@Override
	void run1() {
		// TODO Auto-generated method stub
		System.out.println("inside the run1 method");
	}
}

public class AbstractMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Honda ob = new Hello();
           
           ob.run();
           ob.run1();
           ob.changeGear();
	}

}
