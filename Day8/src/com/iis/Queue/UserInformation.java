package com.iis.Queue;

import java.util.Objects;

public class UserInformation 
{
  private int userid;
  private String username;
  private String password;
  private String type;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public int hashCode() {
	return Objects.hash(password, username);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	UserInformation other = (UserInformation) obj;
	return Objects.equals(password, other.password) && Objects.equals(username, other.username);
}
  
}
