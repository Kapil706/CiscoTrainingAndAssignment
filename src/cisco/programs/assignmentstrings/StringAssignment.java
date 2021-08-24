package cisco.programs.assignmentstrings;

public class StringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		// answer to question is 
		// 4 objects in pool 
		// 3 objects in the heap memory
		
		String t = "Delhi";
		String o = "Mumbai";
		String k = "delhi";
		
		String y = new String("Mumbai");
		String l = new String("delhi");
		String p = new String("Hello");
		
		// equals is used for comparing the content of the string
		// == is used for comparing the memory location of the strings
		
		System.out.println(o.equals(l));
		System.out.println(o==l);
		System.out.println(y.equals(p));
		System.out.println(y==p);
		System.out.println(t.equals(o));
		System.out.println(t==o);
		System.out.println(k.equals(y));
		System.out.println(k==y);
		System.out.println(p.equals(y));
		System.out.println(p==y);
		
	}

}
