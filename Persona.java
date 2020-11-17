/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop6;

/**
 * Clase base de la practica 6
 * @author alesc
 */
public class Persona {
    
    private String nombre;
    private int numTel; 

    public Persona() {
    }
    /**
     * 
     * @param nombre Nombre de la persona
     * @param numTel Telefono de la persona
     */
    public Persona(String nombre, int numTel) {
        this.nombre = nombre;
        this.numTel = numTel;
    }
    /**
     * 
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * 
     * @return numTel
     */
    public int getNumTel() {
        return numTel;
    }

    /**
     * 
     * 
     * @param numTel
     */
    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    /**
     * 
     * 
     * Metodo que regresa informacion de la persona
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", numTel=" + numTel + '}';
    }

    /**
     * 
     * 
     * @param nuevo
     */
    void cambiarTel(int nuevo){
        numTel = nuevo;
    }
}
