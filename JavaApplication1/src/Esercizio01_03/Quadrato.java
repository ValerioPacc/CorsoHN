/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio01_03;

/**
 *
 * @author valerio.paciolla
 */
public class Quadrato extends FigureG{
      private double base;
      private double altezza;
      private double lato;

    public Quadrato(double base, double altezza, double lato, String figura) {
        super(figura);
        this.base = base;
        this.altezza = altezza;
        this.lato = lato;
    }
      public double getArea(){
          return base * altezza;
      }
      public double getPerimetro(){
          return lato*4;
      }

    @Override
    public String toString() {
        return "Quadrato{" + "base=" + base + ", altezza=" + altezza + ", lato=" + lato + '}';
    }
          
}
