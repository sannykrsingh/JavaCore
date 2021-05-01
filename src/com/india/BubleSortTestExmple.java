package com.india;

public class BubleSortTestExmple {
	public static void main(String[] args) {
		
		
		int arr[]={10,12,5,9,23,35};
		System.out.println("Before sort");
		for(int i:arr)
			System.out.print(i+",");
		
		
		int sortarr[]=bubblesort(arr);
		System.out.println();
		System.out.println("after sort");
		for(int i:sortarr)
			System.out.print(i+",");
		
	}

	private static int[] bubblesort(int[] arr) {
		
		int temp;
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++ ){
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
