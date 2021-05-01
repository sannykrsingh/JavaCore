package com.india;

import java.util.Arrays;

public class AnagramTest {
	
	public static void main(String[] args) {
		
		String str1="sanny";
		String str2="nnasy";
		
		boolean yesOrNo=findAnagram(str1,str2);
		System.out.println(yesOrNo);
	}

	
	
	private static boolean findAnagram(String str1, String str2) {
		
		char[] str1Ch=str1.toCharArray();
		
		char[] str2Ch=str2.toCharArray();
		
		if(str1Ch.length!=str2.length()){
			return false;
		}else{
			Arrays.sort(str1Ch);
			Arrays.sort(str2Ch);
			
			
			//return(Arrays.equals(str1Ch, str2Ch));
			
			for(int i=0;i<str1Ch.length;i++){
				if(str1Ch[i]!=str2Ch[i])
					return false;
			}
					
			return true;
		}		
			
}
}