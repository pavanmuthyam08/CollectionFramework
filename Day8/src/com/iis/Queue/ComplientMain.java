package com.iis.Queue;
import java.util.*;
public class ComplientMain 
{
   private Queue<Complient> com;
   private Scanner sc;
   public ComplientMain() {
	   sc=new Scanner(System.in);
	   com=new LinkedList<>();
   }
   public void insert() {
	   System.out.println("Enter how Many Complients Do u want");
	   int index=sc.nextInt();
	   for(int i=0;i<index;i++) {
		   Complient c=new Complient();
		   System.out.println("Enter the Complient Number");
		   c.setComnum(sc.nextInt());
		   System.out.println("Enter The Complient Message");
		   c.setCommsg(sc.next());
		   com.add(c);
	   }
   }
   public void handle() {
	   while(!com.isEmpty()) {
		   Complient c=com.poll();
		   System.out.println("The Complient Number "+c.getComnum());
		   System.out.println("Handled "+c.getCommsg());
	   }
   }
   public static void main(String[] args) {
	ComplientMain cm=new ComplientMain();
	cm.insert();
	cm.handle();
}
}
