/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author HP
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solucion de problema Ejercicio 7
        
        int variable1 = 81;
        int variable2 = 9;
        int variable3 = 3;
        int variable4 = 10;
        int variable5 = 1;
        int variable6 = 100;
        int variable7 = 25;
        
        double resultado = ((Math.sqrt(variable1) + variable2 ) /
                (variable3));
        double resultado2 = (variable6 / (variable7)) ;
        double resultado22 = (Math.sqrt(variable6)) ;
        
         
        System.out.println("----------Resultados----------") ;
        // Math.sqrt me permite obtener la raiz cuadrada de un numero. 
        
      
          System.out.println(resultado); 
           System.out.println("1.Resultado ") ;
            System.out.println(resultado2) ;
            
        System.out.println("2.Resultado problema ") ;
          System.out.println(resultado==9);
           boolean resultado1 =(false) ;
           
        System.out.println("3.Resultado problema ") ;
          System.out.println(variable4>variable5) ;
           boolean resultado3 = (true) ;
           
        System.out.println("4.Resultado problema ") ;
          System.out.println(resultado2>resultado22);
           boolean resultado4 = false ;
           
        System.out.println("5.Resultado del problema") ;
          System.out.println(resultado1 || resultado3);
           boolean resultadoproblema1 = (true) ;
           
        System.out.println("Resultado final") ;       
          System.out.println(resultadoproblema1 && resultado4) ;
    }
    
}
