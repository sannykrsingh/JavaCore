package com.india.exceptionhandle;
class LessThan18AgeException extends Exception{  
 LessThan18AgeException(String s){  
  super(s);  
 }  
}
public class Question1{
   static void validate(int age)throws LessThan18AgeException{
     if(age<18)
      throw new LessThan18AgeException("Age is less than 18 years, access denied");
     else
      System.out.println("Access allowed");
   }
   public static void main(String args[]){
      try{
      validate(3);
      }
      catch(Exception m){System.out.println("Custom exception : "+m);
      }}}
