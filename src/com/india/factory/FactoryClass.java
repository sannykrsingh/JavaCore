package com.india.factory;

public class FactoryClass {

	public Currency createCurrency(String country){
		
		if(country.equals("india")){
			return new rupee();
		}
			
		else if(country.equals("singapore")){
			return new SGDoller();
		}
			
		if(country.equals("usa")){
			return new USDoller();
		}
			
		throw new IllegalArgumentException("No such currency");
	}
	
	
}
















class rupee implements Currency
{

	
	public String getSymbol() {
		System.out.println("RS currency");
		return "rs";
	}
	
}

class SGDoller implements Currency
{

	
	public String getSymbol() {
		System.out.println("SGD currency");
		return "SGD";
	}
	
	
}

class USDoller implements Currency
{

	
	public String getSymbol() {
		System.out.println("USD currency");
		return "USD";
	}
	
	
}