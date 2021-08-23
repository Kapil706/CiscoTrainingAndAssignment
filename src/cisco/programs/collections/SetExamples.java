package cisco.programs.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


// to be done 


public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hashset = new HashSet<String>(); // random order output
		
		hashset.add("Orange");
		hashset.add("Apple");
		hashset.add("PineApple");
		hashset.add("papaya");
		hashset.add("lichi");
		
		System.out.println("HashSet is "+hashset);
		System.out.println("Size of HashSet is "+hashset.size());
		System.out.println("Does HashSet Contains Nariyal"+hashset.contains("Nariyal"));
		System.out.println("Remove apple"+hashset.remove("Apple"));
		System.out.println("Is hashSet empty"+hashset.isEmpty());;
        hashset.clear();
		
		
		
		
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(); 
		
		
		lhs.add("a");
        lhs.add("b");
        lhs.add("true");
        lhs.add("c");
        lhs.add("d");
        
        System.out.println("HashSet is "+hashset);
		System.out.println("Size of HashSet is "+hashset.size());
		System.out.println("Does HashSet Contains Nariyal"+hashset.contains("Nariyal"));
		System.out.println("Remove apple"+hashset.remove("Apple"));
		System.out.println("Is hashSet empty"+hashset.isEmpty());;
        hashset.clear();
        
		TreeSet<String> ts = new TreeSet<String> ();  // sorted order output
        
		ts.add("India");
		ts.add("US");
		ts.add("Sri Lanka");
		ts.add("Europe");
		ts.add("Australia");
		
		System.out.println("HashSet is "+hashset);
		System.out.println("Size of HashSet is "+hashset.size());
		System.out.println("Does HashSet Contains Nariyal"+hashset.contains("Nariyal"));
		System.out.println("Remove apple"+hashset.remove("Apple"));
		System.out.println("Is hashSet empty"+hashset.isEmpty());;
        hashset.clear();
		
	}

}
