package cisco.programs.oops;




class Bank{
	float getROI(){
		return 0;
	}
	
}

class SBI extends Bank{
	float getROI(){
		return 8.4f;
	}
}
class ICICI extends Bank{
	float getROI(){
		return 7.3f;
	}
}
class AXIS extends Bank{
	float getROI(){
		return 9.7f;
	}
}


public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Bank b;
         b = new SBI();
         System.out.println("SBI :"+b.getROI());
         
         b = new ICICI();
         System.out.println("ICICI :"+b.getROI());
         
         b = new AXIS();
         System.out.println("AXIS :"+b.getROI());
	}

}
