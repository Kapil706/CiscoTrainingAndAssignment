package cisco.programs.multithread;



class Table{
	
	void printTable(int n){
		
		// both threads entered here at the same time
		
		System.out.println("I am into this printTable method");
		
		synchronized(this) {// synchronized block : this means to current context
			
			// in this block only one thread will enter
			for(int i=1;i<=5; i++){
				System.out.println(n*i);
				try{
					Thread.sleep(400);
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
			
		}
	}
}	
	class MyThread1 extends Thread{
		Table t;
		MyThread1(Table t){
			this.t=t;
		}
		
		public void run(){
			System.out.println("Into the MyThread1 run() method");
			t.printTable(5);
		}
	}
	
	class MyThread2 extends Thread{
		Table t;
		MyThread2(Table t){
			this.t=t;
		}
		
		public void run(){
			System.out.println("Into the MyThread2 run() method");
			t.printTable(100);
		}
	}
	
	
	
	
	



public class SynchronizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Table obj = new Table();
      
      MyThread1 t1=  new MyThread1(obj);
      MyThread2 t2 = new MyThread2(obj);
      
      
      t1.start();
      t2.start();
      
      
		
	}

}
