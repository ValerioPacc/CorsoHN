/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Esercizio02_03.Contatto;
import java.util.ArrayList;

/**
 *
 * @author valerio.pacciolla
 */
public class Università {
    ArrayList<Docente> docenti;
public Università(){
    docenti= new ArrayList();
    
}    

    public Università(ArrayList<Docente> docenti) {
        this.docenti = docenti;
    }
                

    public  int EtaMinima(){
        int n = 100;
        for (int i =0;i<docenti.size();i++){
            if(docenti.get(i).getEta()<n){
                n=docenti.get(i).getEta();
            }
            return n;
        }
        
    public  void  TrovaGiovani(){
    int EtaMinima = EtaMinima();
    System.out.println("i docenti con eta"+EtaMinima+"sono:");
    for(int i =0;i<docenti.size();i++){
        if(docenti.get(i).getEta()==EtaMinima());
    
        System.out.println(docenti.get(i)+getCognome());
    }
    }
    










    

            
       
        
    
    
    












   


     
    
                     
                     
         
     
    

