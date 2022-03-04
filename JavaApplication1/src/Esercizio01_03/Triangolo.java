/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio01_03;

/**
 *
 * @author valerio.paciolla
 */
public class Triangolo extends FigureG{
   final private double lato1;
   final private double lato2;
   final private double lato3;

    public Triangolo(double lato1, double lato2, double lato3, String figura) {
        super(figura);
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }
    public double getArea(){
        return lato1*lato2/2;
    }
    public double getPerimetro(){
        return lato1+lato2+lato3;
    }

    @Override
    public String toString() {
        return "Triangolo{" + "lato1=" + lato1 + ", lato2=" + lato2 + ", lato3=" + lato3 + '}';
    }
    
}
    
    

