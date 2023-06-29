
package View;


public class MenuRegistros extends javax.swing.JFrame {

    public MenuRegistros() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonSedanes = new javax.swing.JButton();
        jButtonDeportivo = new javax.swing.JButton();
        jButtonCamioneta = new javax.swing.JButton();
        jButtonEmpleado = new javax.swing.JButton();
        jButtonCliente = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSedanes.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSedanes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BotoneSedanes.png"))); // NOI18N
        jButtonSedanes.setBorderPainted(false);
        jButtonSedanes.setContentAreaFilled(false);
        jButtonSedanes.setMaximumSize(new java.awt.Dimension(144, 40));
        jButtonSedanes.setMinimumSize(new java.awt.Dimension(144, 40));
        jButtonSedanes.setPreferredSize(new java.awt.Dimension(144, 40));
        jButtonSedanes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSedanesMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonSedanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, 53));

        jButtonDeportivo.setBackground(new java.awt.Color(204, 255, 255));
        jButtonDeportivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BotonesDeportivos.png"))); // NOI18N
        jButtonDeportivo.setBorderPainted(false);
        jButtonDeportivo.setContentAreaFilled(false);
        jButtonDeportivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDeportivoMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonDeportivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 210, 53));

        jButtonCamioneta.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCamioneta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BotonesCamionetas.png"))); // NOI18N
        jButtonCamioneta.setBorderPainted(false);
        jButtonCamioneta.setContentAreaFilled(false);
        jButtonCamioneta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCamionetaMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 190, 53));

        jButtonEmpleado.setBackground(new java.awt.Color(204, 255, 255));
        jButtonEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BotonesEmpleados.png"))); // NOI18N
        jButtonEmpleado.setBorderPainted(false);
        jButtonEmpleado.setContentAreaFilled(false);
        jButtonEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEmpleadoMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 190, 53));

        jButtonCliente.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BotonClientes.png"))); // NOI18N
        jButtonCliente.setBorderPainted(false);
        jButtonCliente.setContentAreaFilled(false);
        jButtonCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClienteMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 190, 53));

        jButtonSalir.setBackground(new java.awt.Color(204, 255, 255));
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BotonSalida(1).png"))); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setBorderPainted(false);
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseClicked(evt);
            }
        });
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 130, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoMenus.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked
      System.exit(0);
    }//GEN-LAST:event_jButtonSalirMouseClicked

    private void jButtonSedanesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSedanesMouseClicked
    new VistaVehiculoSedan().setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jButtonSedanesMouseClicked

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonDeportivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDeportivoMouseClicked
      new VistaVehiculoDeportivo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonDeportivoMouseClicked

    private void jButtonCamionetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCamionetaMouseClicked
      new VistaVehiculoCamioneta().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCamionetaMouseClicked

    private void jButtonEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEmpleadoMouseClicked
       new VistaPersonaCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonEmpleadoMouseClicked

    private void jButtonClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClienteMouseClicked
        new VistaEmpleado().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonClienteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuRegistros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCamioneta;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonDeportivo;
    private javax.swing.JButton jButtonEmpleado;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSedanes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
