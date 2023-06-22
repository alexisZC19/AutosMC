/** **********
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:11/06/2023
 * Descripción: se creo la clase RegistroClienteModelsImpl
 */
package model;

import entity.Cliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class RegistroClienteModelImpl implements IRegistroClienteModel {

    @Override
    public void crearRegistro(List<Cliente> listaCliente, Cliente persona) {
        //coche.setVelocidad(coche.getVelocidad());
         listaCliente.add(persona);
    }

    @Override
    public void mostrarRegistros(List<Cliente> listaCliente, DefaultTableModel cliente) {
        cliente.setRowCount(0);
        for (Cliente persona : listaCliente) {
            Object[] fila = new Object[5];
            fila[0] = persona.getNombre();
            fila[1] = persona.getEdad();
            fila[2] = persona.getCodCliente();
            fila[3] = persona.getTelefono();
            cliente.addRow(fila);

        }
    }

    @Override
    public void eliminarRegistro(List<Cliente> listaCliente, String codCliente) {
        for (Cliente persona : listaCliente) {
            if (persona.getCodCliente().compareTo(codCliente) == 0) {
                listaCliente.remove(persona);
                break;
            }
        }

       
    }
}
