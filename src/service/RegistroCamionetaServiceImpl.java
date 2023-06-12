/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 23/05/2023
 * fecha modificación:
 * Descripción: se creo la clase RegistroServiceImpl
 */
package service;

import entity.Camioneta;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.IRegistroCamionetaModel;
import model.RegistroCamionetaModelImpl;


public class RegistroCamionetaServiceImpl  implements IRegistroCamionetaService{
    IRegistroCamionetaModel modelo = new RegistroCamionetaModelImpl();

    @Override
    public void crearRegistro(List<Camioneta> listaCamioneta, Camioneta coche) {
        modelo.crearRegistro(listaCamioneta, coche);
    }

    @Override
    public void mostrarRegistros(List<Camioneta> listaCamioneta, DefaultTableModel auto) {
        modelo.mostrarRegistros(listaCamioneta, auto);
    }

    @Override
    public void eliminarRegistro(List<Camioneta> listaCamioneta, String matricula) {
        modelo.eliminarRegistro(listaCamioneta, matricula);
    }


    
}
