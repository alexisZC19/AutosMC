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
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextTiempo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistros = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jButton5 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Marca: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 28, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Nissan", "Buggati", "Mitsubishi", "Mazda", "Toyota ", "Volkswagen", " ", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modelo: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 28, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "2016", "2017", "2018", "2019", " " }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 25, -1, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Matricula: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 108, -1, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Distancia");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 108, -1, -1));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tiempo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 105, 132, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 105, 135, -1));
        jPanel1.add(jTextTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 130, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setText("Registrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setText("Editar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setText("Eliminar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 204, 0));
        jButton4.setText("jButton4");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

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

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Sedan", "Deportivo", "Jdm", "Autobus", " " }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 25, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 204, 0));
        jButton5.setText("Regresar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, -1));

        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 28, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo2.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed
/**
 * Registra a los coches sedanes en la tabla
 * @param evt 
 */
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Sedanes coche = new Sedanes();
        coche.setMarca(this.jComboBox1.getSelectedItem().toString());
        coche.setModelo(this.jComboBox2.getSelectedItem().toString());
        coche.setTipo(this.jComboBox3.getSelectedItem().toString());
        coche.setMatricula(this.jTextField1.getText());
        coche.setTiempo(Double.parseDouble(this.jTextTiempo.getText()));               
        coche.setDistancia(Double.parseDouble(this.jTextField2.getText()));
        
        coche.setVelocidad(coche.getDistancia());
        
        
        
        
        
        
        coche.setLujo(this.jRadioButton1.isSelected());
        controller.RegistrarSedanes(listaSedanes, coche);
        controller.Mostrar(listaSedanes, auto);
    }//GEN-LAST:event_jButton1MouseClicked

    
    /**
     * es el botton de salir
     * @param evt 
     */
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton5MouseClicked

    /**
     * elimina los datos de la tabla y pregunta al usuario si desea eliminarlo medianre jOption
     * @param evt 
     */
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar el coche seleccionado? Una vez eliminado no se podra recuperar", "Confirmar eliminación de coche", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String mat = jTableRegistros.getValueAt(jTableRegistros.getSelectedRow(), 3).toString();
            
            this.controller.eliminarRegistro(listaSedanes, mat);
            this.controller.Mostrar(listaSedanes, auto);
     
        }

    }//GEN-LAST:event_jButton3MouseClicked

 /**
  *  edita los elementos de la tabla
  * @param evt 
  */   
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        Sedanes coche = new Sedanes();
        coche.setMarca(this.jComboBox1.getSelectedItem().toString());
        coche.setModelo(this.jComboBox2.getSelectedItem().toString());
        coche.setTipo(this.jComboBox3.getSelectedItem().toString());
        coche.setMatricula(this.jTextField1.getText());
        coche.setVelocidad(Double.parseDouble(this.jTextField2.getText()));
        coche.setLujo(this.jRadioButton1.isSelected());
   
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


    }//GEN-LAST:event_jButton2MouseClicked
    }
    
    /**
     * se crea para poder seleccionar una fila de la tabla
     * @param evt 
     */
    private void jTableRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableRegistrosMouseClicked
        this.jComboBox1.setSelectedItem(jTableRegistros.getValueAt(jTableRegistros.getSelectedRow(), 0).toString());
        this.jComboBox2.setSelectedItem(jTableRegistros.getValueAt(jTableRegistros.getSelectedRow(), 1).toString());
        this.jComboBox3.setSelectedItem(jTableRegistros.getValueAt(jTableRegistros.getSelectedRow(), 2).toString());
        String datoRadio = jTableRegistros.getValueAt(jTableRegistros.getSelectedRow(), 5).toString();
        boolean siRadio = Boolean.parseBoolean(datoRadio);
        this.jRadioButton1.setSelected(siRadio);
        this.jTextField1.setText(jTableRegistros.getValueAt(jTableRegistros.getSelectedRow(), 3).toString());
        this.jTextField2.setText(jTableRegistros.getValueAt(jTableRegistros.getSelectedRow(), 4).toString());
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegistros;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextTiempo;
    // End of variables declaration//GEN-END:variables
}
