/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio28_02.Scuola;

/**
 *
 * @author valerio.paciolla
 */
public class Insegnanti {
    private String nome;
    private String cognome;
    private String annoVincita;
    private EsrScuola EsrScuola;

    public Insegnanti (String nome, String cognome, String annoVincita,EsrScuola scuola) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoVincita = annoVincita;
        this.EsrScuola = scuola;
    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
     public String getannoVincita(){
        return annoVincita;
     }
     public EsrScuola getEsrScuola(){
         return EsrScuola;
     }
     Insegnanti I1 = new Insegnanti("Paolo","ggviyviy","bcwhb", null);
     Insegnanti I2= new Insegnanti("Ugo","cvgvbu","hjdij", null);
     Insegnanti I3 = new Insegnanti("Caravaggio","Decima","iuenc", null);
    Insegnanti[] Professore= new Insegnanti[3];
     Professore[0] = I1
     Professore[1] = 
     Professore[2];
     
}
    

