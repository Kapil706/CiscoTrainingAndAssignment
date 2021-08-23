package cisco.programs.oops;

class Animal{
	public void eat()
	{
		System.out.println("eat ");
	}
	
}

class Dog extends Animal{
	// eat()
	
	void bark(){
		System.out.println("bark");
	}
}

class BabyDog extends Dog{
	// eat  bark
	
	void weep(){
		System.out.println("weep ");
	}
}








public class Multilevel {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BabyDog g= new BabyDog();
        
        g.weep();
        g.bark();
        g.eat();
        
	}

}
