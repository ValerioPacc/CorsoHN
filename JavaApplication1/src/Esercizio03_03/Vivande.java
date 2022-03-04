/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio03_03;

/**
 *
 * @author valerio.paciolla
 */
public class Vivande {
    private String nome;
    private int prezzo;

    public Vivande(String nome, int prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }
    public String getNome(){
        return nome;
    }
    public int getPrezzo(){
        return prezzo;
    }

    @Override
    public String toString() {
        return "Vivande{" + "nome=" + nome + ", prezzo=" + prezzo + '}';
    }
    
    
}
