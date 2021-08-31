package cisco.programs.datastructures;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st = new Stack<>();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the numbers to be added into the stack (5-Number)");
		
        for(int i=0;i<5;i++){
        	int num = scn.nextInt();
        	push_stack(st,num);
        }
        
        System.out.println("Poping top two elements");
        
        pop_stack(st);
        
        System.out.println("Getting top element");
        
        top_stack(st);
        
        search_stack(st, 23);
		
		

	}
	
	public static void search_stack(Stack<Integer>st,int num){
		
		Integer pos =  (Integer)st.search(num);
		
		if(pos==-1){
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element found at pos "+pos);
		}
		
	}
	
    public static void top_stack(Stack<Integer>st){
    	System.out.println(st.peek());
    }
	
	public static void pop_stack(Stack<Integer>st){
		for(int i=0;i<2;i++){
			
			Integer p = (Integer)st.pop();
			System.out.println("Popped Value "+p);
			
		}
	}
	
	public static void push_stack(Stack<Integer>st, int n){
		  st.push(n);
	}

}
