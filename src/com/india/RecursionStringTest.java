package com.india;

public class RecursionStringTest {
	public static void main(String[] args) {
	
		String rev=revserStrig("sanny");
		System.out.println(rev);
		
	}

	private static String revserStrig(String str) {
		if(str.isEmpty()){
			return str;
		}
		
		
		return revserStrig(str.substring(1))+str.charAt(0);
				
				
		//return revserStrig(str.substring(1))+str.charAt(0);
	}

	
	
	
	/*private static String revserStrig(String str) {
		
		if(str.isEmpty())
			return str;
		else
		{
			
			return revserStrig(str.substring(1))+str.charAt(0);
			//return revserStrig(str.substring(1))+str.charAt(0);
		}
		
	}*/
	
}
