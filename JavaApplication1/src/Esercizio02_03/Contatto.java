/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio02_03;

/**
 *
 * @author valerio.paciolla
 */
public class Contatto {
    private String nome;
    private String cognome;
    private String telefono;

    public Contatto(String nome, String cognome, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public String getTelefono(){
        return telefono;
    }

    @Override
    public String toString() {
        return "Contatto{" + "nome=" + nome + ", cognome=" + cognome + ", telefono=" + telefono + '}';
    }
    
}
