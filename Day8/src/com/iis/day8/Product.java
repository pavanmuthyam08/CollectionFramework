package com.iis.day8;

import java.util.Objects;

public class Product 
{
  private int prdid;
  private String prdname;
  private double prise;
  private String category;
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getPrdid() {
	return prdid;
}
public void setPrdid(int prdid) {
	this.prdid = prdid;
}
public String getPrdname() {
	return prdname;
}
public void setPrdname(String prdname) {
	this.prdname = prdname;
}
public double getPrise() {
	return prise;
}
public void setPrise(double prise) {
	this.prise = prise;
}
@Override
public int hashCode() {
	return Objects.hash(prdid, prdname);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	return prdid == other.prdid && Objects.equals(prdname, other.prdname);
}
  
}
