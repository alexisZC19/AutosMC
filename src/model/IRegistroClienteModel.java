/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripción: se creo la interface IRegistroClienteModel
 */
package model;

import entity.Cliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;



public interface IRegistroClienteModel {
    public void crearRegistro(List<Cliente> listaCliente, Cliente persona);

    public void mostrarRegistros(List<Cliente> listaCliente, DefaultTableModel cliente);

    public void eliminarRegistro(List<Cliente> listaCliente, String IDE);
    
}
