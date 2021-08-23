package cisco.programs.exception;

import java.io.IOException;
import java.util.Scanner;

public class ThrowExample {
	
	static int add(int a, int b)throws IOException{
		// alteration done 
		
		
		if(a>900){
			throw new ArithmeticException("Num1 is greater than 900 hence throw exception");
			
			
		}
		else{
			
			//alteration to be done
			throw new IOException("Num1 is less than 900 exception is here");
			//System.out.println("Both are correct");
			
		}
		//return a+b;  // unreachable code due IOException thrown
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int res=0;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter number a: ");
		int a = scn.nextInt();
		
		System.out.println("Enter number b: ");
		int b = scn.nextInt();
		
		try{
			res= add(a,b);
		}
		catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}
		
		System.out.println("Result is: "+res);
		

	}

}
