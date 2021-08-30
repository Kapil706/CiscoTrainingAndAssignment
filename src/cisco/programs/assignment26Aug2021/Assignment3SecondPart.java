package cisco.programs.assignment26Aug2021;

class Monkey{
	
	public void jump(){
		System.out.println("Monkey jump");
	}
	
	public void bite(){
		
		System.out.println("Monkey bite");
	}
	
	
}

interface Animal{
	
	void eat();
	void sleep();
	
}

class Human extends Monkey implements Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Human Eat");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Human Sleep");
	}	
	
	public void jump(){
		System.out.println("Human jump");
	}
	
	public void bite(){
		
		System.out.println("Human bite");
	}
	
	
	
}




public class Assignment3SecondPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human human = new Human();
	    
        human.bite(); 
        human.eat(); 
        human.sleep();
        human.jump();
        
        Monkey m = new Monkey();
        
        m.bite();
        m.jump();
        
        
		

	}

}
