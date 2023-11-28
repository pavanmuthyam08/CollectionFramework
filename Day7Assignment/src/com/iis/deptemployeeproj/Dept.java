package com.iis.deptemployeeproj;

import java.util.*;

public class Dept 
{
   private int deptid;
   private String deptname;
   private List<Employee> le;
public List<Employee> getLe() {
	return le;
}
public void setLe(List<Employee> le) {
	this.le = le;
}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
   
   
}
