package cisco.programs.exception;

public class CustomException {
    
	static void validate(int age) throws InvalidAgeException{
		if(age<18){
			throw new InvalidAgeException("not valid");
			
		}
		else
			System.out.println("welcome to vote");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			validate(17);
			
		}
		catch(Exception e){
			System.out.println("Exception occured: "+e.getMessage());
		}
		
		System.out.println("rest of the code...");

	}
	
	

}

class InvalidAgeException extends Exception{
	
	InvalidAgeException(String s){
		super(s);
	}
}
