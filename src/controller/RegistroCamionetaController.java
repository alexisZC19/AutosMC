/** **********
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 28/05/2023
 * fecha modificación:
 * Descripción: se creo la clase RegistroController
 *
 */
package controller;

import entity.Camioneta;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.RegistroCamionetaServiceImpl;
import service.IRegistroCamionetaService;

/**
 *
 * @author labtecweb07
 */
public class RegistroCamionetaController {

    IRegistroCamionetaService service = new RegistroCamionetaServiceImpl();

    public void RegistrarCamioneta(List<Camioneta> listaCamioneta, Camioneta coche) {
        service.crearRegistro(listaCamioneta, coche);
    }

    public void Mostrar(List<Camioneta> listaCamioneta, DefaultTableModel auto) {

        service.mostrarRegistros(listaCamioneta, auto);

    }

    public void eliminarRegistro(List<Camioneta> listaCamioneta, String matricula) {

        service.eliminarRegistro(listaCamioneta, matricula);
    }

}
