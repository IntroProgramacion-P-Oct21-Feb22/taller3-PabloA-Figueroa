/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author HP
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solucion de problema Ejercicio 9
        
        int variable1 = 81;
        int variable2 = 25;
        int variable3 = 10;
        int variable4 = 50;
        
        double respuesta1 = ((Math.sqrt(variable1)) + (Math.sqrt(variable2)) * 
                variable3) ;
        
        System.out.println("----------Resultados----------") ;
        //Math.sqrt me permite obtener la raiz cuadrada de un numero
        
               
       System.out.println("Resultado Final") ;  
        System.out.println(respuesta1) ;
         System.out.println(respuesta1 >= variable4);
          
                
    
    }
    
}
