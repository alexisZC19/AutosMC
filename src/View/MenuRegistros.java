
package View;


public class MenuRegistros extends javax.swing.JFrame {

    public MenuRegistros() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSedanes = new javax.swing.JButton();
        jButtonDeportivo = new javax.swing.JButton();
        jButtonCamioneta = new javax.swing.JButton();
        jButtonEmpleado = new javax.swing.JButton();
        jButtonCliente = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("EMPRESA  DE AUTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 310, 40));

        jButtonSedanes.setBackground(new java.awt.Color(204, 255, 255));
        jButtonSedanes.setText("Sedanes");
        jButtonSedanes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSedanesMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonSedanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, 40));

        jButtonDeportivo.setBackground(new java.awt.Color(204, 255, 255));
        jButtonDeportivo.setText("Deportivo");
        jPanel1.add(jButtonDeportivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 240, 40));

        jButtonCamioneta.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCamioneta.setText("Camioneta");
        jPanel1.add(jButtonCamioneta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 220, 40));

        jButtonEmpleado.setBackground(new java.awt.Color(204, 255, 255));
        jButtonEmpleado.setText("Empleado");
        jPanel1.add(jButtonEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 40));

        jButtonCliente.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCliente.setText("Cliente");
        jPanel1.add(jButtonCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 250, 40));

        jButtonSalir.setBackground(new java.awt.Color(204, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseClicked(evt);
            }
        });
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 100, 60));

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
        
    }//GEN-LAST:event_jButtonSedanesMouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
