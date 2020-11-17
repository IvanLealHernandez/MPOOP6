/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop6;

/**
 * Clase que herada de Persona y modela a un trabajador
 * @author Leal Hernandez Haziel Ivan
 */
public class Trabajador extends Persona{
    private int sueldo;

    public Trabajador() {
    }
    /**
     * 
     * @param sueldo Sueldo del trabajador
     * @param nombre
     * @param numTel
     */
    public Trabajador(int sueldo, String nombre, int numTel) {
        super(nombre, numTel);
        this.sueldo = sueldo;
    }
    /**
     * 
     * 
     * @return sueldo
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * 
     * 
     * @param sueldo
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    } 

    /**
     * 
     * 
     * @return cadena con infromacion del trabajador
     */
    @Override
    public String toString() {
        return super.toString() + "Trabajador{" + "sueldo=" + sueldo + '}';
    }
    
    /**
     * 
     * 
     * @param porcentahe
     */
    void aumentarSueldo(int porcentaje){
        sueldo+=(int) (sueldo*porcentaje/100);
    }
}
