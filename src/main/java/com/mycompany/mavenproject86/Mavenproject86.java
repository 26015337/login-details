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
      double a,b,c,d;
      System.out.println("CLICK 1  FOR TIMETABLE");
      a=input.nextDouble();
       System.out.println("ENTER  YOUR  STUDENT  NUMBER");
      b=input.nextDouble();
       System.out.println("ENTER  YOUR PIN");
       c=input.nextDouble();
       if(a!=1){
            System.out.println("GOODBYE");
       }
       if(b!=26023 || c!=223){
            System.out.print("here  is timetable"
                    + "[MONDAY] | MAT1241 | CHEM223 | COM1226|"
                    + "[TEUSDAY] |com1321 |ecs 1245| mat1243| "
                    + "[WEDNESDAY]|                 |    ecs1245"
                    + "[THURSDAY]|  MAT 1241   | chen12332| "
                    + "[FRIDAY]| com1321| com1226 |   ecs1245|"
                  
                
                    + "");
       }
        
                     
                    }

      }
      
    

