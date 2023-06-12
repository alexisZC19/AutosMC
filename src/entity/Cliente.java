/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripcion: se creo la clase cliente
 * 
 */
package entity;


public class Cliente extends Persona{

    private String codCliente;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String codCliente, String telefono) {
        this.codCliente = codCliente;
        this.telefono = telefono;
    }

    public Cliente(String codCliente, String telefono, String nombre, int edad, String IDE) {
        super(nombre, edad, IDE);
        this.codCliente = codCliente;
        this.telefono = telefono;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
   
   
 
    

}
