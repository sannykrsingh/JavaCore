package com.india.factory;

public class FactoryMain {
	public static void main(String[] args) {
		
		FactoryClass fc= new FactoryClass();
	 	Currency cr=fc.createCurrency("india");
		cr.getSymbol();
		Currency cr1=fc.createCurrency("usa");
		cr1.getSymbol();
		
	}
}
