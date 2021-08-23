package cisco.java.Methods;

public class MethodOverload {
	
	public void Area(int b, int h){
		System.out.println("Area of triangle"+(0.5*b*h));
	}
	
public void Area(long r){
	System.out.println("Area of triangle"+(3.14*r*r));
	}

public void Area(float g, int c){
	System.out.println(g +"" + c);
}  

public void Area(int h , float g, char m){
	System.out.println(h+""+g+""+m);
}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverload ob = new MethodOverload();
		
		ob.Area(3,5);

	}

}
