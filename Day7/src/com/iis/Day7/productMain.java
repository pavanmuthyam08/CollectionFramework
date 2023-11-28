package com.iis.Day7;

public class productMain 
{
   public static void main(String[] args) {
	product p1=new product();
	p1.setProductid(1);
	p1.setProductname("bag");
	p1.setProductprise(900);
	product p2=new product();
	p2.setProductid(1);
	p2.setProductname("bag");
	p2.setProductprise(900);
	if(p1.equals(p2)) {
		System.out.println("the Are Equal Products");
	}
	else {
		System.out.println("These are Not Equal products");
	}
}
}
