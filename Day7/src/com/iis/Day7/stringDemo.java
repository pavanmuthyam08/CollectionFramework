package com.iis.Day7;

public class stringDemo {
	public static void main(String[] args) {
		String s1="hello welcome to java";
		String s2=new String("hello");
		String s3="hello";
		System.out.println("The Substring is "+s1.substring(3,10));
		System.out.println("Index of particular String is "+s1.indexOf("java"));
		if(s1.equals(s2)) {
			System.out.println("these are Equal");
		}
		else {
			System.out.println("these are Not Equal");
		}
	}

}
