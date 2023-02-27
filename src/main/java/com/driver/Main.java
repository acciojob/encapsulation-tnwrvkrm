package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly x = new RWOnly();
        x.setName("vikki");
        System.out.println(x.getName());
        //name has private access in com.driver.RWOnly


    }
  
}