/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop6;

/**
 * Clase que herda de Empleado y modela un gerente
 * @author Leal Hernandez Haziel Ivan
 */
public class Gerente extends Empleado{
    
    private int presupuesto;

   /**
   * Constructor sin argumetos
   */
    public Gerente() {
    }

   /**
   * Constructor
   * @param nombre
   * @param numEmpleado
   * @param sueldo
   * @param presupuesto
   */
    public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto=presupuesto;
    }
    
   /**
   * @return presupuesto
   */
    public int getPresupuesto() {
        return presupuesto;
    }

   /**
   * @param presupuesto
   */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
  
   /**
   * Método que asigna un  presuúesto al gerente
   * @param presupuesto
   */
    void asignarPresupuesto(int presupuesto){
        this.presupuesto=presupuesto;
    }

   /**
   * Metodo que aumenta el presupuesto al gerente 
   * @param porcentaje
   */
    void aumnetarPresupuesto(int porcentaje){
        presupuesto+=(int)(presupuesto*porcentaje/100);
    }

   /**
   * @return informacion del gerente
   */
    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    
    
}
