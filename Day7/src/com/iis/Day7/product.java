package com.iis.Day7;

import java.util.Objects;

public class product 
{
	int productid;
    String productname;
    double productprise;
	@Override
	public int hashCode() {
		return Objects.hash(productid, productname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		product other = (product) obj;
		return productid == other.productid && Objects.equals(productname, other.productname);
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getProductprise() {
		return productprise;
	}
	public void setProductprise(double productprise) {
		this.productprise = productprise;
	}
}
