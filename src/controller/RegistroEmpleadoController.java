/** **********
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 28/05/2023
 * fecha modificación:
 * Descripción: se creo la clase RegistroController
 *
 */
package controller;

import entity.Empleado;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.IRegistroEmpleadoService;
import service.RegistroEmpleadoServiceImpl;



/**
 *
 * @author labtecweb07
 */
public class RegistroEmpleadoController {

    IRegistroEmpleadoService service = new RegistroEmpleadoServiceImpl();

    public void RegistrarEmpleado(List<Empleado> listaEmpleado, Empleado persona) {
        service.crearRegistro(listaEmpleado, persona);
    }

    public void Mostrar(List<Empleado> listaEmpleado, DefaultTableModel trabajador) {

        service.mostrarRegistros(listaEmpleado, trabajador);
    }

    public void eliminarRegistro(List<Empleado> listaEmpleado, String IDE){

        service.eliminarRegistro(listaEmpleado, IDE);
    }

}
