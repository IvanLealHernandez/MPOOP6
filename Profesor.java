/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop6;

/**
 * Clase que hereda de Trabajador y modela un Profesor
 * @author Leal Hernandez Haziel Ivan
 */
public class Profesor extends Trabajador{
    
    private String materia;

   /**
   * Constructor sin parametros
   */
    public Profesor() {
    }

   /**
   * Constructor
   * @param nombre
   * @param numTel
   * @param sueldo
   * @param materia
   */
    public Profesor(String nombre, int numTel, int sueldo, String materia) {
        super(sueldo, nombre, numTel);
        this.materia = materia;
    }

   /**
   * @return materia
   */
    public String getMateria() {
        return materia;
    }

   /**
   * @param materia
   */
    public void setMateria(String materia) {
        this.materia = materia;
    }

   /**
   * @return cadena con informacion del profesor
   */
    @Override
    public String toString() {
        return super.toString()+"Profesor{" + "materia=" + materia + '}';
    }
    
   /**
   * Metodo que devuleve una calificacion final (redondeada)
   * @param calificacion
   * @return calificacionFinal
   */
    public float entregarCalificacionFinal(int calificacion){
        int calificacionFinal=Math.round(calificacion);
        return calificacionFinal;
    }
    
}
