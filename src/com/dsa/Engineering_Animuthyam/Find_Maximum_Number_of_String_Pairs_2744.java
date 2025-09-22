package com.dsa.Engineering_Animuthyam;

public class Find_Maximum_Number_of_String_Pairs_2744 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] words = {"cd","ac","dc","ca","zz"};
		
		int a = maximumNumberOfStringPairs(words);
		
		System.out.println(a);
		
		
	}
	public static String reverse(String re){
        String rev = "";
        for(int i =re.length()-1;i>=0;i--){
            rev = rev+ re.charAt(i);
        }
        return rev;
    }
	
	
    public static int maximumNumberOfStringPairs(String[] words) {
        
            int ans =0;
            int n = words.length;
            for(int i =0 ;i<n-1;i++){
                for(int j = i+1;j<n;j++){
                    String a = words[i];
                    String b = words[j];
                    String rev = reverse(b);
                    if(a.equals(rev)){
                        ans++;
                    }
                }
            }

            return ans;
    }
}
