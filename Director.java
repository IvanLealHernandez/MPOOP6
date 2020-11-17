/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop6;

/**
 * Clase que hereda de Trabajdor y modela un Director
 * @author Leal Hernandez Haziel Ivan
 */
public class Director extends Trabajador{
    
    private int presupuesto;

   /**
   * Constructor sin parametros
   */
    public Director() {
    }

   /**
   * Constructor
   * @param numTel
   * @param presupuesto
   * @param sueldo
   * @param nombre
   */
    public Director(String nombre, int numTel, int sueldo, int presupuesto) {
        super(sueldo, nombre, numTel);
        this.presupuesto = presupuesto;
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
   * @return cadena con informacion del director
   */
    @Override
    public String toString() {
        return super.toString()+"Director{" + "presupuesto=" + presupuesto + '}';
    }
    
   /**
   * Metodo que devuleve un salario por horas trbajadas
   * @param horas
   * @return salario
   */
    public float pagarSueldo(int horas){
        float salario=(float)(233.46*horas);
        return salario;
    }
    
}
