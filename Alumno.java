/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop6;

/**
 * Clse que hereda de la clase Persona y modela a un alumno
 * @author Leal Hernandez Haziel Ivan
 */
public class Alumno extends Persona{
    
    private int numMaterias;

    public Alumno() {
    }
    /**
     * 
     * @param numMaterias Cantidad de materias del alumno
     * @param nombre
     * @param numTel
     */
    public Alumno(int numMaterias, String nombre, int numTel) {
        super(nombre, numTel);
        this.numMaterias = numMaterias;
    }
    /**
     * 
     * 
     * @return numMaterias
     */
    public int getNumMaterias() {
        return numMaterias;
    }

    /**
     * 
     * 
     * @param numMaterias
     */
    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }

    /**
     * 
     * 
     * @return cadena coninfromacion del alumno
     */
    @Override
    public String toString() {
        return super.toString() + "Alumno{" + "numMaterias=" + numMaterias + '}';
    }
 
    /**
     * 
     * 
     * @param nuevas
     */
    void nuevasMaterias(int nuevas){
        numMaterias = nuevas;
    }
}
