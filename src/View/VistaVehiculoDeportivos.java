/************
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creacion: 15/05/2023
 * fecha modificacion:19/05/2023
 * Descripcion: se creo la clase jFrame
 *              para registrar autos
 * 
 */
package View;


import controller.RegistroDeportivoController;
import entity.Deportivo;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VistaVehiculoDeportivos extends javax.swing.JFrame {
    private final List<Deportivo> listaDeportivo= new ArrayList<>();
    
     private final DefaultTableModel auto;
     private final RegistroDeportivoController controller ;

    public VistaVehiculoDeportivos() {
        initComponents();
       auto = (DefaultTableModel) jTableDatos.getModel();
       controller=new RegistroDeportivoController();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelMarca = new javax.swing.JLabel();
        jComboBoxMarca = new javax.swing.JComboBox<String>();
        jLabelModelo = new javax.swing.JLabel();
        jComboBoxModelo = new javax.swing.JComboBox<String>();
        jLabelMatricula = new javax.swing.JLabel();
        jLabelDistancia = new javax.swing.JLabel();
        jTextFieldMatricula = new javax.swing.JTextField();
        jTextFieldDistancia = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<String>();
        jButton5 = new javax.swing.JButton();
        jRadioButtonTwinTurbo = new javax.swing.JRadioButton();
        jRadioButtonSuperCargador = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMarca.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelMarca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMarca.setText("Marca: ");
        jPanel1.add(jLabelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 28, -1, -1));

        jComboBoxMarca.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Nissan", "Buggati", "Mitsubishi", "Mazda", "Toyota ", "Volkswagen", " ", " " }));
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

        jComboBoxModelo.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "2016", "2017", "2018", "2019", " " }));
        jPanel1.add(jComboBoxModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 25, -1, -1));

        jLabelMatricula.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelMatricula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMatricula.setText("Matricula: ");
        jPanel1.add(jLabelMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabelDistancia.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelDistancia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDistancia.setText("Distancia");
        jPanel1.add(jLabelDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 98, -1, 10));
        jPanel1.add(jTextFieldMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 132, -1));
        jPanel1.add(jTextFieldDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 135, -1));

        jButtonRegistrar.setBackground(new java.awt.Color(255, 204, 0));
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setText("Cancelar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setText("Eliminar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jButtonSalir.setBackground(new java.awt.Color(255, 204, 0));
        jButtonSalir.setText("jButton4");
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        jTableDatos.setBackground(new java.awt.Color(255, 204, 153));
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Tipo", "Matricula", "Velocidad", "TwinTurbo", "SuperCharger"
            }
        ));
        jTableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 270, 580, 219));

        jLabelTipo.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipo.setText("Tipo:");
        jPanel1.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 28, -1, -1));

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Sedan", "Deportivo", "Jdm", "Autobus", " " }));
        jPanel1.add(jComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 25, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 204, 0));
        jButton5.setText("Regresar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, -1));

        jRadioButtonTwinTurbo.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jRadioButtonTwinTurbo.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonTwinTurbo.setText("TwinTurbo");
        jRadioButtonTwinTurbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTwinTurboActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonTwinTurbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jRadioButtonSuperCargador.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jRadioButtonSuperCargador.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonSuperCargador.setText("Supercargador");
        jPanel1.add(jRadioButtonSuperCargador, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo2.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 600, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMarcaActionPerformed
       
    }//GEN-LAST:event_jComboBoxMarcaActionPerformed

    private void jButtonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseClicked
        Deportivo coche = new Deportivo();
        coche.setMarca( this.jComboBoxMarca.getSelectedItem().toString());
        coche.setModelo(this.jComboBoxModelo.getSelectedItem().toString());
        coche.setTipo(this.jComboBoxTipo.getSelectedItem().toString());
        coche.setMatricula(this.jTextFieldMatricula.getText());
        coche.setVelocidad(Double.parseDouble(this.jTextFieldDistancia.getText()));
        coche.setTwinturbo(this.jRadioButtonTwinTurbo.isSelected());
        coche.setSupercharger(this.jRadioButtonSuperCargador.isSelected());
        listaDeportivo.add(coche);
        controller.Mostrar(listaDeportivo, auto);
    }//GEN-LAST:event_jButtonRegistrarMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
     System.exit(0);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
      int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar el coche seleccionado? Una vez eliminado no se podra recuperar", "Confirmar eliminación de coche", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String mat = jTableDatos.getValueAt(jTableDatos.getSelectedRow(), 3).toString();
            controller.Eliminar(listaDeportivo, mat);
            controller.Mostrar(listaDeportivo, auto);
        }


   
    }//GEN-LAST:event_jButton3MouseClicked

    private void jRadioButtonTwinTurboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTwinTurboActionPerformed
       
    }//GEN-LAST:event_jRadioButtonTwinTurboActionPerformed

    private void jTableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDatosMouseClicked
              this.jComboBoxMarca.setSelectedItem(jTableDatos.getValueAt(jTableDatos.getSelectedRow(), 0).toString());
        this.jComboBoxModelo.setSelectedItem(jTableDatos.getValueAt(jTableDatos.getSelectedRow(), 1).toString());
        this.jComboBoxTipo.setSelectedItem(jTableDatos.getValueAt(jTableDatos.getSelectedRow(), 2).toString());
        String datoRadio = jTableDatos.getValueAt(jTableDatos.getSelectedRow(), 5).toString();
        boolean siRadio = Boolean.parseBoolean(datoRadio);
        this.jRadioButtonTwinTurbo.setSelected(siRadio);
        String datoRadio2 = jTableDatos.getValueAt(jTableDatos.getSelectedRow(), 6).toString();
        boolean siRadio2 = Boolean.parseBoolean(datoRadio2);
         this.jRadioButtonSuperCargador.setSelected(siRadio);
        
        this.jTextFieldMatricula.setText(jTableDatos.getValueAt(jTableDatos.getSelectedRow(), 3).toString());
        this.jTextFieldDistancia.setText(jTableDatos.getValueAt(jTableDatos.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_jTableDatosMouseClicked

    
    
  
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVehiculoDeportivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(() -> {
            new VistaVehiculoDeportivos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxMarca;
    private javax.swing.JComboBox<String> jComboBoxModelo;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelDistancia;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelMatricula;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonSuperCargador;
    private javax.swing.JRadioButton jRadioButtonTwinTurbo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JTextField jTextFieldDistancia;
    private javax.swing.JTextField jTextFieldMatricula;
    // End of variables declaration//GEN-END:variables
}
