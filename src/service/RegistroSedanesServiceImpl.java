/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripción: se creo la clase RegistroServiceImpl
 */
package service;

import entity.Sedanes;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.RegistroSedanesModelImpl;
import model.IRegistroSedanesModel;


public class RegistroSedanesServiceImpl  implements IRegistroSedanesService{
    IRegistroSedanesModel modelo = new RegistroSedanesModelImpl();

    @Override
    public void crearRegistro(List<Sedanes> listaSedanes, Sedanes coche) {
        modelo.crearRegistro(listaSedanes, coche);
    }

    @Override
    public void mostrarRegistros(List<Sedanes> listaSedanes, DefaultTableModel auto) {
        modelo.mostrarRegistros(listaSedanes, auto);
    }

    @Override
    public void eliminarRegistro(List<Sedanes> listaSedanes, String matricula) {
        modelo.eliminarRegistro(listaSedanes, matricula);
    }


    
}
