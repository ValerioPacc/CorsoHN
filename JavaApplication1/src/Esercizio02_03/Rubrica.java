/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizio02_03;

/**
 *
 * @author valerio.paciolla
 */
import java.util.*;

public class Rubrica {

    ArrayList<Contatto> rubrica;

    public Rubrica() {
        rubrica = new ArrayList();
    }
    
    public void aggiungiContatto(String n, String c, String t){
        rubrica.add(new Contatto(n,c,t));
           

    }
    public void rimuoviContatto(String n, String c){
        rubrica.remove(new Contatto(n,c,null));
        Contatto cn = null;
        rubrica.remove (cn);
    }
    public String Cerca(String n, String c){
        Contatto cn;
        String cv = "";
        cn= new Contatto(n,c,null);
          Iterator<Contatto> it = rubrica.iterator();
          while(it.hasNext());{
          Contatto s= it.next();
          if ( cn.getNome().equals(n)&& cn.getCognome().equals(c)){
          cv =s.getTelefono();
          }
          else {System.out.println("Contatto non è in rubrica");}
        }  
      return cv;
    }   
    public static void main (String[] args){
        Rubrica rubrica1;
        rubrica1 = new Rubrica();
            Contatto c1;
            c1=(new Contatto("Valerio","Pacciolla","3459589899"));
            Contatto c2;
            c2=(new Contatto("Lorenzo","Pacciolla","3843999889"));
            Contatto c3;
            c3=(new Contatto("Francesco","Totti","34595977661"));
            Contatto c4;
            c4=(new Contatto("Rosa","Culetto","3459589899"));
            rubrica1.aggiungiContatto("Valerio","Pacciolla","3459589899");
            rubrica1.aggiungiContatto("Lorenzo","Pacciolla","3843999889");
            rubrica1.aggiungiContatto("Francesco","Totti","34595977661");
            rubrica1.aggiungiContatto("Rosa","Culetto","3459589899");
            System.out.println(rubrica1.Cerca("Rosa","Culetto"));

    }

}


