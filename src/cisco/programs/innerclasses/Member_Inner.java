package cisco.programs.innerclasses;


// inner class used to achieve data security
public class Member_Inner {
	
	
	private int data=30;
	
	void display(){
		System.out.println("I am inside the outer class method");
	}
	
	class Inner{
		private int data=20;
		
		void msg(){
			Member_Inner.this.display();
			System.out.println("data is: "+data);
		}
		
		// calling duplicate method of outer class
		void display(){
			System.out.println("i am inside the inner class method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Member_Inner obj = new Member_Inner(); // creating outer class object 
        
        Member_Inner.Inner in = obj.new Inner(); // creating inner class object
        
        
      //  obj.display();
        
        
        in.msg();
        in.display();
	}

}
