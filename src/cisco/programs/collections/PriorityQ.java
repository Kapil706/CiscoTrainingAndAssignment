package cisco.programs.collections;

import java.util.PriorityQueue;

public class PriorityQ {
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		PriorityQueue<String> pq= new PriorityQueue<String>();
		
		pq.add("India");
		pq.add("Australia");
		pq.add("Thialand");
		pq.add("US");
		pq.add("Germany");
		
		System.out.println("PriorityQ elements"+pq);
		
		pq.remove("Thialand");
		pq.remove("Germany");
		
		System.out.println("PriorityQ elements"+pq);
		
		
		pq.add("Dubai");
		pq.add("Afghanistan");
		
		System.out.println("PriorityQ elements"+pq);
		
		
		System.out.println("PriorityQ peek element "+pq.peek());
		
		
		
		
	}

}
