/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author valerio.paciolla
 */
public class Docente {
    private String nome;
    private String cognome;
    private int codice;
    private int eta;

    public Docente(String nome, String cognome, int codice, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.eta = eta;
    }
 public String getNome(){
        return nome;
 }
  public String getCognome(){
        return cognome;
  }
   public int getCodice(){
        return codice;
  }
  
 public int getEta(){
        return eta;
 }

    @Override
    public String toString() {
        return "Docente{" + "nome=" + nome + ", cognome=" + cognome + ", codice=" + codice + ", eta=" + eta + '}';
    }
 
}
