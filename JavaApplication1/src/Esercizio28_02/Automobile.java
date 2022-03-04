/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio28_02;

/**
 *
 * @author valerio.paciolla
 */
public class Automobile {
    private String targa;
    private String modello;
    private String colore;
    private Proprietario Proprietario;
    
    public Automobile(String targa, String modello,String colore, Proprietario p){
        this.targa=targa;
        this.modello=modello;
        this.colore=colore;
        this.Proprietario=p;
    }
    public String getTarga(){
        return targa;
    }
    public String getModello(){
        return modello;
    }
     public String getColore(){
        return colore;
     }
     public Proprietario getProprietario(){
         return Proprietario;
     }
     public void setColore(String Rosso){
         colore=Rosso;
     }
     public void setProprietario(Proprietario Lorenzo){
     this.Proprietario=Lorenzo;        
     }

    @Override
    public String toString() {
        return "Automobile{" + "targa=" + targa + ", modello=" + modello + ", colore=" + colore + ", Proprietario=" + Proprietario + '}';
    }

    
    }
     
     
     
          

    
    




