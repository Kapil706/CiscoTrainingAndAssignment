package cisco.programs.innerclasses;

class Car{
	String carName;
	String carType;
	
	public Car(String name, String type){
		this.carName=name;
		this.carType=type;
	}
	
	private String getCarName(){
		return this.carName;
	}
	
	// inner class
	
	class Engine{
		String engineType;
		
		void setEngine(){
			// Accessing the carType property of Car
			
			if(Car.this.carType.equals("4WD")){
				
				// invoking method getCarName() of Car
				
				if(Car.this.getCarName().equals("Tesla")){
					this.engineType= "Electric";
				}
				else{
					this.engineType= "Petrol";
				}
			}
			else{
				this.engineType="Petrol";
			}
		}
		
		String getEngineType(){
			return this.engineType;
		}
	}
}



public class InnerComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an object of the outer class Car
		Car car1 = new Car("Mazda","8WD");
		
		//creare object of inner class using the outer class object
		Car.Engine engine = car1.new Engine();
		
		engine.setEngine();
		System.out.println("Engine type for 8WD "+engine.getEngineType());
		
		Car car2 = new Car("Tesla","4WD");
		
		Car.Engine engine2 = car2.new Engine();
		
		engine2.setEngine();
		System.out.println("Engine Type for 4WD "+engine2.getEngineType());

	}

}
