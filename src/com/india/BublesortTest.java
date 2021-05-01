package com.india;

public class BublesortTest {
	public static void main(String[] args) {
		
		int arr[]={3,60,55,7,9,77};
		System.out.println("Before sorting.....");
		for(int i:arr){
			System.out.print(i);
			System.out.print(",");
		}
		int barr[]=bublesort(arr);
		System.out.println();
		System.out.println("after buble sort....");
		for(int i:barr){
			System.out.print(i);
			System.out.print(",");
		}
	}

	
	
	
	private static int[] bublesort(int[] arr) {
		
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

