/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author HP
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solucion de problema Ejercicio 3
        
        int variable1 = 10;
        int variable2 = 2;
        int variable3 = 16;
        int variable4 = 20;
        int variable5 = 1;
        int variable6 = 11;
    
        double resultado= ((Math.pow(variable1,variable2)) + (Math.sqrt(variable3)) +
                 (variable4 /(variable5 + variable6))) ;
        
        
        System.out.println("----------Resultado----------") ;
        /* Math.pow nos permite elevar un exponencialmente 
        Math.sqrt me permite obtener la raiz cuadrada de un numero
        */
                      
        
        System.out.println(resultado) ;
              
    }
    
}
