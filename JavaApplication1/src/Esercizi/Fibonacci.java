/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizi;

/**
 *
 * @author valerio.paciolla
 */
public class Fibonacci {
      public static void main(String[] args) {
         int n1=0; 
         int n2=1;
         int n3;
         int n4 =10;
         System.out.println(n1 + n2);
          for(int i=2;i<n4;++i){
          n3=n1+n2;
          System.out.println(""+n3);
          n1=n2;
          n2=n3;
          
      }
      }

     
     
     
    }
    

