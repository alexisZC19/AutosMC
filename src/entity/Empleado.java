/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripción: se creo la clase empleado
 * 
 */
package entity;


public class Empleado extends Persona{
    private String codEmpleado;
    private String seccion;


    public Empleado() {
    }

    public Empleado(String codEmpleado, String seccion) {
        this.codEmpleado = codEmpleado;
        this.seccion = seccion;
    }

    public Empleado(String codEmpleado, String seccion, String nombre, int edad) {
        super(nombre, edad);
        this.codEmpleado = codEmpleado;
        this.seccion = seccion;
    }

    

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    

  
    
    
    
}
