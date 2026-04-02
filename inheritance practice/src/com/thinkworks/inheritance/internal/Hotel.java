package com.thinkworks.inheritance.internal;

public class Hotel {

   public Hotel(){
        System.out.println("created hotel class");
       System.out.println("  ");
       {
           System.out.println("created static block");
       }
   }

    public static void main() {
        System.out.println("  ");
       System.out.println("main class is created");
    }

}
