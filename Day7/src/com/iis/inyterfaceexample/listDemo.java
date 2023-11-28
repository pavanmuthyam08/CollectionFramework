package com.iis.inyterfaceexample;
import java.util.*;
public class listDemo
{
   private List<String> li;
   public listDemo() {
	   li=new ArrayList<String>();
	   li.add("pavan");
	   li.add("ram");
	   li.add("sri");
	   li.add("biran");
   }
   public void dispaly() {
	   for(String l: li) {
		   System.out.println("the Strings are "+l);
	   }
   }
   public static void main(String[] args) {
	listDemo ld=new listDemo();
	ld.dispaly();
}
   
}
