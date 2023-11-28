package com.iis.Queue;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class FixedSizeQueue 
{

	   ArrayBlockingQueue<Integer> arrque;
	   public FixedSizeQueue() {
		   arrque=new ArrayBlockingQueue<>(5);
	   }
	   public void insert() {
		   arrque.add(10);
		   arrque.add(15);
		   arrque.offer(20);
		   arrque.offer(30);
		   arrque.add(35);
		   arrque.offer(18);
		   //arrque.add(5);
	   }
	   public void display() {
		   while(!arrque.isEmpty()) {
			   System.out.println("The values are "+arrque.poll());
		   }
	   }
	   public static void main(String[] args) {
		FixedSizeQueue fs=new FixedSizeQueue();
		fs.insert();
		fs.display();
	}
}
