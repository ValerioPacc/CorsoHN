/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizi;

import java.util.Scanner;

/**
 *
 * @author valerio.paciolla
 */
public class Contenuto {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci la stringa da convertire: ");
        String x = scan.nextLine();

        //String Parola1= "casa";
        //String Parola2= "casale";
        String t = "";
        for (int i = 0; i < x.length(); i++) {
            if (i % 2 == 0) {
                t += Character.toUpperCase(x.charAt(i));
            } else {
                t += x.charAt(i);
            }
        }
        System.out.println("la nuova stringa è: "+t);
    }
}
