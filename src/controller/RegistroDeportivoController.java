/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 28/05/2023
 * fecha modificación:
 * Descripción: se creo la clase RegistroController
 * 
 */
package controller;

import entity.Deportivo;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import service.IRegistroDeportivoService;

import service.RegistroDeportivoServiceImpl;

public class RegistroDeportivoController {
   IRegistroDeportivoService service = new RegistroDeportivoServiceImpl();

public void RegistrarDeportivos(List<Deportivo> listaDeportivo, Deportivo coche){
    service.crearRegistro(listaDeportivo, coche);
}
   
public void Mostrar(List<Deportivo> listaDeportivo, DefaultTableModel auto){
    
    service.mostrarRegistros(listaDeportivo, auto);
    
}

public void Eliminar(List<Deportivo> listaDeportivo, String matricula){

service.eliminarRegistro(listaDeportivo, matricula);
}

}
