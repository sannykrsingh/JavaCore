package com.india;

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		thread1 th=new thread1();
		thread2 th2=new thread2();
		th.start();
		th.join();
		th2.start();
		 
		
	}
}


class thread1 extends Thread
{
	thread1(){
		System.out.println("construtor called..");
	}
	
	public void run(){
		System.out.println("Even no-");
		for(int i=0;i<20;i++){
			
			if(i%2==0){
			try {
				thread1.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.print(" "+i);
		}
	}}
}

class thread2 extends Thread
{
	thread2(){
		System.out.println("construtor2 called..");
	}
	
	public void run(){
		System.out.println();
		System.out.println("Odd No-");
		for(int i=0;i<20;i++){
			if(i%2!=0){
			try {
				thread2.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(" "+i);
		}
	}}
}