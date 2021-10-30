/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author HP
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solucion de problema Ejercicio 6
        
        int variable1 = 81;
        int variable2 = 9;
        int variable3 = 3;
        int variable4 = 10;
        int variable5 = 1;
         
        double resultado = ((Math.sqrt(variable1) + variable2 ) /
                (variable3));
    
        System.out.println("----------Resultado----------") ;
        // Math.pow nos permite elevar un exponencialmente 
             
        
        System.out.println(resultado); 
         System.out.println("1.Resultado ") ;
        
        System.out.println(resultado==9);
         boolean resultado1 =(false) ;
        
        System.out.println("----------Resultado problema pt2----------") ;
         System.out.println(variable4>variable5) ;
          boolean resultado2 = (true) ;
         
        System.out.println("----------Resultado Final del problema----------") ;
         System.out.println(resultado1 && resultado2);
        
    }
    
}
