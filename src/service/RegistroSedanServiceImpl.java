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
import model.RegistroSedanModelImpl;
import model.IRegistroSedanModel;


public class RegistroSedanServiceImpl  implements IRegistroSedanService{
    IRegistroSedanModel modelo = new RegistroSedanModelImpl();

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
