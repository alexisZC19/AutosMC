/** **********
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 28/05/2023
 * fecha modificación:
 * Descripción: se creo la clase RegistroController
 *
 */
package controller;

import entity.Cliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.IRegistroClienteService;
import service.RegistroClienteServiceImpl;


/**
 *
 * @author labtecweb07
 */
public class RegistroClienteController {

    IRegistroClienteService service = new RegistroClienteServiceImpl();

    public void RegistrarCliente(List<Cliente> listaCliente, Cliente persona) {
        service.crearRegistro(listaCliente, persona);
    }

    public void Mostrar(List<Cliente> listaCliente, DefaultTableModel cliente) {

        service.mostrarRegistros(listaCliente, cliente);

    }

    public void eliminarRegistro(List<Cliente> listaCliente, String IDE){

        service.eliminarRegistro(listaCliente, IDE);
    }

}
