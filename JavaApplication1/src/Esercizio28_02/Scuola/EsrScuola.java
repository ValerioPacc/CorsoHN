/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio28_02.Scuola;

/**
 *
 * @author valerio.pacciolla
 */
public class EsrScuola {
    private String nome;
    private String indirizzo;
    private String provveditoriato;

    public EsrScuola(String nome, String indirizzo, String provveditoriato) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.provveditoriato = provveditoriato;
    }
    public String getNome(){
        return nome;
    }
    public String getIndirizzo(){
        return indirizzo;
    }
     public String getProvveditoriato(){
        return provveditoriato;
     }
public static void main(String[] args){
    
    EsrScuola s1= new EsrScuola("Majorana","Spinaceto","bcwhb");
    EsrScuola s2= new EsrScuola("Plauto","TordeCenci","hjdij");
    EsrScuola s3= new EsrScuola("Caravaggio","Decima","iuenc");
    EsrScuola[] Scuola= new EsrScuola[3];
     Scuola[0] = s1; 
     Scuola[1] = s2;
     Scuola[2] = s3;
 }
}


 
     
