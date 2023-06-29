/** **********
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creacion: 19/05/2023
 * fecha modificacion:11/06/23
 * Descripcion: Se creo la clase jFrame
 *              para registrar Sedanes
 *
 */
package View;

import controller.RegistroSedanesController;
import entity.Sedanes;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaEmpleado extends javax.swing.JFrame {
    
    private final RegistroSedanesController controller;

    /**
     * Se creo la lista de Sedanes
     */
    private final List<Sedanes> listaSedanes = new ArrayList<>();
    private final DefaultTableModel auto;

   
    public VistaEmpleado() {
        initComponents();
        auto = (DefaultTableModel) jTableRegistros.getModel();
       controller= new RegistroSedanesController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelMarca = new javax.swing.JLabel();
        jComboBoxMarca = new javax.swing.JComboBox<>();
        jLabelModelo = new javax.swing.JLabel();
        jComboBoxModelo = new javax.swing.JComboBox<>();
        jLabelMatricula = new javax.swing.JLabel();
        jLabelDistancia = new javax.swing.JLabel();
        jLabelTiempo = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jTextFieldDistancia = new javax.swing.JTextField();
        jTextTiempo = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistros = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxtipo = new javax.swing.JComboBox<>();
        jButtonRegresar = new javax.swing.JButton();
        jRadioButtonLujo = new javax.swing.JRadioButton();
        jLabelTipo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMarca.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelMarca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMarca.setText("Marca: ");
        jPanel1.add(jLabelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 28, -1, -1));

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nissan", "Buggati", "Mitsubishi", "Mazda", "Toyota ", "Volkswagen", " ", " " }));
        jComboBoxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 25, -1, -1));

        jLabelModelo.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelModelo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModelo.setText("Modelo: ");
        jPanel1.add(jLabelModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 28, -1, -1));

        jComboBoxModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2017", "2018", "2019", " " }));
        jPanel1.add(jComboBoxModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 25, -1, -1));

        jLabelMatricula.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelMatricula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMatricula.setText("Matricula: ");
        jPanel1.add(jLabelMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 108, -1, -1));

        jLabelDistancia.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelDistancia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDistancia.setText("Distancia");
        jPanel1.add(jLabelDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 108, -1, -1));

        jLabelTiempo.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelTiempo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTiempo.setText("Tiempo:");
        jPanel1.add(jLabelTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        jPanel1.add(jTextFieldMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 105, 132, -1));
        jPanel1.add(jTextFieldDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 105, 135, -1));
        jPanel1.add(jTextTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 130, -1));

        jButtonRegistrar.setBackground(new java.awt.Color(255, 204, 0));
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, -1));

        jButtonEditar.setBackground(new java.awt.Color(255, 204, 0));
        jButtonEditar.setText("Editar");
        jButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 140, -1));

        jButtonEliminar.setBackground(new java.awt.Color(255, 204, 0));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 130, -1));

        jTableRegistros.setBackground(new java.awt.Color(255, 204, 153));
        jTableRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Tipo", "Matricula", "Velocidad", "Distancia", "Tiempo", "Lujo"
            }
        ));
        jTableRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRegistros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 518, 219));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lujo_:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jComboBoxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "Deportivo", "Jdm", "Autobus", " " }));
        jPanel1.add(jComboBoxtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 25, -1, -1));

        jButtonRegresar.setBackground(new java.awt.Color(255, 204, 0));
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, -1));

        jRadioButtonLujo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jRadioButtonLujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jLabelTipo.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipo.setText("Tipo:");
        jPanel1.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 28, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo2.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaActionPerformed

    }//GEN-LAST:event_jComboBoxMarcaActionPerformed
