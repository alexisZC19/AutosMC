/** **********
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripción: se creo la clase RegistroModelsImpl
 */
package model;

import entity.Camioneta;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class RegistroCamionetaModelImpl implements IRegistroCamionetaModel {

    @Override
    public void crearRegistro(List<Camioneta> listaCamioneta, Camioneta coche) {
        //coche.setVelocidad(coche.getVelocidad());
        listaCamioneta.add(coche);
    }

    @Override
    public void mostrarRegistros(List<Camioneta> listaCamioneta, DefaultTableModel auto) {
        auto.setRowCount(0);
       
        for (Camioneta coche : listaCamioneta) {
            Object[] fila = new Object[8];
            fila[0] = coche.getMarca();
            fila[1] = coche.getModelo();
            fila[2] = coche.getTipo();
            fila[3] = coche.getMatricula();
            fila[4] = coche.getVelocidad();
            fila[5] = coche.getDistancia();
            fila[6] = coche.getTiempo();
            fila[7] = String.valueOf(coche.isBaul());
            auto.addRow(fila);

        }
    }

    @Override
    public void eliminarRegistro(List<Camioneta> listaCamioneta, String matricula) {
        for (Camioneta coche : listaCamioneta) {
            if (coche.getMatricula().compareTo(matricula) == 0) {
                listaCamioneta.remove(coche);
                break;
            }
        }

       
    }
}
