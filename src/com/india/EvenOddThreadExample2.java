package com.india;

public class EvenOddThreadExample2 {
	
	public static void main(String[] args) {
		
		Printerclass printer=new Printerclass();
		
		OddThreadObj1 oddobj= new OddThreadObj1(20,printer);
		EvenThreadObj1 evenobj=new EvenThreadObj1(20,printer);
		oddobj.start();
		evenobj.start();
		
	}

}

class Printerclass
{
	boolean evenflag=false;
	
	public void printEven(int num) throws InterruptedException
	{
		synchronized (this) {
			while(!evenflag){
				wait();
			}
			
			System.out.println("OddThread :"+num);
			evenflag=false;
			Thread.sleep(100);
			notify();
		}
	}
	
	
	public void printOdd(int num) throws InterruptedException
	{
		synchronized (this) {
			while(evenflag){
				wait();
			}
			System.out.println("EvenThread : "+num);
			evenflag=true;
			Thread.sleep(100);
			notify();
		}
	}
	
	
}



class OddThreadObj1 extends Thread
{
	int num;
	Printerclass printobj;
	
	
	public OddThreadObj1(int num, Printerclass printobj) {
		this.num = num;
		this.printobj = printobj;
	}

	
	public void run() {
		int  oddno=1;
		while(oddno<=num){
			try {
				printobj.printOdd(oddno);
				oddno=oddno+2;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}
	
	
}

class EvenThreadObj1 extends Thread
{
	int num;
	Printerclass printerobj;
	
	public EvenThreadObj1(int num,Printerclass printerobj){
		this.num=num;
		this.printerobj=printerobj;
	}
	
	
	public void run() {
		int evenno=2;
		while(evenno<=num){
			try {
				printerobj.printEven(evenno);
				evenno=evenno+2;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	}
}
