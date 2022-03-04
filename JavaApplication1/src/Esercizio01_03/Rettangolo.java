/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio01_03;

/**
 *
 * @author valerio.paciolla
 */
public class Rettangolo extends FigureG {
   final private double altezza;
   final private double base;

    public Rettangolo(double altezza, double base, String figura) {
        super(figura);
        this.altezza = altezza;
        this.base = base;
    }
    public double getArea() {
        return base * altezza;
    }

    public double getPerimetro() {
        return (base + altezza) * 2;
    }

    @Override
    public String toString() {
        return "Rettangolo{" + "altezza=" + altezza + ", base=" + base + '}';
    }
    
}
