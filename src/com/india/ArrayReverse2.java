package com.india;

public class ArrayReverse2 {
	public static void main(String[] args) {
		
		
		int arr[]={10,11,12,8,7,14};
		
		int jlenth=arr.length;
		
		Integer rev[] = new Integer[jlenth];
		int j=0;
		
		for(int i= arr.length-1;i>=0;i--){
			
			rev[j]=arr[i];
			j++;
		}
		for(int  i:rev)
		System.out.print(i);
	}
}
