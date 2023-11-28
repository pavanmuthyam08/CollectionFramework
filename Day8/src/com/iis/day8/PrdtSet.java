package com.iis.day8;

import java.util.*;

public class PrdtSet 
{
    private Set<Product> pd;
    private Scanner sc;
    public PrdtSet() {
    	pd=new HashSet<>();
    	sc=new Scanner(System.in);
    }
    public void accept()
{

	System.out.println("Enter the Number of products do u want to Store");
	int index=sc.nextInt();
	for(int x=0;x<index;x++){
    	Product p=new Product();

		System.out.println("Enter the product Id");
		p.setPrdid(sc.nextInt());
		System.out.println("Enter The Product Name");
		p.setPrdname(sc.next());
		System.out.println("Enter the Product price");
		p.setPrise(sc.nextDouble());
		System.out.println("Enter the The category of Product");
		p.setCategory(sc.next());
		boolean result=pd.add(p);
		if(!result)
		{
			System.out.println("The product is already Exist");
		}
		else {
			System.out.println("The product Added Successfully");
		}
	}	
}
    public void search() {
    	System.out.println("Enter the Catagory do u want to Search");
    	String se=sc.next();
    	for(Product sr:pd) {
    		if(sr.getCategory().equals(se)) {
    			System.out.println("The Product are "+sr.getPrdname());
    		}
    	}
    }
    public void totalcost() {
    	double tc=0;
    	for(Product ps:pd) {
    		tc=tc+ps.getPrise();
    	}
    	System.out.println("The Total Product Cost is "+tc);
    }
    public void saleprice() {
    	
    	double slp=0;
    	for(Product ps:pd) {
    		slp=slp+ps.getPrise()+ps.getPrise()*0.2;
    		System.out.println("The Price of Product "+ps.getPrdname()+"is "+slp);
    	}
    }
    public void display() {
    	for(Product ps:pd) {
    		System.out.println("product id "+ps.getPrdid());
    		System.out.println("The Product Name is "+ps.getPrdname());
    	}
    }
    public static void main(String[] args) {
		PrdtSet ps=new PrdtSet();
		ps.accept();
		ps.display();
		ps.search();
		ps.totalcost();
		ps.saleprice();
	}
}
