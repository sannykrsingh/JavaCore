package com.india;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverse {
	
	public static void main(String[] args) {
		
	/*	Integer a[]=new Integer[]{12,13,14,54,99,8};
		
		int s[]={12,13,14,54,99,8};
		
		ArrayList ff=(ArrayList) Arrays.asList(s);
		
		Collections.sort(ff,Collections.reverseOrder());
		
		for(int j:s){
			System.out.print(" "+j);
		}*/
		
		int s[]={12,13,14,54,99,8};
		
		int rev[] = new int[6];
		int j=0;
		
		int reverse[]= new int[s.length];
	
		
		
		
		
		
		
		
		
		for(int i=s.length-1;i>=0;i--){
			reverse[j]=s[i];
			j++;
			
		}
		
	
		
		
		
		
		
		
		for(int i=s.length-1;i>=0;i--){
			//System.out.println(j);
			System.out.println(s[i]);
			rev[j]=s[i];
			System.out.println(rev[j]);
			j++;
			
		}
		for(int i:rev){
			System.out.print(i);
		}
		
	}
	
	
	
}
