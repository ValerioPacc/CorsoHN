/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio28_02;

/**
 *
 * @author valerio.paciolla
 */
public class NewClass {
    public static void main(String[] args) {
        Automobile a=new Automobile("as000aa","fiat","rossa",null);
        System.out.println(a.getTarga()+" "+a.getColore()+" "+a.getModello());
        System.out.println(a.toString());
    }
}
