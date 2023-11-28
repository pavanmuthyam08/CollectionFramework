package com.iis.studentclassproject;

import java.util.*;
import java.util.Scanner;

public class ClasMain 
{
   Scanner sc;
   Class cs;
   List<Student> s;
   public ClasMain() {
	   sc=new Scanner(System.in);
	   cs=new Class();
	   s=new ArrayList<Student>();
   }
   public void accept() {
	    System.out.println("Enter the Student Class");
	    cs.setCls(sc.nextInt());
	    System.out.println("Enter the Scetion");
	    cs.setSec(sc.next());
	    System.out.println("Enter The number of Student Do you want");
	    int index=sc.nextInt();
	    
	    	for(int i=0;i<index;i++) {
	    		Student st=new Student();
	    		System.out.println("Enter the Student RollNumber ");
	    		st.setRollno(sc.nextInt());
	    		System.out.println("Enter the Student Name ");
	    		st.setStdname(sc.next());
	    		System.out.println("Enter the Student Score");
	    		st.setScore(sc.nextInt());
	    		s.add(st);
	    	}
	    cs.setS(s);
   }
   public void display() {
	   System.out.println("Class  "+cs.getCls());
	   System.out.println("Section "+cs.getSec());
	   List<Student> l=cs.getS();
	   for(Student std:s) {
		  System.out.println("The Student Name "+std.getStdname()); 
	   }
   }
   public static void main(String[] args) {
	ClasMain mc=new ClasMain();
	mc.accept();
	mc.display();
}
}
