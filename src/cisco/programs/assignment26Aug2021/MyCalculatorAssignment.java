package cisco.programs.assignment26Aug2021;

import java.util.Scanner;

public class MyCalculatorAssignment {
    
	static long power(int n,int p) throws NegativeORZero{
		if(n<0 || p<0){
			throw new NegativeORZero("n or p should not be negative");
			
		}
		else if(n==0 && p==0){
			throw new NegativeORZero("n and p should not be zero");
		}
		else
		{
			// calculate power
			return (long) Math.pow(n, p);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the two number for power calculation:");
		
		int n= scn.nextInt();
		int p= scn.nextInt();
		try{
			long pw=power(n,p);
			System.out.println(n+" to power"+p+" is "+pw);
			
		}
		catch(Exception e){
			System.out.println("Exception occured: "+e.getMessage());
		}
		
		System.out.println("rest of the code...");

	}
	
	

}

class NegativeORZero extends Exception{
	
	NegativeORZero(String s){
		super(s);
	}
}
