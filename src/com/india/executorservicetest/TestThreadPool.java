package com.india.executorservicetest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TestThreadPool  {  
    public static void main(String[] args) {  
       ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
        
           Runnable worker1 = new WorkerThread("task 1");  
           /*Runnable worker2 = new WorkerThread("task 2"); 
           Runnable worker3 = new WorkerThread("task 3"); 
           Runnable worker4 = new WorkerThread("task 4"); 
           Runnable worker5 = new WorkerThread("task 5"); */
           
           executor.execute(worker1);//calling execute method of ExecutorService  
           executor.execute(worker2);
           executor.execute(worker3);
           executor.execute(worker4);
           executor.execute(worker5);
           
           executor.shutdown();  
     
   }  
}  



class WorkerThread  implements Runnable {  
	private String name; 
    public WorkerThread(String s){  
    	 name = s; 
    }  
     public void run() {  
        try {
        	System.out.println(Thread.currentThread().getName()+" running by "+name);  
			Thread.sleep(3400);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //sleeps the thread for 2 seconds  
          
    }   
}  