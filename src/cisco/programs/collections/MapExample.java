package cisco.programs.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Map<Integer,String> lhm= new LinkedHashMap<Integer, String>();
		
		
		lhm.put(1, new String("Samsung"));
		lhm.put(2, new String("Mi"));
		lhm.put(3, new String("Toshiba"));
		lhm.put(4, new String("HCL"));
		
		
		System.out.println("Contents of LinkedHashMap: "+lhm);
		
		
		for(Integer key : lhm.keySet()){
			System.out.println(key+":\t"+lhm);
		}
		
		
		System.out.println("The Size of linkedHashmap"+lhm);
		System.out.println("map contains"+lhm.containsValue("Mi"));
		System.out.println("The remove "+lhm.remove(3));
		
		
		System.out.println("Contents of LinkedHashMap: "+lhm);
		
		lhm.clear();
		
		System.out.println("Contents of LinkedHashMap: "+lhm);
		
		
	    
		
		
	}

}
