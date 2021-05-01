package com.india.part2;

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		
		PCprinter pobj=new PCprinter();
		ProducerThread pth=new ProducerThread(pobj,1);
		ConsumeThread pth2=new ConsumeThread(pobj,1);
		pth.start();
		pth2.start();
	}

}


class PCprinter{
	
	int contents;
	boolean availble =false;
	public synchronized int get() throws InterruptedException{
			while(!availble){
			wait();
			}
		availble=false;
		notifyAll();
		return contents;
	}
	
	public synchronized void put(int value) throws InterruptedException{
			while(availble){
				wait();
			}
			contents=value;
			availble=true;
			notifyAll();
		}
		
	}
	



class ProducerThread extends Thread
{
	PCprinter pobj;
	int i;

	public ProducerThread(PCprinter pobj, int i) {
		this.i=i;
		this.pobj=pobj;
		
	}
	
	
	public void run() {
		
		for(int i=0;i<10;i++){
			try {
				pobj.put(i);
				System.out.println("producer produced value .. "+i);
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}


class ConsumeThread extends Thread{

	int i;
	PCprinter pobj;
	public ConsumeThread(PCprinter pobj, int i) {
		this.i=i;
		this.pobj=pobj;
	}
	public void run() {
	for(int i=0;i<10;i++){
		int value=0;
		try {
			value = pobj.get();
			System.out.println("consumer consuming.."+value);
			sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	}
	
	
	
	
	
	
}