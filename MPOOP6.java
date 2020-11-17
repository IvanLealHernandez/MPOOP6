/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop6;

/**
 * Clase principal
 * @author Leal Hernandez Haziel Ivan
 */
public class MPOOP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("1. **************************");
        Empleado empleado = new Empleado("Jorge Montaño",123,1500);
        System.out.println(empleado);
        empleado.aumentarSueldo(15);
        System.out.println(empleado);
        
        Gerente gerente1 = new Gerente();
        gerente1.setNombre("Alan Morales");
        gerente1.setNumEmpleado(124);
        gerente1.setSueldo(20000);
        gerente1.setPresupuesto(100000);
        System.out.println(gerente1);
        
        System.out.println("2. **************************");
        gerente1.aumentarSueldo(10);
        gerente1.aumnetarPresupuesto(5);
        System.out.println(gerente1);
        
        System.out.println("3. **************************");
        Gerente gerente2 = new Gerente("Miguel Hurtado",125,21000,300000);
        System.out.println(gerente2);
        gerente2.aumnetarPresupuesto(25);
        System.out.println(gerente2);
        
    }
    
}
