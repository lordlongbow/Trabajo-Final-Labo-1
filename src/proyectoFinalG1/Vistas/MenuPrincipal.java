package proyectoFinalG1.Vistas;


import java.awt.event.ComponentListener;
import proyectoFinalG1.Data.Conexion;

/**
 *
 * @author Grupo 1
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private Conexion conexion;
    private ComponentListener jInternalFrame;

   
    public MenuPrincipal() {
        initComponents();
        conexion = new Conexion();
        //jbPropietarios.setIcon(setIcono("src/images/propietarioIcon.png", jbPropietarios));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane()
        ;
        jbInmueblesDisponibles = new javax.swing.JButton();
        jbPropietarios = new javax.swing.JButton();
        jbInquilinos = new javax.swing.JButton();
        jbContratos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jBEmpleado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmPropietarios = new javax.swing.JMenu();
        jmiPropietarioNuevo = new javax.swing.JMenuItem();
        jmiNuevoInmueble = new javax.swing.JMenuItem();
        jmInquilinos = new javax.swing.JMenu();
        jmiNuevoInquilino = new javax.swing.JMenuItem();
        jmiInmueblesDisponibles = new javax.swing.JMenuItem();
        jmContratos = new javax.swing.JMenu();
        jmiBuscarContrato = new javax.swing.JMenuItem();
        jmiNuevoContrato = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMIEmpleado = new javax.swing.JMenuItem();
        jMSalir = new javax.swing.JMenu();
        jMISalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(214, 2147483647));

        jDesktopPane1.setMaximumSize(new java.awt.Dimension(2147483647, 913));

        jbInmueblesDisponibles.setBackground(new java.awt.Color(204, 204, 204));
        jbInmueblesDisponibles.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jbInmueblesDisponibles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoFinalG1/VistasImagenes/buscarAlquilerIconTam.png"))); // NOI18N
        jbInmueblesDisponibles.setText("Inmuebles Disponibles");
        jbInmueblesDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInmueblesDisponiblesActionPerformed(evt);
            }
        });

        jbPropietarios.setBackground(java.awt.Color.lightGray);
        jbPropietarios.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        jbPropietarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoFinalG1/VistasImagenes/propietarioIconTam.png"))); // NOI18N
        jbPropietarios.setText("Propietario nuevo");
        jbPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPropietariosActionPerformed(evt);
            }
        });

        jbInquilinos.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jbInquilinos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoFinalG1/VistasImagenes/inquilinoIconTam.png"))); // NOI18N
        jbInquilinos.setText("Inquilino nuevo");
        jbInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInquilinosActionPerformed(evt);
            }
        });

        jbContratos.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 18)); // NOI18N
        jbContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoFinalG1/VistasImagenes/contratoIconTam.png"))); // NOI18N
        jbContratos.setText("Contrato Nuevo");
        jbContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContratosActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoFinalG1/VistasImagenes/agregarPropiedadTam.png"))); // NOI18N
        jButton1.setText("Inmuebles Nuevos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoFinalG1/VistasImagenes/buscarContratoTam.png"))); // NOI18N
        jButton2.setText("Búsqueda de Contratos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jBEmpleado.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 18)); // NOI18N
        jBEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoFinalG1/VistasImagenes/empleadoTam.png"))); // NOI18N
        jBEmpleado.setText("Gestión Empleado");
        jBEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmpleadoActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoFinalG1/VistasImagenes/fondo.jpg"))); // NOI18N

        jDesktopPane1.setLayer(jbInmueblesDisponibles, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbPropietarios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbInquilinos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbContratos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBEmpleado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbContratos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbPropietarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbInmueblesDisponibles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbInquilinos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jbInquilinos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jbInmueblesDisponibles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPropietarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbContratos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEmpleado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmPropietarios.setText("Propietarios");

        jmiPropietarioNuevo.setText("Propietario Nuevo");
        jmiPropietarioNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPropietarioNuevoActionPerformed(evt);
            }
        });
        jmPropietarios.add(jmiPropietarioNuevo);

        jmiNuevoInmueble.setText("Nuevo inmueble");
        jmiNuevoInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevoInmuebleActionPerformed(evt);
            }
        });
        jmPropietarios.add(jmiNuevoInmueble);

        jMenuBar1.add(jmPropietarios);

        jmInquilinos.setText("Inquilinos");

        jmiNuevoInquilino.setText("Nuevo Inquilino");
        jmiNuevoInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevoInquilinoActionPerformed(evt);
            }
        });
        jmInquilinos.add(jmiNuevoInquilino);

        jmiInmueblesDisponibles.setText("Inmuebles Disponibles");
        jmiInmueblesDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInmueblesDisponiblesActionPerformed(evt);
            }
        });
        jmInquilinos.add(jmiInmueblesDisponibles);

        jMenuBar1.add(jmInquilinos);

        jmContratos.setText("Contratos");

        jmiBuscarContrato.setText("Busqueda de Contratos");
        jmiBuscarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarContratoActionPerformed(evt);
            }
        });
        jmContratos.add(jmiBuscarContrato);

        jmiNuevoContrato.setText("Nuevo contrato");
        jmiNuevoContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevoContratoActionPerformed(evt);
            }
        });
        jmContratos.add(jmiNuevoContrato);

        jMenuBar1.add(jmContratos);

        jMenu1.setText("Empleado");

        jMIEmpleado.setText("Getion Empleado");
        jMIEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEmpleadoActionPerformed(evt);
            }
        });
        jMenu1.add(jMIEmpleado);

        jMenuBar1.add(jMenu1);

        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });

        jMISalir.setText("Salir");
        jMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISalirActionPerformed(evt);
            }
        });
        jMSalir.add(jMISalir);

        jMenuBar1.add(jMSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiPropietarioNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPropietarioNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiPropietarioNuevoActionPerformed

    private void jmiNuevoInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevoInquilinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiNuevoInquilinoActionPerformed

    private void jmiBuscarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarContratoActionPerformed
        jDesktopPane1.removeComponentListener(jInternalFrame);
        //jDesktopPane1.removeAll();
        BusquedaContrato bc = new BusquedaContrato(conexion);
        bc.setVisible(true);
        jDesktopPane1.add(bc);
        jDesktopPane1.moveToFront(bc);
        jDesktopPane1.repaint();
    }//GEN-LAST:event_jmiBuscarContratoActionPerformed

    private void jmiNuevoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevoContratoActionPerformed
        jDesktopPane1.removeComponentListener(jInternalFrame);
        //jDesktopPane1.removeAll();
        NuevoContrato nc = new NuevoContrato(conexion);
        nc.setVisible(true);
        jDesktopPane1.add(nc);
        jDesktopPane1.moveToFront(nc);
        jDesktopPane1.repaint();
    }//GEN-LAST:event_jmiNuevoContratoActionPerformed

    private void jmiInmueblesDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInmueblesDisponiblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiInmueblesDisponiblesActionPerformed

    private void jmiNuevoInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevoInmuebleActionPerformed
        jDesktopPane1.removeComponentListener(jInternalFrame);
        //jDesktopPane1.removeAll();
        NuevoInmueble ni = new NuevoInmueble(conexion);
        ni.setVisible(true);
        jDesktopPane1.add(ni);
        jDesktopPane1.moveToFront(ni);
        jDesktopPane1.repaint();           // TODO add your handling code here:
    }//GEN-LAST:event_jmiNuevoInmuebleActionPerformed

    private void jMIEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEmpleadoActionPerformed
        jDesktopPane1.removeComponentListener(jInternalFrame);
        //jDesktopPane1.removeAll();
        NuevoEmpleado ne = new NuevoEmpleado(conexion);
        ne.setVisible(true);
        jDesktopPane1.add(ne);
        jDesktopPane1.moveToFront(ne);
        jDesktopPane1.repaint();
    }//GEN-LAST:event_jMIEmpleadoActionPerformed

    private void jBEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmpleadoActionPerformed
        jDesktopPane1.removeComponentListener(jInternalFrame);
        //jDesktopPane1.removeAll();
        NuevoEmpleado ne = new NuevoEmpleado(conexion);
        ne.setVisible(true);
        jDesktopPane1.add(ne);
        jDesktopPane1.moveToFront(ne);
        jDesktopPane1.repaint();
    }//GEN-LAST:event_jBEmpleadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeComponentListener(jInternalFrame);
        //jDesktopPane1.removeAll();
        BusquedaContrato bc = new BusquedaContrato(conexion);
        bc.setVisible(true);
        jDesktopPane1.add(bc);
        jDesktopPane1.moveToFront(bc);
        jDesktopPane1.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDesktopPane1.removeComponentListener(jInternalFrame);
        //jDesktopPane1.removeAll();
        NuevoInmueble ni = new NuevoInmueble(conexion);
        ni.setVisible(true);
        jDesktopPane1.add(ni);
        jDesktopPane1.moveToFront(ni);
        jDesktopPane1.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContratosActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeComponentListener(jInternalFrame);
        NuevoContrato nc = new NuevoContrato(conexion);
        nc.setVisible(true);
        jDesktopPane1.add(nc);
        jDesktopPane1.moveToFront(nc);
        jDesktopPane1.repaint();
    }//GEN-LAST:event_jbContratosActionPerformed

    private void jbPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPropietariosActionPerformed
        NuevoPropietario np = new NuevoPropietario(conexion);
        np.setVisible(true);
        jDesktopPane1.add(np);
        jDesktopPane1.moveToFront(np);
        jDesktopPane1.repaint();
    }//GEN-LAST:event_jbPropietariosActionPerformed

    private void jbInmueblesDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInmueblesDisponiblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbInmueblesDisponiblesActionPerformed

    private void jbInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInquilinosActionPerformed
        // TODO add your handling code here:
        NuevoInquilino ni = new NuevoInquilino(conexion);
        ni.setVisible(true);
        jDesktopPane1.add(ni);
        jDesktopPane1.moveToFront(ni);
        jDesktopPane1.repaint();
    }//GEN-LAST:event_jbInquilinosActionPerformed

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
      
    }//GEN-LAST:event_jMSalirActionPerformed

    private void jMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISalirActionPerformed
        dispose();
    }//GEN-LAST:event_jMISalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuPrincipal().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEmpleado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMIEmpleado;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenu jMSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton jbContratos;
    private javax.swing.JButton jbInmueblesDisponibles;
    private javax.swing.JButton jbInquilinos;
    private javax.swing.JButton jbPropietarios;
    private javax.swing.JMenu jmContratos;
    private javax.swing.JMenu jmInquilinos;
    private javax.swing.JMenu jmPropietarios;
    private javax.swing.JMenuItem jmiBuscarContrato;
    private javax.swing.JMenuItem jmiInmueblesDisponibles;
    private javax.swing.JMenuItem jmiNuevoContrato;
    private javax.swing.JMenuItem jmiNuevoInmueble;
    private javax.swing.JMenuItem jmiNuevoInquilino;
    private javax.swing.JMenuItem jmiPropietarioNuevo;
    // End of variables declaration//GEN-END:variables
}
