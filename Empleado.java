/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop6;

/**
 * Clase que modela a un empleado
 * @author Leal Hernandez Haziel Ivan
 */
public class Empleado {
    
    private String nombre;
    private int numEmpleado;
    private int sueldo;

   /**
   * Constructor sin parametros
   */
    public Empleado() {
    }

   /**
   * Constructor
   * @param nombre
   * @param numEmpleado
   * @param sueldo
   */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

   /**
   * @return nombre
   */
    public String getNombre() {
        return nombre;
    }

   /**
   * @param nombre
   */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   /**
   * @return numEmpleado
   */
    public int getNumEmpleado() {
        return numEmpleado;
    }

   /**
   * @param numEmpleado
   */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

   /**
   * @return sueldo
   */
    public int getSueldo() {
        return sueldo;
    }

   /**
   * @param sueldo
   */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

   /**
   * @return cadena con informacion del empleado
   */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
   /**
   * Metodo que aumenta el sueldo al empleado
   * @param porcentaje
   */
    void aumentarSueldo(int porcentaje){
        sueldo+=(int)(sueldo*porcentaje/100);
    }
    
}
