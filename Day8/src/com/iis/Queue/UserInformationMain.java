package com.iis.Queue;
import java.util.*;
public class UserInformationMain 
{
  private Set<UserInformation> ui;
  private Scanner sc;
  String type="";
  UserInformation u;
  public UserInformationMain() {
      sc=new Scanner(System.in);
      ui=new HashSet<>();
      u=new UserInformation();
    
  }
  public void insertUser() {
      System.out.println("Enter how many user do u want");
      int index=sc.nextInt();
      for(int i=0;i<index;i++) {
          UserInformation u=new UserInformation();
          System.out.println("Enter the user id");
          u.setUserid(sc.nextInt());
          System.out.println("Enter the Username");
          u.setUsername(sc.next());
          System.out.println("Enter the Password");
          u.setPassword(sc.next());
          System.out.println("Enter The Type of Account(admin/user)");
          u.setType(sc.next());
          
          ui.add(u);
      }
  }
  public void checkUser() {
      System.out.println("Enter the UserName");
      String un=sc.next();
      System.out.println("Enter the Password");
      String pwd=sc.next();
      boolean x=false,y=false;;
      for(UserInformation uu:ui) {
          if(uu.getUsername().equals(un) && uu.getPassword().equals(pwd)) {
             x=true;
              //navigate();
          if(uu.getType().equals("admin")) {
              y=true;
          }
        else {
            y=false;
        }
          }
      }
      if(x==true && y==true) {
          System.out.println("The User is Valid");
          navigate();
      }
      else if(x==true && y==false) {
          System.out.println("The User is valid");
          navigate();
      }
      else {
          System.out.println("Invalid UserName or Password");
          System.out.println("The User Page is Opening");
      }
  }
 public void navigate() {
      System.out.println("Enter your type");
      type=sc.next();
      
      if(type.equalsIgnoreCase("admin")){
          AdminPage.displayAdmin();
      }
      else if(type.equalsIgnoreCase("user")){
          UserPage.displayUser();
      }
      else{
          System.out.println("Entre the Valid Account Type");
      }
      
  }
  public static void main(String[] args) {
    UserInformationMain uin=new UserInformationMain();
    uin.insertUser();
    uin.checkUser();
}
}