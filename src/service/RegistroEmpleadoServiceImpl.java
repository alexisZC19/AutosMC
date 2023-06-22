/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Empleado;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.IRegistroEmpleadoModel;
import model.RegistroEmpleadoModelImpl;



    /************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creación: 15/05/2023
 * fecha modificación:
 * Descripción: se creo la clase RegistroServiceImpl
 */


public class RegistroEmpleadoServiceImpl  implements IRegistroEmpleadoService{
    IRegistroEmpleadoModel modelo = new RegistroEmpleadoModelImpl();

    @Override
    public void crearRegistro(List<Empleado> listaEmpleado, Empleado persona) {
       modelo.crearRegistro(listaEmpleado, persona);
    }

    @Override
    public void mostrarRegistros(List<Empleado> listaEmpleado, DefaultTableModel trabajador) {
        modelo.mostrarRegistros(listaEmpleado, trabajador);
    }

    @Override
    public void eliminarRegistro(List<Empleado> listaEmpleado, String codEmpleado) {
        modelo.eliminarRegistro(listaEmpleado, codEmpleado);
    }

   
}
