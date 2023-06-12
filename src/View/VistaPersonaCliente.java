/** **********
 * Autor: Zavaleta Cruz Jonathan Alexis
 * fecha de creacion: 19/05/2023
 * fecha modificacion:11/06/23
 * Descripcion: Se creo la clase jFrame
 *              para registrar Cliente.
 *
 */
package View;

import controller.RegistroClienteController;
import entity.Cliente;
import entity.Persona;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaPersonaCliente extends javax.swing.JFrame {
    
    private final RegistroClienteController controller;

    /**
     * Se creo la lista de Sedanes
     */
    private final List<Cliente> listaCliente = new ArrayList<>();
    private final DefaultTableModel cliente ;

   
    public VistaPersonaCliente() {
        initComponents();
        cliente= (DefaultTableModel) jTableRegistros.getModel();
       controller= new RegistroClienteController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelMarca = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jLabelIDE = new javax.swing.JLabel();
        jLabelDistancia = new javax.swing.JLabel();
        jLabelCodCliente = new javax.swing.JLabel();
        jTextFieldIDE = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCodClienete = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegistros = new javax.swing.JTable();
        jButtonRegresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMarca.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelMarca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMarca.setText("Nombre:");
        jPanel1.add(jLabelMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabelModelo.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelModelo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModelo.setText("Edad:");
        jPanel1.add(jLabelModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabelIDE.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelIDE.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIDE.setText("IDE:");
        jPanel1.add(jLabelIDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jLabelDistancia.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelDistancia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDistancia.setText("Telefono:");
        jPanel1.add(jLabelDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, 20));

        jLabelCodCliente.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabelCodCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodCliente.setText("Cod.Cliente:");
        jPanel1.add(jLabelCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 30));
        jPanel1.add(jTextFieldIDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 90, -1));
        jPanel1.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 135, -1));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));
        jPanel1.add(jTextFieldCodClienete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 100, -1));
        jPanel1.add(jTextFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 80, -1));

        jButtonRegistrar.setBackground(new java.awt.Color(255, 204, 0));
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseClicked(evt);
            }
        });
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jButtonEditar.setBackground(new java.awt.Color(255, 204, 0));
        jButtonEditar.setText("Editar");
        jButtonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEditarMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jButtonEliminar.setBackground(new java.awt.Color(255, 204, 0));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        jTableRegistros.setBackground(new java.awt.Color(255, 204, 153));
        jTableRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Edad", "IDE", "Cod.Cliente", "Telefono"
            }
        ));
        jTableRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableRegistros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 518, 219));

        jButtonRegresar.setBackground(new java.awt.Color(255, 204, 0));
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fondo2.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * Registra a los coches sedanes en la tabla
 * @param evt 
 */
    private void jButtonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseClicked
        Cliente persona = new Cliente();
       
        persona.setIDE(this.jTextFieldIDE.getText());
        
        persona.setEdad((int) Double.parseDouble(this.jTextFieldEdad.getText()));               
        persona.setTelefono(this.jTextFieldTelefono.getText());
        persona.setCodCliente(this.jTextFieldCodClienete.getText());
        persona.setNombre(this.jTextFieldTelefono.getText());
      
        
        
        
        
      
       controller.RegistrarCliente(listaCliente, persona);
       controller.Mostrar(listaCliente, cliente);
    }//GEN-LAST:event_jButtonRegistrarMouseClicked

    
    /**
     * es el botton de salir
     * @param evt 
     */
    private void jButtonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegresarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButtonRegresarMouseClicked

    /**
     * elimina los datos de la tabla y pregunta al usuario si 
     * desea eliminarlo medianre jOption
     * @param evt 
     */
    private void jButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseClicked
        int confirm = JOptionPane.showConfirmDialog(
                this, 
                "¿Estás seguro de que deseas eliminar? ", 
                "Confirmar eliminación de coche", 
                JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String mat = jTableRegistros.getValueAt(
                    jTableRegistros.getSelectedRow(), 3).toString();
            
            this.controller.eliminarRegistro(listaCliente, mat);
            this.controller.Mostrar(listaCliente, cliente);
     
        }

    }//GEN-LAST:event_jButtonEliminarMouseClicked

 /**
  *  edita los elementos de la tabla
  * @param evt 
  */   
    private void jButtonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEditarMouseClicked
        Cliente persona = null;

       
        persona.setIDE(this.jTextFieldIDE.getText());
        persona.setEdad((int) Double.parseDouble(this.jTextFieldEdad.getText()));
        
   
        int selectedRow = jTableRegistros.getSelectedRow();
        if (selectedRow != -1) {
            String codigo = jTableRegistros.getValueAt(selectedRow, 3).toString();
            for (int i=0; i < listaCliente.size(); i++) {
                Cliente personaActual = listaCliente.get(i);
                if (personaActual.getIDE().equals(codigo)) {
                    listaCliente.set(i, persona);
                    controller.Mostrar(listaCliente, cliente);
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
     
        this.jTextFieldNombre.setText(
                jTableRegistros.getValueAt(
                jTableRegistros.getSelectedRow(), 1).toString());
        this.jTextFieldEdad.setText(
                jTableRegistros.getValueAt(
                jTableRegistros.getSelectedRow(), 2).toString());
        this.jTextFieldIDE.setText(
                jTableRegistros.getValueAt(
                jTableRegistros.getSelectedRow(), 3).toString());
        this.jTextFieldCodClienete.setText(
                jTableRegistros.getValueAt(
                jTableRegistros.getSelectedRow(), 4).toString());
        this.jTextFieldTelefono.setText(jTableRegistros.getValueAt(
                jTableRegistros.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_jTableRegistrosMouseClicked

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

   

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException 
                | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(
                    VistaPersonaCliente.class.getName()).log(
                            java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
      

        
        java.awt.EventQueue.invokeLater(() -> {
            new VistaPersonaCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCodCliente;
    private javax.swing.JLabel jLabelDistancia;
    private javax.swing.JLabel jLabelIDE;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRegistros;
    private javax.swing.JTextField jTextFieldCodClienete;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldIDE;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
