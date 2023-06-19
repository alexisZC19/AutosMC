/** **********
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 19/06/2023
 * fecha modificación:
 * Descripción: se creo la interface IRegistroService
 *
 */
package service;

import entity.Empleado;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface IRegistroEmpleadoService {

  public void crearRegistro(List<Empleado> listaEmpleado, Empleado persona);

    public void mostrarRegistros(List<Empleado> listaEmpleado, DefaultTableModel cliente);

    public void eliminarRegistro(List<Empleado> listaEmpleado, String IDE);
    

}
