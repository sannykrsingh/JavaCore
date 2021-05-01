package com.india.factory2;

public class Mainfactory {
	public static void main(String[] args) {
	
		
		FactoryTest  ft= new FactoryTest();
		currecnyt obj =ft.getcurrenccyt("india");
		obj.getSymbol();
	}
	
	
}
