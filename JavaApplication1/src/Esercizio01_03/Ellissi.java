/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio01_03;

import static java.lang.Math.*;
import static java.lang.StrictMath.pow;

/**
 *
 * @author valerio.paciolla
 */
public class Ellissi extends FigureG{
    final private double semM;
    final private double semm;

    public Ellissi(double semM, double semm, String figura) {
        super(figura);
        this.semM = semM;
        this.semm = semm;
    }
    public double getArea(){
        return PI*semM*semm; 
    }
    public double getPerimetro(){
        return 2*Math.PI*Math.sqrt (semM Math.pow 2)+(semm Math.pow  2)/2;
    }

    @Override
    public String toString() {
        return "Ellissi{" + "semM=" + semM + ", semm=" + semm + ", raggio=" +'}';
    }

    
      
}
