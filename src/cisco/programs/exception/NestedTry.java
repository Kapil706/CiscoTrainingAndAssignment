package cisco.programs.exception;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		try{
			checkException();
		}
		catch(ArithmeticException e){
			
		}
		finally
		{
			System.out.println("Finally Outside method");
		}
	}
	
	public static void checkException(){
		try{
			int res = 3/0;
			
		}
		catch(){
			
		}
		finally{
			System.out.println("Finally inside method");
		}
	}

}
