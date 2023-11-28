package com.iis.day7assignment;

public class stringAss 
{
  public static void main(String[] args) {
	String s1="Welcome to Java World";
	
	System.out.println("The character at 5th index is "+s1.charAt(5));
	s1=s1+"-let us learn";
	System.out.println(s1);
	System.out.println("The First occrance 'a' index is "+s1.indexOf('a'));
	System.out.println(" The SubString is "+s1.substring(4,10));
	System.out.println(s1.toLowerCase());
}
  
}
