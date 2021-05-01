package com.india;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class TestingEx {
 
	
	public static void main(String[] args) {
		
		
		HashMap hsp= new HashMap<>();
		hsp.put(2, "sanny");
		hsp.put(4, "kumar");
		hsp.put(1, "singh");
		hsp.put(6, "rakesh");
		
		Iterator it= hsp.keySet().iterator();
		
		while(it.hasNext()){
			
			int key= (int) it.next();
			System.out.println(hsp.get(key));
			
		}
		
		Iterator its=hsp.entrySet().iterator();
		while(its.hasNext()){
			
			Entry itee=(Entry) its.next();
			System.out.println(itee.getKey()+" "+itee.getValue());
			
		}
		
		/*int a=0;
		int b=0;
		int c=1;
		
		for (int i=0;i<20;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
		*/
	/*	int no=131;
		int reverse=0,reminder;
		System.out.println(no);
		int temp=no;
		while(no>0){
			
			reminder=no%10;
			reverse=reverse*10+reminder;
			no=no/10;
					
		}
		System.out.println(reverse);
		if(no==reverse){
			System.out.println("in if");
		}
		System.out.println(reverse==temp);*/
		/*Integer[] pk=new Integer[10];		
		System.out.println(pk[1]==null);
		
		HashMap hs=new HashMap();
		WeakHashMap<String, Integer> hs2= new WeakHashMap<>();*/
		
	}
}

class chair
{
	int count;
	chair(int  count,int n){
		this.count=count*n;
		
	}
	chair(int  count){
		this(count, count);
		
	}
}

interface intr
{
	static int i=0;
}
