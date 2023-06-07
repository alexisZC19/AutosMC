/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripción: se creo la clase RegistroModelsImpl
 */
package model;

import entity.Deportivo;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class RegistroDeportivoModelImpl implements IRegistroDeportivoModel{

    @Override
    public void crearRegistro(List<Deportivo> listaDeportivo, Deportivo coche) {
       
       listaDeportivo.add(coche);
    }

    @Override
    public void mostrarRegistros(List<Deportivo> listaDeportivo, DefaultTableModel auto) {
         auto.setRowCount(0);
        for (Deportivo coche : listaDeportivo) {
            Object[] fila = new Object[7];
            fila[0] = coche.getMarca();
            fila[1] = coche.getModelo();
            fila[2] = coche.getTipo();
            fila[3] = coche.getMatricula();
            fila[4] = coche.getVelocidad();
            fila[5] = String.valueOf(coche.isTwinturbo());
            fila[6] = String.valueOf(coche.isSupercharger());
             
            auto.addRow(fila);
        }
    }

    @Override
    public void eliminarRegistro(List<Deportivo> listaDeportivo, String matricula) {
         for (Deportivo coche : listaDeportivo) {
             String mat = null;
                if (coche.getMatricula().compareTo(mat) != 0) {
                } else {
                    listaDeportivo.remove(coche);

                    break;
             }
            }
    }
    }


    

