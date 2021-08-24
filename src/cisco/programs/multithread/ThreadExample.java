package cisco.programs.multithread;

public class ThreadExample extends Thread {
    // cpu schedule controls the thread
	
	public void run(){
		System.out.println("Run method invoked as soon as thread started");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ThreadExample th = new ThreadExample(); // object of thread is created
		
		th.start(); // thread started
		
	}

}
