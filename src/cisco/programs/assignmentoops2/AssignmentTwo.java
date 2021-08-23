package cisco.programs.assignmentoops2;


abstract class MNC{
	
	abstract void Emp();
	
	abstract void Num();
	
	MNC(){
		System.out.println("you are in MNC");
	}
	
	public int TotalEmp(){
		return 990;
	}
	
	
}

abstract class Infosys extends MNC{
	
	
	public void Emp(){
		System.out.println("Employee of the company infosys");
	}
	
	abstract void Num();
	
}

class Hello extends Infosys{
	 
	
	
	void Num(){
		System.out.println("Number of emplyoee hello is 200");
	}
	
	
	public void party(){
		System.out.println("Party to banti hai");
	}
	
}





public class AssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Infosys f = new Hello();
       
       System.out.println(f.TotalEmp());
       f.Emp();
       f.Num();
       
       Hello ob = new Hello();
       
       ob.party();	
	}

}
