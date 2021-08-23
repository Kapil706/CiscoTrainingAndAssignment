package cisco.java.programP2;

class X {
     
	private int num = 23;
	
	long numlong = 34L;
	
	protected float numfloat = 345.6f;
	
	public char ch= 'M';
	
	public void PublicMethodX(){
		System.out.println("public character variable of class X "+ch);
		PrivateMethodX();
		
	}
	
	void defaultMethodX(){
		System.out.println("default variable of class X " +numlong); 	
	}
	
	protected void ProtectedMethodX(){
		System.out.println("protected variable value of class X  " +numfloat);
	}
	
	private void PrivateMethodX(){
		System.out.println("private variable value of class X " +num);
			
	}
	
	
	
}
