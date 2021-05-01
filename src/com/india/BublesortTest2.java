package com.india;

public class BublesortTest2 {
	public static void main(String[] args) {
		
		int arr[]={10,2,5,9,13,18,8};
		for(int i:arr)
			System.out.print(i+",");
		
		int sortarr[]=bubblesort(arr);
		System.out.println();
		for(int i:sortarr)
			System.out.print(i+",");
		
	}

	private static int[] bubblesort(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
			
			if(arr[i]>arr[j]){
				
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		}
		return arr;
	}
}
