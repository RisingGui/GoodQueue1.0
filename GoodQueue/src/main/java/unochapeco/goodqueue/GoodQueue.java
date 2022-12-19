package unochapeco.goodqueue;


import java.util.Scanner;

public class GoodQueue {

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in); //Scanner Int
       
   int ch = 0 ;
    do{
  
   System.out.println("1.Criar nova senha normal");
   System.out.println("2.Criar nova senha Preferencial");
   System.out.println("\n" + "0.Finalizar o Sistema");
               
   ch = s.nextInt();
   
       //Inicio dos Casos
       
       switch (ch) {
        
           case 1 : // Caso Gerador de senha normal
            System.out.println("-------------------------------------");
        System.out.println // Puxa o metodo get da classe Comprovante
        ("Sistema gerou a senha normal "  + Comprovante.getChegada() + " para o cliente ");
        System.out.println("-------------------------------------");
        break;
        
        case 2 ://Caso Gerador de senha preferencial
     
        System.out.println("-------------------------------------");
            System.out.println // Puxa o metodo get da classe ComprovantePref 
        ("Sistema gerou a senha Preferencial " + ComprovantePref.getChegadaPref() + ComprovantePref.getChegadaPreF()+ " para o cliente ");
        System.out.println("-------------------------------------");
         break;
                     }// Fim do Switch
       } // Fim dos Casos
    
       while(ch!=0); 
    
       
    }


}
