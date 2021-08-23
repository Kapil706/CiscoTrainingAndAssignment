package cisco.programs.exception;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		try{
			checkException();
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("Finally Outside method");
		}
	}
	
	public static void checkException(){
	
			int[] ar = new int[5];
			
			System.out.println(ar[7]);
	
		
	}

}
