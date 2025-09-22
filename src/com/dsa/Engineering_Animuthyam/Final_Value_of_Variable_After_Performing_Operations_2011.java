package com.dsa.Engineering_Animuthyam;

public class Final_Value_of_Variable_After_Performing_Operations_2011 {
	
	public static void main (String[] args) {
		
		
	String [] operations = {"--X","X++","X++"};
	
	int releast  = finalValueAfterOperations(operations);
	
	System.out.println(releast);
	
	
	}
	public static int finalValueAfterOperations(String[] operations) {
		
		
		int ans =0;
		
		
		for(int i = 0; i<operations.length;i++) {
			
			if(operations[i].equals("++X") ||operations[i].equals("X++")) {
				
				ans = ans +1;
			}
			else {
				ans = ans -1;
			}
		}
		
		return ans;
	}

}
