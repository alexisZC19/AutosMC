/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripción: se creo la interface IRegistroModel
 */
package model;

import entity.Deportivo;
import java.util.List;
import javax.swing.table.DefaultTableModel;



public interface IRegistroDeportivoModel {
    public void crearRegistro(List<Deportivo> listaDeportivo, Deportivo coche);

    public void mostrarRegistros(List<Deportivo> listaSedanes, DefaultTableModel auto);

    public void eliminarRegistro(List<Deportivo> listaSedanes, String matricula);
    
}
