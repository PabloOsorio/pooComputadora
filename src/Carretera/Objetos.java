/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carretera;

import autos.objetos.Automovil;

/**
 *
 * @author pablo
 */
public class Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro objeto falta construir
        Automovil autoHiram, autoGil;
        
        autoHiram = new Automovil();
        autoGil = new Automovil("", "Tsuru", "Nissan" , 1992, 180000);
        System.out.println("-.-.-.-..");
        System.out.println("Automovil de Hiram");
        System.out.println(".-..-.-.-.");
        System.out.println("Marca: "+autoHiram.getMarca());
        System.out.println("Modelo: "+autoHiram.getModelo());
        System.out.println("Año:"+autoHiram.getAnio());
        System.out.println("Precio:"+autoHiram.getPrecio());
        System.out.println(".-.-.-..-.");
         System.out.println("-.-.-.-..");
        System.out.println("Automovil de Gil");
        System.out.println(".-..-.-.-.");
        System.out.println("Marca: "+autoGil.getMarca());
        System.out.println("Modelo: "+autoGil.getModelo());
        System.out.println("Año:"+autoGil.getAnio());
        System.out.println("Precio:"+autoGil.getPrecio());
        System.out.println(".-.-.-..-.");
        
        
    }
    
}
