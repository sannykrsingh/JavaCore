package com.india;

import java.util.ArrayList;
import java.util.List;

public class Java8Test2 {

	public static void main(String[] args) {
		
		interface1 interReff;
		
		interReff=(j,i) -> {
			
			System.out.println("helooo samnny.."+ i+" "+j);
			System.out.println("helooo samnny.."+ i+" "+j);
			System.out.println("helooo samnny.."+ i+" "+j);
		};
		interReff.show(9,9);
		
		//interReff.show2();
}
}

interface interface1
{
	
	public void show(int j,int k);
		
}


/*class interfacecclass implements interface1{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	public void show2(){
		System.out.println("ssss44444444");
	}
	
}*/