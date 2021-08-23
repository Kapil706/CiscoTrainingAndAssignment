package cisco.java.programs;

public class TypecastExample {

	public static void main(String[] args) {
	      //Type cast between int and long
	      
	      int i= 100;
	      long l= i;  // implicit typecat
	      System.out.println("long value "+l);
          
	      int o= (int) l ; // explicit conversion
	      System.out.println("int value "+o);
	      
	      char t = (char)i;
	      System.out.println("char value "+t);
	      
	      
	      
	      //typecast between double and float
	      
	      double d = 1122123222123212.121212121;
	      float r = (float)d;
	      System.out.println("float value "+r);
	      System.out.println("double value "+d);
	      
	      
	      //typecast from double to long to int
	      
	      double d2 = 100.04;
	      long l2= (long)d2;
	      int i2 = (int) l2;
	      
	      System.out.println("double value "+d2);
	      System.out.println("long value "+l2);
	      System.out.println("int value "+i2);
	
	
	     // typecast between long and float
	      
	      float f = l;
	      System.out.println("float value "+f);
	     
	      
	     // typecast between byte , int and double
	      
	      
	      byte b;
	      int ii = 257;
	      double dd = 323.142;
	      
	      System.out.println("conversion of int to byte ");
	      b = (byte) ii;
	      System.out.println("ii= "+ii + "b=" +b);
	      
	      
	      b = (byte)dd;
	      System.out.println("dd= "+dd+"b="+b);
	 
	
	} 
	

}
