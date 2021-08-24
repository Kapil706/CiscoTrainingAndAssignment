package cisco.programs.multithread;
class Customer{
	int amount = 10000;
	synchronized void withdraw(int amount){
		System.out.println("Going to Withdraw");
		
		if(this.amount<amount){
			System.out.println("Less balance.. waiting for deposit");
			try{
				wait();
			}catch(Exception e){
				
			}
			
		}		
			this.amount -= amount;
			System.out.println("withdraw completed .. the left over amount"+amount);
			
		
	}
	
	synchronized void deposit(int amount){
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed.... "+this.amount);
		notify(); // unlocking the withdraw thread
		
	}
}


public class Simple_Wait_Notify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Customer c = new Customer();
		
		new Thread(){
			public void run(){
				c.withdraw(15000);
			}
		}.start();
		
		new Thread(){
			public void run(){
				c.deposit(20000);
				
			}
		}.start();

	}

}
