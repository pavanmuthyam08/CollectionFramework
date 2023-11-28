package com.iis.deptemployeeproj;


import java.util.*;

public class DeptMain{
	
	   private Dept dm;
	   private List<Employee> le;

   Scanner sc;
   public DeptMain() {
	   sc=new Scanner(System.in);
	   le=new ArrayList<Employee>();
	   dm=new Dept();
	 
	   
   }
   public void insert() {
	   System.out.println("Enter The Department id");
	   dm.setDeptid(sc.nextInt());
	   System.out.println("Enter the Department name");
	   dm.setDeptname(sc.next());
	  System.out.println("Enter How many Employees do you want");
       int index=sc.nextInt();
       for(int i=0;i<index;i++)
       {
    	   Employee e=new Employee();
    	   System.out.println("Enter the Employee id");
    	   e.setEmpid(sc.nextInt());
    	   System.out.println("Enter The Employee name");
    	   e.setEmpname(sc.next());
    	   System.out.println("Enter the Salary");
           e.setSal(sc.nextDouble());
           le.add(e);
          
       }
       dm.setLe(le);
	   
	   
       
   }
   public void display() {
	   System.out.println("The department Id is "+dm.getDeptid());
	   System.out.println("The Department name is "+dm.getDeptname());
	   
	   List<Employee> elist=dm.getLe();
	   for(Employee e:le) {

		   System.out.println("The employee Name is "+e.getEmpname());
	   }
   }
   public static void main(String[] args) {
	DeptMain dm=new DeptMain();
	dm.insert();
	dm.display();
}
   
}
