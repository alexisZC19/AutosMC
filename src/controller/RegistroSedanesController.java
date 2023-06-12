/** **********
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 28/05/2023
 * fecha modificación:
 * Descripción: se creo la clase RegistroController
 *
 */
package controller;

import entity.Sedanes;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.RegistroSedanesServiceImpl;
import service.IRegistroSedanesService;

/**
 *
 * @author labtecweb07
 */
public class RegistroSedanesController {

    IRegistroSedanesService service = new RegistroSedanesServiceImpl();

    public void RegistrarSedanes(List<Sedanes> listaSedanes, Sedanes coche) {
        service.crearRegistro(listaSedanes, coche);
    }

    public void Mostrar(List<Sedanes> listaSedanes, DefaultTableModel auto) {

        service.mostrarRegistros(listaSedanes, auto);

    }

    public void eliminarRegistro(List<Sedanes> listaSedanes, String matricula) {

        service.eliminarRegistro(listaSedanes, matricula);
    }

}
