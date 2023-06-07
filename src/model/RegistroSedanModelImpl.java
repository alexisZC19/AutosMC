/** **********
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripción: se creo la clase RegistroModelsImpl
 */
package model;

import entity.Sedanes;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class RegistroSedanModelImpl implements IRegistroSedanModel {

    @Override
    public void crearRegistro(List<Sedanes> listaSedanes, Sedanes coche) {

        listaSedanes.add(coche);
    }

    @Override
    public void mostrarRegistros(List<Sedanes> listaSedanes, DefaultTableModel auto) {
        auto.setRowCount(0);
        for (Sedanes coche : listaSedanes) {
            Object[] fila = new Object[6];
            fila[0] = coche.getMarca();
            fila[1] = coche.getModelo();
            fila[2] = coche.getTipo();
            fila[3] = coche.getMatricula();
            fila[4] = coche.getVelocidad();
            fila[5] = String.valueOf(coche.isLujo());
            auto.addRow(fila);

        }
    }

    @Override
    public void eliminarRegistro(List<Sedanes> listaSedanes, String matricula) {
        for (Sedanes coche : listaSedanes) {
            if (coche.getMatricula().compareTo(matricula) == 0) {
                listaSedanes.remove(coche);
                break;
            }
        }

        /*for (Sedanes coche : listaSedanes) {
             String mat = null;
                if (coche.getMatricula().compareTo(mat) != 0) {
                } else {
                    listaSedanes.remove(coche);

                    break;
             }
            }*/
    }
}
