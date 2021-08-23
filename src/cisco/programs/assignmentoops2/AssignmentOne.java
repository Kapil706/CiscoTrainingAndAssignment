package cisco.programs.assignmentoops2;

class Vehicle{
	
	private int speed=5;
	private long distance=10;
	
	public int getSpeed() {
		return speed;
	}



	public long getDistance() {
		return distance;
	}

	

	Vehicle(){
		System.out.println("We are in default");
	}
	
	Vehicle(int speed, long distance){
		this.speed=speed;
		this.distance= distance;
	}
	
	public void run(){
		System.out.println("run Vehicle");
	}
	public void stop(){
		System.out.println("stop Vehicle");
	}
	
	
	public void fuel(int litre){
		System.out.println("Petrol litre: "+litre);
	}
	
    public void fuel(float litre, String PetrolPump){
    	System.out.println("Petrol litre "+litre+ "PetrolPump "+PetrolPump);
	}
     
    public void fuel(char fuelC, int price){
    	System.out.println("fuelC "+fuelC+"price "+price);
    }



	public void Display() {
		
		
	}
    
   // void Display();
}


class TwoWheel extends Vehicle{
	
	private int speed = 3;
	private long distance = 5;
	
	private int noOfTyre = 2;
	
	TwoWheel(){
		System.out.println("we are in default of Twowheel");
	}
	 
	public void run(){
		System.out.println("run two Wheel");
	}
	public void stop(){
		System.out.println("stop two wheel");
	}
    
	public void Display(){
		super.getSpeed();
		super.getDistance();
		System.out.println("two wheel speed "+speed);
		System.out.println("two wheel distance "+distance);
		System.out.println("No of Tyre"+noOfTyre);
	}
	
	
}

class ThreeWheel extends Vehicle{
	
	private int speed = 4;
	private long distance = 9;
	
	private int noOfTyre = 3;
	
	ThreeWheel(){
		System.out.println("we are in default of Threewheel");
	}
	 
	public void run(){
		System.out.println("run three Wheel");
	}
	public void stop(){
		System.out.println("stop three wheel");
	}
    
	public void Display(){
		super.getSpeed();
		super.getDistance();
		System.out.println("three wheel speed "+speed);
		System.out.println("three wheel distance "+distance);
		System.out.println("No of Tyre"+noOfTyre);
	}
	
	
} 

class FourWheel extends Vehicle{
	
	private int speed = 9;
	private long distance = 10;
	
	private int noOfTyre = 4;
	
	FourWheel(){
		System.out.println("we are in default of Fourwheel");
	}
	 
	public void run(){
		System.out.println("run Four Wheel");
	}
	public void stop(){
		System.out.println("stop Four wheel");
	}
    
	public void Display(){
		super.getSpeed();
		super.getDistance();
		System.out.println("Four wheel speed "+speed);
		System.out.println("Four wheel distance "+distance);
		System.out.println("No of Tyre"+noOfTyre);
	}
	
	
} 

class FiveWheel extends Vehicle{
	
	private int speed = 1;
	private long distance = 8;
	
	private int noOfTyre = 5;
	
	FiveWheel(){
		System.out.println("we are in default of Fivewheel");
	}
	 
	public void run(){
		System.out.println("run Five Wheel");
	}
	public void stop(){
		System.out.println("stop Five wheel");
	}
    
	public void Display(){
		super.getSpeed();
		super.getDistance();
		System.out.println("Five wheel speed "+speed);
		System.out.println("Five wheel distance "+distance);
		System.out.println("No of Tyre"+noOfTyre);
	}
	
	
} 





public class AssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vehicle v;
		v = new TwoWheel();
		v.run();
		v.stop();
		v.fuel(5);
		v.fuel(5.6f, "adani");
		v.fuel('F', 89);
		v.Display();
		
		v= new ThreeWheel();
		
		v.run();
		v.stop();
		v.fuel(7);
		v.fuel(7.6f, "reliance");
		v.fuel('U', 100);
		v.Display();
		
		v = new FourWheel();
		
		v.run();
		v.stop();
		v.fuel(9);
		v.fuel(9.6f, "TATA");
		v.fuel('K', 101);
		v.Display();
		
		v = new FiveWheel();
		
		v.run();
		v.stop();
		v.fuel(8);
		v.fuel(8.6f, "Chaudhary");
		v.fuel('I', 102);
		v.Display();
	}

}
