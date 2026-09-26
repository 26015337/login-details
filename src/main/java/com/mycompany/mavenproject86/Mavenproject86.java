/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject86;

/**
 *
 * @author NDUVHO
 */import java.util.Scanner;
public class Mavenproject86 {

    public static void main(String[] args) {
        
      Scanner input=new Scanner (System.in);
      double username,password;
    System.out.println("username");
      username=input.nextDouble();
      System.out.println("password");
      password=input.nextDouble();
      
      if(username!=260234|| password !=334){
          System.out.println("invalid username or password");
      }
          else {
          System.out.println("welcome");
      }
      
    }
}
