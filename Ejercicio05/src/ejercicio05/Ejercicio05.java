/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author HP
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solucion de problema Ejercicio 5
        
        int variable1 = 2;
        int variable2 = 12;
        int variable3 = 1;
        int variable4 = 3;
       
       double resultado = ((Math.pow(variable1,variable1) + variable2 - variable3) /
                (variable4));
    
        System.out.println("----------Resultado----------") ;
        // Math.pow nos permite elevar un exponencialmente 
        
        
        System.out.println(resultado); 
    }
    
}
