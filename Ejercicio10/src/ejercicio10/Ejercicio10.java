/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author HP
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solucion de problema Ejercicio 10
        
        int variable1 = 25;
        int variable2 = 10;
        int variable3 = 100;
        int variable4 = 5;
        int variable5 = 2;
        
        
        double respuesta1 = ((Math.sqrt(variable1)) * variable2) ; 
        double respuesta2 = ((variable2 / variable4)) ;
        
        
        System.out.println("----------Resultados----------") ;
        // Math.sqrt me permite obtener la raiz cuadrada de un numero
          
        
    System.out.println("1.Resultado") ;  
        System.out.println(respuesta1) ;
         System.out.println(respuesta1 >= variable3);
          boolean resultado1 = false ;
    System.out.println("1.1.Resultado") ;   
        boolean factor1 = true ;
         System.out.println(resultado1 && factor1) ;
         boolean factor1respuesta = false ;
    System.out.println("1.2.Resultado") ;   
         boolean factor2 = false ;
          System.out.println(factor1respuesta || factor2 ) ;
           boolean factoresrespuesta = false ;
                
    System.out.println("2.Resultado") ;  
        System.out.println(respuesta2) ;
         System.out.println(respuesta2 >= variable5);
          boolean resultado2 = true ; 
    
     System.out.println("3.Resultado Final") ;     
        System.out.println(factoresrespuesta || resultado2 );
    }
    
}
