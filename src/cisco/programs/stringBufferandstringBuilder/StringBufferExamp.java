package cisco.programs.stringBufferandstringBuilder;

public class StringBufferExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Thread safe
		// slow then string builder
		// both are mutable
		StringBuffer sb = new StringBuffer("Hello");
		// only one object is created 
		
		sb.append("Java"); // change in the original object
		
		System.out.println(sb);
		
		sb.insert(1, "Java"); // at first position place java
		System.out.println(sb);
		sb.replace(1, 3,"Java");
		System.out.println(sb);
		
		sb.delete(1, 3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.charAt(3));
		
		StringBuilder ss = new StringBuilder("Core");
		
		System.out.println(">>>>>>>"+ss);
		
		ss.append("Java");
		
		System.out.println(">>>>>>>"+ss);
		
		System.out.println(ss.length());
		System.out.println(ss.charAt(6));
		System.out.println(ss.reverse());
		
		

	}

}
