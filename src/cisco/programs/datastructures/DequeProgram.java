package cisco.programs.datastructures;

import java.util.List;
import java.util.ArrayList;

public class DequeProgram {

	List<Integer> deq = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DequeProgram dequ = new DequeProgram();
     
     dequ.insertFront(34);
     dequ.insertRear(45);
     dequ.removeFront();
     dequ.removeFront();
     dequ.removeFront();
     dequ.insertFront(21);
     dequ.insertFront(98);
     dequ.insertRear(5);
     dequ.insertFront(43);
     dequ.removeRear();
    
    
	}
	
	

    public void insertFront(int item){
    	// add element at begining 
    	System.out.println("adding at front: "+item);
    	deq.add(0,item);
    	System.out.println(deq);
    }
    
    public void insertRear(int item){
    	System.out.println("adding at rear: "+item);
    	deq.add(item);
    	System.out.println(deq);
    }
    
    public void removeFront(){
    	if(deq.isEmpty()){
    		System.out.println("deque undeflow");
    		return;
    	}
    	int rem = deq.remove(0);
    	System.out.println("removed from front" +rem);
    	System.out.println(deq);
    }
    
    public void removeRear(){
    	
    	if(deq.isEmpty()){
    		System.out.println("deque undeflow");
    		return;
    	}
    	int rem = deq.remove(deq.size()-1);
    	System.out.println("removed from rear " +rem);
    	System.out.println(deq);
    	
    }
    
    public int peakFront(){
    	int item = deq.get(0);
    	System.out.println("Element at first: "+item);
    	return item;
    }
    
    public int peakRear(){
    	int item = deq.get(deq.size()-1);
    	System.out.println("Element at rear: "+item);
    	return item;
    }
    

}
