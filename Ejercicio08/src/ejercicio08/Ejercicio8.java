/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author HP
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solucion de problema Ejercicio 8
        
        int variable1 = 10;
        int variable2 = 9;
        int variable3 = 20;
        int variable4 = 500;
        int variable5 = 2;
        int variable6 = 3;
        int variable7 = 200;
        int variable8 = 50;
        int variable9 = 51;
        
        double respuesta1 = ((variable1 * variable2) + variable3 - (variable4 / variable5) 
                + (Math.pow(variable6,2))) ;
        double respuesta2 = (variable8 - variable8 + variable9) ;
        
        
        System.out.println("----------Resultados----------") ;
        // Math.pow nos permite elevar un exponencialmente  
        
     
    System.out.println("1.Resultado") ;  
        System.out.println(respuesta1) ;
         System.out.println(respuesta1 >= variable7);
          boolean resultado1 = false ;
                
    System.out.println("2.Resultado ") ;
        System.out.println(respuesta2) ;
         System.out.println(variable8 >= respuesta2);
           boolean resultado2 = false ;
           
     System.out.println("3.Resultado Final") ;     
        System.out.println(resultado1 || resultado2 );
    }
    
}
