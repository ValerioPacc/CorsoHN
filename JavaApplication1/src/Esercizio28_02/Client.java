/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio28_02;

import java.util.Scanner;

/**
 *
 * @author valerio.paciolla
 */
public class Client {
    public void Verniciatura( Automobile a1 ,String c){
        a1.setColore(c);  
    
    } 
    public static Automobile matricola(String ntarga){
        Automobile f1;
        f1=new Automobile(ntarga,"ford","grigio",null);
        return f1;
    
    }
    public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    Automobile f2= matricola("AS927RM");
    System.out.println(f2.toString());
    f2.setColore(s.next());
        System.out.println(f2.toString());

    }
}    

