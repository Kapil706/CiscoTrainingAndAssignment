package cisco.programs.oops;

class Employee{
	float salary = 40000;
	int bonus = 56000;
	
	public void show(){
		System.out.println("inside the parent class");
	}
	
	public void display(){
		System.out.println("we are inside the disply method of employeea");
	}
}




public class Programmer extends Employee{
     
	int bonus = 10000;
	public void show(){
		// overridiing
		System.out.println("Bonus of Employee is:"+super.bonus);
		System.out.println("inside the child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Programmer p = new Programmer();
        
        System.out.println("Programmer salary"+p.salary);
        System.out.println("Bonus of programmer is "+p.bonus);
        
        p.show();
        p.display();
        
	}

}
