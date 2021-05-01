package com.india.factory2;

public class FactoryTest {

	public currecnyt getcurrenccyt(String country){
		
		if(country.equals("india")){
			return new IndCurrency();
		}
		if(country.equals("usa")){
			return new USDoller();
		}
		if(country.equals("Singapore")){
			return new SGDDoller();
		}
		throw new IllegalArgumentException("no currency found");
		
		
	}
	
}





interface currecnyt {
	
	String getSymbol();
}

class IndCurrency implements currecnyt
{

	@Override
	public String getSymbol() {
		System.out.println("india money");
		return "rs";
	}
	
}

class USDoller implements currecnyt{

	@Override
	public String getSymbol() {
		System.out.println("US doller money");
		return "USD";
	}
	
	
}

class SGDDoller implements currecnyt{

	@Override
	public String getSymbol() {
		System.out.println("SG doller money");
		return "SGD";
	}
	
	
}