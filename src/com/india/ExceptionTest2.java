package com.india;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ExceptionTest2 {
	public static void main(String[] args) throws IOException {
		
		
		Testrakesh obj1= new Testrakesh();
		obj1.m1();
		
		
	}
}
		/*try
        { 
            System.out.printf("1"); 
            int sum = 9 / 0; 
            System.out.printf("2"); 
        } 
        catch(ArithmeticException e) 
        { 
            System.out.printf("3"); 
        } 
        catch(Exception e) 
        { 
            System.out.printf("4"); 
        } 
        finally
        { 
            System.out.printf("5"); 
        } 
		
		
		
		String st=null;
		System.out.println(st.length());
		
		
		int cu=9;
		callingmethod1(cu) ;
		
		
		 try {
	         throw new IOException();
	      }
		 catch(IOException t) {
	         System.out.println("Got the Test Exception");
	      }
	      catch(Exception t) {
	         System.out.println("Got the Test Exception");
	      }
	      finally {
	         System.out.println("Inside finally block ");
	      }
		
		
		 List<Integer> al = new CopyOnWriteArrayList<>(); 
	        al.add(10); 
	        al.add(20); 
	        al.add(30); 
	        al.add(1); 
	        al.add(2); 
	        
	        for (int str : al) {
	            if (str==20) {
	                al.remove(2);
	            }
	        }
	  
	        
	        //CopyOnWriteArrayList
	        // Remove elements smaller than 10 using 
	        // Iterator.remove() 
	        Iterator itr = al.iterator(); 
	        while (itr.hasNext()) 
	        { 
	            int x = (Integer)itr.next(); 
	            if (x < 10) 
	                itr.remove(); 
	        } 
	  
	        System.out.println("Modified ArrayList : "
	                                           + al); 
	    } 
		
		try{
			throw new myexception("cought exception..");
		}catch(myexception e){
			System.out.println("in exception..");
			e.printStackTrace();
		}
		
		
	
}
}
	private static void callingmethod1(int cu) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
class myexception extends RuntimeException
{
	public myexception(String msg){
		super(msg);
	}
}

*/
class Testrakesh 
{ 
    void m1() 
    { 
        m2(); 
        System.out.printf("1"); 
    } 
    private void m2() 
    { 
        m3(); 
        System.out.printf("2"); 
    } 
    private void m3() 
    { 
        System.out.printf("3"); 
        try
        { 
            int sum = 4/0; 
            System.out.printf("4"); 
        } 
        catch(ArithmeticException e) 
        { 
            System.out.printf("5"); 
        } 
          
          
        System.out.printf("7"); 
    } 
    
}