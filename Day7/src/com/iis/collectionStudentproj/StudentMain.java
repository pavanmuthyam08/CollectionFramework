package com.iis.collectionStudentproj;

import java.util.*;
import java.util.Scanner;

public class StudentMain
{
     private List<Student> std;
     Scanner sc;
     public StudentMain() {
    	 std=new ArrayList<Student>();
    	 sc=new Scanner(System.in);
     }
     public void findStudent() {
    	 System.out.println("Enter the Student Id do you want search ");
    	 int id=sc.nextInt();
    	 boolean sear=false;
    	 for(Student s:std) {
    		 if(s.getSid()==id) {
    			sear=true;
    			break;
    			}
    		 else {
    			 sear=false;
    		 }
    	 }
    	 if(sear==true) {
    		 System.out.println("the Student is Inside the list");
    	 }
    	 else {
    		 System.out.println("The Student is Not present in the List");
    	 }
     }
     public void accept() 
     {
    	 System.out.println("Enter how many Student do u Want to store ");
    	 int index=sc.nextInt();
    	 for(int i=0;i<index;i++) 
    	 {
    		 Student s=new Student();
    		 System.out.println("Enter the Student id");
    		 s.setSid(sc.nextInt());
    		 System.out.println("Enter the StudentName ");
    		 s.setSname(sc.next());
    		 System.out.println("Enter the Score of Student ");
    		 s.setScore(sc.nextInt());
    		 std.add(s);
    	 }
    	
     }
     
     public void display() {
    	 for(Student st:std) {
    		 System.out.println("The StudentName is "+st.getSname());
    		 System.out.println("The Score is "+st.getScore());
    	 }
     }
     public void delete() {
    	 System.out.println("Enter the Student id Do u want to delete ");
    	 int ids=sc.nextInt();
    	 Student delstd=null;
    	 for(Student sd:std) {
    		 if(sd.getSid()==ids) {
    			 delstd=sd;
    			 break;
    		 }
    	 }
    	 if(delstd!=null) {
    		 std.remove(delstd);
    		 System.out.println("The Deletion was successfull");
    	 }
    	 else {
    		 System.out.println("Enter the the Correct Student Id");
    	 }
    	 
     }
     public void update() {
    	 System.out.println("Enter the Student Id do you want update");
    	 int uid=sc.nextInt();
    	 System.out.println("Enter the Student Name");
    	 String uname=sc.next();
    	 for(Student us:std) {
    		 if(us.getSid()==uid) {
    			 
    		 }
    	 }
    			 
     }
     public static void main(String[] args) {
		StudentMain sm=new StudentMain();
		sm.accept();
		sm.findStudent();
		sm.delete();
		sm.display();
	}
}
