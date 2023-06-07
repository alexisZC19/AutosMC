/** **********
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 27/05/2023
 * fecha modificación:
 * Descripción: se creo la interface IRegistroService
 *
 */
package service;

import entity.Sedanes;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface IRegistroSedanService {

    public void crearRegistro(List<Sedanes> listaSedanes, Sedanes coche);

    public void mostrarRegistros(List<Sedanes> listaSedanes, DefaultTableModel auto);

    public void eliminarRegistro(List<Sedanes> listaSedanes, String matricula);

}
