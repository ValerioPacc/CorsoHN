/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio28_02.Scuola;

/**
 *
 * @author valerio.paciolla
 */
public class Classi {
    private String nome;
    private Insegnanti Insegnanti;
    private String numAlunni;
    public EsrScuola EsrScuola;
    
    public Classi (String nome, Insegnanti insegnanti, String numAlunni,EsrScuola scuola) {
        this.nome = nome;
        this.numAlunni = numAlunni;
        this.Insegnanti = insegnanti;
        this.EsrScuola = scuola;
    }
    public String getNome(){
        return nome;
    }
    public String getNumAlunni(){
        return numAlunni;
    }
     public Insegnanti getInsegnaanti(){
        return Insegnanti;
     }
     public EsrScuola getEsrScuola(){
         return EsrScuola;
     }
     
}
    


    

