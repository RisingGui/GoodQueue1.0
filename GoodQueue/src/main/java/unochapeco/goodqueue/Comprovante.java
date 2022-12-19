/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unochapeco.goodqueue;

/**
 *
 * @author PC
 */
public class Comprovante {
 public static int Chegada = 1;

 public Comprovante() {
    }
   
    
 

    
 public Comprovante(int Chegada) {
      Comprovante.Chegada = Chegada;
     
        
    }

  

    /**
     * @return the Chegada
     */
    public static int getChegada() {
        return Chegada ++ ;
    }

    /**
     * @param Chegada the Chegada to set
     */
    public void setChegada(int Chegada) {
        Comprovante.Chegada = Chegada ;
    }
 @Override
   public String toString(){
     return "Senha " + Comprovante.Chegada  ;
}

 
}