package com.iis.day7assignment;

public class stringbuffer 
{
  public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("This is StringBuffer");
	System.out.println(sb+"- This is Simple Program");
	System.out.println(sb.reverse());
	System.out.println(sb.replace(14, 19, "Builder"));
}
}