/**
 * Registra a los coches sedanes en la tabla
 * @param evt 
 */
    private void jButtonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseClicked
        Sedanes coche = new Sedanes();
        coche.setMarca(this.jComboBoxMarca.getSelectedItem().toString());
        coche.setModelo(this.jComboBoxModelo.getSelectedItem().toString());
        coche.setTipo(this.jComboBoxtipo.getSelectedItem().toString());
        coche.setMatricula(this.jTextFieldMatricula.getText());
        coche.setTiempo(Double.parseDouble(this.jTextTiempo.getText()));               
        coche.setDistancia(Double.parseDouble(this.jTextFieldDistancia.getText()));
        
        coche.setVelocidad(coche.getDistancia());
        
        
        
        
        
        
        coche.setLujo(this.jRadioButtonLujo.isSelected());
        controller.RegistrarSedanes(listaSedanes, coche);
        controller.Mostrar(listaSedanes, auto);
    }//GEN-LAST:event_jButtonRegistrarMouseClicked

    
    /**
     * es el botton de salir
     * @param evt 
     */
    private void jButtonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButtonRegresarMouseClicked

    /**
     * elimina los datos de la tabla y pregunta al usuario si desea eliminarlo medianre jOption
     * @param evt 
     */
    private void jButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar el coche seleccionado? Una vez eliminado no se podra recuperar", "Confirmar eliminación de coche", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String mat = jTableRegistros.getValueAt(jTableRegistros.getSelectedRow(), 3).toString();
            
            this.controller.eliminarRegistro(listaSedanes, mat);
            this.controller.Mostrar(listaSedanes, auto);
     
        }

    }//GEN-LAST:event_jButtonEliminarMouseClicked

 /**
  *  edita los elementos de la tabla
  * @param evt 
  */   
    private void jButtonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseClicked

        Sedanes coche = new Sedanes();
        coche.setMarca(this.jComboBoxMarca.getSelectedItem().toString());
        coche.setModelo(this.jComboBoxModelo.getSelectedItem().toString());
        coche.setTipo(this.jComboBoxtipo.getSelectedItem().toString());
        coche.setMatricula(this.jTextFieldMatricula.getText());
        coche.setVelocidad(Double.parseDouble(this.jTextFieldDistancia.getText()));
        coche.setLujo(this.jRadioButtonLujo.isSelected());
   
        int selectedRow = jTableRegistros.getSelectedRow();
        if (selectedRow != -1) {
            String codigo = jTableRegistros.getValueAt(selectedRow, 3).toString();
            for (int i=0; i < listaSedanes.size(); i++) {
                Sedanes cocheActual = listaSedanes.get(i);
                if (cocheActual.getMatricula().equals(codigo)) {
                    listaSedanes.set(i, coche);
                    controller.Mostrar(listaSedanes, auto);
                    break;
                }
            }


    }//GEN-LAST:event_jButtonEditarMouseClicked
    }
    
    /**
     * se crea para poder seleccionar una fila de la tabla
     * @param evt 
     */
    private void jTableRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRegistrosMouseClicked
        this.jComboBoxMarca.setSelectedItem(jTableRegistros.getValueAt(jTableRegistros.getSelectedRow(), 0).toString());
        this.jComboBoxModelo.setSelectedItem(jTableRegistros.getValueAt(jTableRegistros.getSelectedRow(), 1).toString());
        this.jComboBoxtipo.setSelectedItem(jTableRegistros.getValueAt(jTableRegistros.getSelectedRow(), 2).toString());
        String datoRadio = jTableRegistros.getValueAt(jTableRegistros.getSelectedRow(), 5).toString();
        boolean siRadio = Boolean.parseBoolean(datoRadio);
        this.jRadioButtonLujo.setSelected(siRadio);
        this.jTextFieldMatricula.setText(jTableRegistros.getValueAt(jTableRegistros.getSelectedRow(), 3).toString());
        this.jTextFieldDistancia.setText(jTableRegistros.getValueAt(jTableRegistros.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_jTableRegistrosMouseClicked

   

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   
        java.awt.EventQueue.invokeLater(() -> {
            new VistaEmpleado().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JComboBox<String> jComboBoxModelo;
    private javax.swing.JComboBox<String> jComboBoxtipo;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDistancia;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelTiempo;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonLujo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegistros;
    private javax.swing.JTextField jTextFieldDistancia;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextTiempo;
    // End of variables declaration//GEN-END:variables
}
