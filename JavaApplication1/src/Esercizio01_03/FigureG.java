/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio01_03;

/**
 *
 * @author valerio.paciolla
 */
abstract public class FigureG {
    private String figura;

    public FigureG(String figura) {
        this.figura = figura;    
    }
    public FigureG() {
    }
    public String getfigura() 
    {return figura;}
    abstract public double getPerimetro();
    abstract public double getArea(); 

    @Override
    public String toString() {
        return "FigureG{" + "figura=" + figura + '}';
    }
    

}

