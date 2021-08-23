package cisco.programs.assignmentoops;

public class AssignmentOne {
	
	public int calculate(int a, int b){
		return a+b;
	}

	public float calculate(int r){
		return (float)(3.14*r*r);
	}
	public int calculate(float l , float b){
		return (int)(l*b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		AssignmentOne o = new AssignmentOne();
		
		System.out.println(o.calculate(3,4));
		System.out.println(o.calculate(3));
		System.out.println(o.calculate(4.5f, 5.6f));
		
		
	}

}
