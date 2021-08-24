package cisco.programs.multithread;

public class RunnableInterfaceExample implements Runnable{
    // runnable is better then Thread extends as this allows us a way to do inheritance multiple
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        RunnableInterfaceExample t = new RunnableInterfaceExample();
        Thread t1 = new Thread(t);
        t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running the thread through runnable interface");
		
		
	}

}
