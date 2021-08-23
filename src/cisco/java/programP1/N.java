package cisco.java.programP1;

public class N extends M{
      
	protected long t = 54L;
	
	public int h = 45;
	
	double d = 3445.0;
	
	public void PublicMethodN(){
		System.out.println("public variable of class N " + h);
		defaultMethodN();
		ProtectedMethodN();
	}
	
	void defaultMethodN(){
		System.out.println("default variable value of class N " +d); 	
	}
	
	protected void ProtectedMethodN(){
		System.out.println("protected variable value of class N " +t);
	}
	
	 void PrivateMethodN(){
		
	}
	
	
}
