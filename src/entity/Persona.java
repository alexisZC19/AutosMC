/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripción: se creo la clase persona
 * 
 */
package entity;


public class Persona {
    private String nombre;
    private int edad;
    private String IDE;

    public Persona() {
    }

    public Persona(String nombre, int edad, String IDE) {
        this.nombre = nombre;
        this.edad = edad;
        this.IDE = IDE;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }
    
    
}
