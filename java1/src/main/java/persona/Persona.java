/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author valerio.pacciolla
 */
public class Persona {
    private String nome;
    private String residenza;
    public Persona(String a,String b){
        nome = a;
        residenza = b;       
    }
    
    public String getNome(){
        return nome;
    }
        public String getResidenza(){
            return residenza;
    }
        public void setResidenza(String Spinaceto){
            residenza = Spinaceto;
        }
        public void setNome(String nuovaResidenza){
            nome = nuovaResidenza;
        }
    
}

    

