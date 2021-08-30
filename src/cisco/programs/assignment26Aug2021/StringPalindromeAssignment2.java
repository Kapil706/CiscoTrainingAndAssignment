package cisco.programs.assignment26Aug2021;

import java.util.Scanner;

public class StringPalindromeAssignment2 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Word (max-size: 50 characater):");
		
		String ch;
		boolean ans = true;
		
		ch = scn.nextLine();
		
		char[] c = ch.toCharArray();
		if(c.length<50){
			int j=c.length-1;
			for(int i=0;i<c.length && i<j;i++){
				if(Character.isLowerCase(c[i])){
					// check for plaindorme
				
				
					if(c[i]!=c[j]) {
						ans =false;
						System.out.println("Not a plaindrome Word");
						return;
					}
					j--;
					
					
				}
				else{
					//not lowercase
					System.out.println("Not a lowercase letter");
					return;
				}
			}
			
			if(ans==true){
				System.out.println("Palindrome word");
			}
			
		
		}
		else{
			System.out.println("Large then 50 char");
		}
		
		// large then 50 char
		
		
		

	}

}
