package cisco.programs.multithread;

class Line{
	
	synchronized public void getLine(){
		for(int i=0; i<3; i++){
			System.out.println(Thread.currentThread().getName()+" :"+i);
			try{
				Thread.sleep(400);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}


class Train extends Thread{
	Line line;
	
	Train(Line line){
		this.line = line;
	}
	
	public void run(){
		line.getLine();
	}
}



public class SynchronizedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Line obj = new Line();
        // object of line class that is shared among the threads
        Train t1 = new Train(obj);
        
        Train t2 = new Train(obj);
        
        t1.setName("Train 1");
        t2.setName("Train 2");
        
        t1.start();
        t2.start();
        
	}

}
