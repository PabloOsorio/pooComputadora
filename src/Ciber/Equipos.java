/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciber;

import computadoras.CPU;
import computadoras.Computadora;
import computadoras.Monitor;
import computadoras.Mouse;
import computadoras.Teclado;

/**
 *
 * @author pablo
 */
public class Equipos {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teclado pTeclado;
        pTeclado = new Teclado();
        
        CPU pCPU; 
        pCPU = new CPU();
        
        Monitor pMonitor; 
        pMonitor = new Monitor();
        
        Mouse pMouse;
        pMouse = new Mouse();
        
        Computadora pComputadora; 
        pComputadora = new Computadora(1223, 12, pCPU, pMonitor, pMouse, pTeclado);
        System.out.println(".-.-.-.-.");
        System.out.println( pComputadora.toString());
        // Sin el To string no te imprime todos los datos tu tendraias que poner que quieres explicitamente
    }
    
}
