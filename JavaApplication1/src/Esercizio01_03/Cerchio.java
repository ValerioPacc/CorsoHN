/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio01_03;

import static java.lang.Math.PI;

/**
 *
 * @author valerio.paciolla
 */
public class Cerchio extends FigureG {
   final private double raggio;

    public Cerchio(double raggio, String figura) {
        super(figura);
        this.raggio = raggio;
    }

   
    
    
    public double getArea(){
        return raggio * raggio;
    }

    public double getPerimetro(){
        return 2*PI*raggio;
    }

    @Override
    public String toString() {
        return "Cerchio{" + "raggio=" + raggio + '}';
    }
    
}
