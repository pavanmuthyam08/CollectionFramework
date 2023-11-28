package com.iis.day8;

import java.util.*;

public class SetDemo 
{
   private Set<String> s;
   private Scanner sc;
   public SetDemo() {
	   s=new HashSet<>();
	   sc=new Scanner(System.in);
   }
   public void accept() {
	   System.out.println("Enter How many String Do u want");
	   int index=sc.nextInt();
	   for(int i=0;i<index;i++) {
		   System.out.println("Enter the String");
		   s.add(sc.next());
	   }
   }
   public void display() {
	   for(String st:s) {
		   System.out.println("The Strings are "+st);
	   }
   }
   public static void main(String[] args) {
	SetDemo sd=new SetDemo();
	sd.accept();
	sd.display();
}
}
