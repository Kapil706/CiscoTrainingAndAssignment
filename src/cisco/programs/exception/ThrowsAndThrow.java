package cisco.programs.exception;

import java.io.IOException;

public class ThrowsAndThrow {
	// Throws is a checked exception which means it throws exception at compile time
	// Throw can work both with checked and unchecked exception
	// Throws can only work with Checked exceptions
	
	void m() throws IOException{
		throw new IOException("device error");
	}
	void n() throws IOException{
		m();
	}
	
	void p(){
		try{
			n();
		}
		catch(Exception e){
			System.out.println("exception handled");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println(e.getClass());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsAndThrow ob = new ThrowsAndThrow();
		ob.p();
		System.out.println("normal flow ..");

	}

}
