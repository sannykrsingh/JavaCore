package com.india;

public class EvenOddThreadExample {
	public static void main(String[] args) {
		
		Printer printerObj= new Printer();
		OddThread Oth1= new OddThread(10,printerObj);
		EvenThread Eth1=new EvenThread(10,printerObj);
		Oth1.start();
		Eth1.start();
		
		
	}
}

class Printer
{
	
	boolean evenFlag=false;
	
	public synchronized void printEvenNum(int num) throws InterruptedException{
		
					
			while(!evenFlag){
				wait();
			}
			System.out.println("EvenThread : "+num);
			evenFlag=false;
			Thread.sleep(1000);
			notify();
		
	}

	public synchronized void printOddNum(int num) throws InterruptedException{
		
		
			
			while(evenFlag){
				wait();
			}
			System.out.println("OddThread : "+num);
			evenFlag=true;
			Thread.sleep(1000);
			notify();
			
		
	}	
}


class OddThread extends Thread
{
	int num;
	Printer printerObj;
	
	public OddThread(int num, Printer printerObj) {
		this.num=num;
		this.printerObj=printerObj;
	}
	
	@Override
	public void run() {
		int oddno=1;
		while(oddno<num){
			try {
				printerObj.printOddNum(oddno);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			oddno=oddno+2;
		}
		
	}
	
	
}

class EvenThread extends Thread
{
	int num;
	Printer printerObj;
	
	public EvenThread(int num, Printer printerObj) {
		
		this.num=num;
		this.printerObj=printerObj;
	}
	
	public void run() {
		int evenno=2;
		while(evenno<=num){
			try {
				printerObj.printEvenNum(evenno);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			evenno=evenno+2;
		}
	
	}
	
	
}

