package cisco.programs.assignmentexception;

import java.util.Scanner;

public class CustomException {
	
	static void salary(int sal)throws SalaryException{
		if(sal<2000){
			throw new SalaryException("you need to work hard");
		}
		else if(sal>2100 && sal<5000){
			throw new SalaryException("your salary is somehow good");
		}
		else if(sal>5100 && sal<9000){
			throw new SalaryException("salary is very good");
		}
		else {
			System.out.println("welcome to non pay");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   try{
		   
		   salary(4000);
		   
	   }
	   catch (Exception e){
		   System.out.println("Exception occured: "+e.getMessage());
	   }
	   

		
		
   
	}

}


class SalaryException extends Exception{
	
	SalaryException(String s){
		super(s);
	}
	
}
