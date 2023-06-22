/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripción: se creo la interface IRegistroClienteModel
 */
package model;

import entity.Empleado;
import java.util.List;
import javax.swing.table.DefaultTableModel;



public interface IRegistroEmpleadoModel {
    public void crearRegistro(List<Empleado> listaEmpleado, Empleado persona);

    public void mostrarRegistros(List<Empleado> listaEmpleado, DefaultTableModel trabajador);

    public void eliminarRegistro(List<Empleado> listaEmpleado, String codEmpleado);
    
}
