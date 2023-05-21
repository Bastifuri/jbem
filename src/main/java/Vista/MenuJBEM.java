package Vista;

public class MenuJBEM extends javax.swing.JFrame {

    public MenuJBEM() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        lupa = new javax.swing.JButton();
        comboJuego = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 840));

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Basti\\OneDrive\\Documentos\\NetBeansProjects\\JBEM\\src\\main\\java\\Imagenes\\JBEM.png")); // NOI18N
        Logo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 150, 150));

        Titulo.setFont(new java.awt.Font("hooge 05_53", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(204, 204, 255));
        Titulo.setText("JBEM Precios y hardware de calidad");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 640, 40));

        lupa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Basti\\OneDrive\\Documentos\\NetBeansProjects\\JBEM\\src\\main\\java\\Imagenes\\pngwing.com.png")); // NOI18N
        lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaActionPerformed(evt);
            }
        });
        jPanel1.add(lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 30, -1));

        comboJuego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 500, -1));

        jButton1.setText("Telefonos");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, 100, 30));

        jButton2.setText("Consolas");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 100, 30));

        jButton3.setText("Juegos");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 100, 30));

        jButton4.setText("Sillas");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 100, 30));

        jButton5.setText("Hardware");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 100, 30));

        jButton6.setText("jButton6");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 170, 330));

        jButton7.setText("jButton6");
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 170, 330));

        jButton8.setText("jButton6");
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, 170, 330));

        jButton9.setText("jButton6");
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 170, 330));

        jButton10.setText("jButton6");
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 170, 330));

        Fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Basti\\OneDrive\\Documentos\\NetBeansProjects\\JBEM\\src\\main\\java\\Imagenes\\fondo.png")); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(930, 840));
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));

        jMenu1.setText("Inicio");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Productos");
        jMenuBar1.add(jMenu2);

        jMenu5.setText("Juego");
        jMenuBar1.add(jMenu5);

        jMenu3.setText("Ofertas");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Contacto");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaActionPerformed

    }//GEN-LAST:event_lupaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuJBEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJBEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJBEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJBEM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJBEM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JComboBox<String> comboJuego;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton lupa;
    // End of variables declaration//GEN-END:variables
}
