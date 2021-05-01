package com.india;

import java.util.*;

public class CountofMap {
	public static void main(String[] args) {
		
		int Arr[]= new int[]{11,12,10,11,12,12,15,16};
		
		HashMap<Integer,Integer> hm= new HashMap<>();
		
		for(int i=0;i<Arr.length;i++){
			
			if(hm.get(Arr[i])!=null){
				hm.put(Arr[i],hm.get(Arr[i])+1);
				
			}else{
				hm.put(Arr[i], 1);
			}
		}
	System.out.println(hm);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*HashMap<Integer,Integer> hm= new HashMap();
		
		for(int i=0;i<Arr.length;i++){
			if(hm.containsKey(Arr[i])){
				hm.put(Arr[i], hm.get(Arr[i])+1);
			}else{
				hm.put(Arr[i],1);
			}
		}
		
		
		System.out.println(hm);*/
	}
}

