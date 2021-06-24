/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadoras;

/**
 *
 * @author pablo
 */
public class Computadora {
//Constructor por defecto 
    private int marca;
    private int modelo;
    // Falta hacer la composicion de los demas objetos (objeto que depende de otros objetos)
    private CPU cpu;
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;

    public Computadora() {
        //Asi queda por defecto this.cpu = null; 
    }
//sobrecargado 
    public Computadora(int marca, int modelo, CPU cpu, Monitor monitor, Mouse mouse, Teclado teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.cpu = cpu;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", cpu=" + cpu + ", monitor=" + monitor + ", mouse=" + mouse + ", teclado=" + teclado + '}';
    }
    

}
