package cisco.programs.collectionsassignment;

import java.util.TreeSet;

public class CollectionAssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("Java");
		ts.add("python");
		ts.add("GoLang");
		ts.add("JavaScript");
		ts.add("C++");
		ts.add("Kotlin");
		
		ts.remove("JavaScript");
		ts.remove("C++");
		
		System.out.println("Programming language is TreeSet "+ts);
		
		ts.add("R");
		ts.add("Ruby");
		ts.add("C");
		
		System.out.println("Programming language Java is There or not : "+ts.contains("Java"));
		
		System.out.println("Programming language is TreeSet "+ts);
		
		
		ts.clear();
		
		System.out.println("Programming language is TreeSet "+ts);
		
	}

}
