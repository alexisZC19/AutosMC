/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripción: se creo la clase RegistroServiceImpl
 */
package service;

import entity.Deportivo;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.IRegistroDeportivoModel;
import model.RegistroDeportivoModelImpl;


public class RegistroDeportivoServiceImpl  implements IRegistroDeportivoService{
    IRegistroDeportivoModel modelo = new RegistroDeportivoModelImpl();

    @Override
    public void crearRegistro(List<Deportivo> listaDeportivo, Deportivo coche) {
        modelo.crearRegistro(listaDeportivo, coche);
    }

    @Override
    public void mostrarRegistros(List<Deportivo> listaDeportivo, DefaultTableModel auto) {
        modelo.mostrarRegistros(listaDeportivo, auto);
    }

    @Override
    public void eliminarRegistro(List<Deportivo> listaDeportivo, String matricula) {
        modelo.eliminarRegistro(listaDeportivo, matricula);
    }

   


    
}
