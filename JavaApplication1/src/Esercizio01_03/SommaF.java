/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio01_03;
/**
 *
 * @author valerio.paciolla
 */
public class SommaF {
    
    public static double sommaPerimetro (FigureG[]f){
        double s=0;
        for (int i = 0; i < f.length; i++) 
            s+=f[i].getPerimetro();
        return s;
        }
    
        public static double sommaArea (FigureG[]f){
        double a=0;
        for (int i = 0; i < f.length; i++) 
            a+=f[i].getArea();
        return a;
         }
    
    public static void main (String[] args){
        FigureG[] f = new FigureG[5];
        f[0] = new  Rettangolo(5.2,10.5,"rettangolo");
        f[1]= new Quadrato(6.6,6.6,6.6,"quadrato");
        f[2]= new Triangolo(3.5,4.5,5.5,"triangolo");
        f[3]= new Cerchio(6.5,"cerchio");
        f[4]= new Ellissi(3.5,6.5,"ellisse");
        double p = sommaPerimetro(f);
        System.out.println("sommaPerimetro =" + p);
        double k = sommaArea(f);
        System.out.println("sommaArea=" + k);
    }
    
    
}