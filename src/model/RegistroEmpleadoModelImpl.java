/** **********
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:11/06/2023
 * Descripción: se creo la clase RegistroClienteModelsImpl
 */
package model;

import entity.Empleado;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class RegistroEmpleadoModelImpl implements IRegistroEmpleadoModel {

    @Override
    public void crearRegistro(List<Empleado> listaEmpleado, Empleado persona) {
        //coche.setVelocidad(coche.getVelocidad());
         listaEmpleado.add(persona);
    }

    @Override
    public void mostrarRegistros(List<Empleado> listaEmpleado, DefaultTableModel trabajador) {
       trabajador.setRowCount(0);
        for (Empleado persona : listaEmpleado) {
            Object[] fila = new Object[5];
            fila[0] = persona.getNombre();
           
            trabajador.addRow(fila);

        }
    }

    @Override
    public void eliminarRegistro(List<Empleado> listaEmpleado, String IDE) {
        for (Empleado persona : listaEmpleado) {
            if (persona.getIDE().compareTo(IDE) == 0) {
                listaEmpleado.remove(persona);
                break;
            }
        }

       
    }
}
