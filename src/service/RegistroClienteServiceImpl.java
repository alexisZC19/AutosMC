/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripción: se creo la clase RegistroServiceImpl
 */
package service;

import entity.Cliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.IRegistroClienteModel;
import model.RegistroClienteModelImpl;


public class RegistroClienteServiceImpl  implements IRegistroClienteService{
    IRegistroClienteModel modelo = new RegistroClienteModelImpl();

    @Override
    public void crearRegistro(List<Cliente> listaCliente, Cliente persona) {
        modelo.crearRegistro(listaCliente, persona);
    }

    @Override
    public void mostrarRegistros(List<Cliente> listaCliente, DefaultTableModel cliente) {
        modelo.mostrarRegistros(listaCliente, cliente);
    }

    @Override
    public void eliminarRegistro(List<Cliente> listaCliente, String IDE) {
        modelo.eliminarRegistro(listaCliente, IDE);
    }


   
    
}
