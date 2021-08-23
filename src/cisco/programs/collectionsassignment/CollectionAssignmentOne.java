package cisco.programs.collectionsassignment;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class CollectionAssignmentOne {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet l1 = new LinkedHashSet();
		
		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
		
		Scanner scn  = new Scanner(System.in);
		
		l1.add(1);
		l1.add(2);
		l1.add(3.4f);
		l1.add(6.7f);
		l1.add('h');
		l1.add('g');
		l1.add(true);
		
	    
		System.out.println("Enter Number in Random Order:");
		
		for(int i=0;i<7;i++){
			
            l2.add(scn.nextInt());
			
		}
		
		System.out.println("LinkedHashSet l1"+l1);
		System.out.println("LinkedHashSet l2"+l2);
		
		
		
		
	}

}
