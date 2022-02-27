/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizi;

/**
 *
 * @author valerio.paciolla
 */
public class Rettangolo{
private int altezza;
private int larghezza;
public Rettangolo(int x, int y){
    altezza = x;
    larghezza = y;
    
}
public int getAltezza(){
    return altezza;
}
public int getLarghezza(){
    return larghezza;
}
public static void main(String[] args){
    Rettangolo r1;
    r1 = new Rettangolo(3,4);
    r1.getAltezza();
    r1.getLarghezza();
    System.out.println("l'altezza è"+r1.getAltezza());
}
    


}



    
    
    

