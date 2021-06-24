/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autos.objetos;

/**
 *
 * @author pablo
 */
public class Automovil {
    //Atributos, constructores y metodos
    private String patente;
    //visibilidad-Tipo de dato-nombre del atributo (String en mayus=clase no yipo de dato)
    private String modelo;
    private String marca;
    private int anio;
    private int precio;
//Todos los constructores publicos, mismo nombre que la clase 
    public Automovil() {
        //constructor por defecto 
        this.modelo = "Sin modelo";
        this.marca = "Sin marca";
        this.anio = 0;
        this.precio = 0;
    }

    public Automovil(String patente, String modelo, String marca, int anio, int precio) {
        this.patente = patente;
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
        //Es necesario cuando se llame igual modelo=modelo
    }
    //Def. de encapsulacion= un metodo para ver un atributo privado 
    //Métodos
    //accesadores (get) seran publicos
    //Mutadores (set)

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
//Vacio=void
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    
    
}
