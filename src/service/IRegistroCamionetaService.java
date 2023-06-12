/** **********
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 27/05/2023
 * fecha modificación:
 * Descripción: se creo la interface IRegistroService
 *
 */
package service;


import entity.Camioneta;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface IRegistroCamionetaService {

      public void crearRegistro(List<Camioneta> listaCamioneta, Camioneta coche);

    public void mostrarRegistros(List<Camioneta> listaCamioneta, DefaultTableModel auto);

    public void eliminarRegistro(List<Camioneta> Camioneta, String matricula);

}
