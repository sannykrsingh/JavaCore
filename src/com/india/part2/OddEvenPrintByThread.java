package com.india.part2;

public class OddEvenPrintByThread {
	public static void main(String[] args) {
		
		Printer pobj=new Printer();
		evenThread th1= new evenThread(10, pobj);
		OddThread th2= new OddThread(10, pobj);
		th1.start();
		th2.start();
		
	}
}


class Printer
{
	boolean evenflag=false;
	
	public void printEven(int no) throws InterruptedException{
		
		synchronized (this) {
			while(!evenflag){
				wait();
			}
			System.out.println("EvenThread printing.. "+no);
			evenflag=false;
			Thread.sleep(1000);
			notify();
			
			
		}
	}
	
	public void printodd(int no) throws InterruptedException{
		
		synchronized (this) {
			while(evenflag){
				wait();
			}
			System.out.println("oddthread printing.. "+no);
			evenflag=true;
			Thread.sleep(1000);
			notify();
			evenflag=true;
		}
	}
	
	
	
}

class OddThread extends Thread
{
	int no;
	Printer pobj;
	
	public OddThread(int no,Printer pobj){
		this.no=no;
		this.pobj=pobj;
	}
	
	
	public void run() {
		
		int Oddno=1;
		while(Oddno<=no){
			try {
				pobj.printodd(Oddno);
				Oddno=Oddno+2;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	
			}
			
		}
		
	}
	
	
}

class evenThread extends Thread
{
	int no;
	Printer pobj;
	public evenThread(int no,Printer pobj){
		this.no=no;
		this.pobj=pobj;
	}
	
	
	public void run() {
		
		int evenno=2;
		while(evenno<=no){
			try {
				pobj.printEven(evenno);
				evenno=evenno+2;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
}
}