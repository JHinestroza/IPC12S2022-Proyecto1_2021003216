
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Hinestroza
 */
public class PagosServicios extends javax.swing.JFrame {
    Hisotorial ListaHistoria = new Hisotorial();
    MenuAdmin Administrador = new MenuAdmin();
    CrearCuentas Cuentas = new CrearCuentas();
    static RegistroClientes registro = new RegistroClientes();
    static Hisotorial historia = new Hisotorial();

    /**
     * Creates new form PagosServicios
     */
    public PagosServicios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuarios = new javax.swing.JComboBox<>();
        Pagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        VerDatos = new javax.swing.JButton();
        ListaCuentas = new javax.swing.JComboBox<>();
        VerCuentas = new javax.swing.JButton();
        Servicios = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Usuarios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });

        Pagar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Pagar.setText("Pagar");
        Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Usuario");

        VerDatos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        VerDatos.setText("Ver Datos");
        VerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerDatosActionPerformed(evt);
            }
        });

        ListaCuentas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ListaCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaCuentasActionPerformed(evt);
            }
        });

        VerCuentas.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        VerCuentas.setText("Ver Cuentas");
        VerCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCuentasActionPerformed(evt);
            }
        });

        Servicios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Servicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Servicio Luz", "Servicio Agua", "Servicio Telefonico" }));
        Servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiciosActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ListaCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(VerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Servicios, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VerCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerDatos)
                .addGap(24, 24, 24)
                .addComponent(ListaCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(VerCuentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Servicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pagar)
                    .addComponent(jButton4))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariosActionPerformed

    private void PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarActionPerformed
        // TODO add your handling code here:
        int NumeroIdentificador = Usuarios.getSelectedIndex();
        int NumeroCuenta = ListaCuentas.getSelectedIndex();
        if (NumeroCuenta != -1 && NumeroIdentificador != -1 && Cuentas.NuevasCuentas[NumeroIdentificador][NumeroCuenta] != null) {
            int pagoServicio = Integer.parseInt(JOptionPane.showInputDialog("Cuanto desea pagar"));
            if (pagoServicio <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Monto de pago invalido");
            } else {
                if (Cuentas.NuevasCuentas[NumeroIdentificador][NumeroCuenta].getSaldo() - pagoServicio < 0) {
                    JOptionPane.showMessageDialog(rootPane, "No se pudo validar pago, saldo insuficiente "
                            + Cuentas.NuevasCuentas[NumeroIdentificador][NumeroCuenta].getSaldo());
                    this.setVisible(false);
                    Administrador.setVisible(true);
                } else {
                   
                    Cuentas.NuevasCuentas[NumeroIdentificador][NumeroCuenta].setSaldo(
                            Cuentas.NuevasCuentas[NumeroIdentificador][NumeroCuenta].getSaldo() - pagoServicio);
                    
                    System.out.println(Cuentas.NuevasCuentas[NumeroIdentificador][NumeroCuenta].getSaldo());
                    historia.Transacciones(NumeroIdentificador, NumeroCuenta ,"pago "+Servicios.getSelectedItem(), pagoServicio );
                    this.setVisible(false);
                    Administrador.setVisible(true);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ha ingresado un dato no valido o no hay cuenta existente");
            this.setVisible(false);
            Administrador.setVisible(true);
        }
    }//GEN-LAST:event_PagarActionPerformed

    private void VerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerDatosActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i < registro.ListaRegistradora.length; i++) {
            if (registro.ListaRegistradora[i] != null) {
                Usuarios.addItem(registro.ListaRegistradora[i].getCUI() + "  "
                        + registro.ListaRegistradora[i].getNombre()
                        + " " + registro.ListaRegistradora[i].getApellido());
            }
        }

    }//GEN-LAST:event_VerDatosActionPerformed

    private void ListaCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaCuentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListaCuentasActionPerformed

    private void VerCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCuentasActionPerformed
        // TODO add your handling code here:
        int Numerocuenta = Usuarios.getSelectedIndex();
        if (Numerocuenta != -1) {
            System.out.println(Numerocuenta);
            for (int i = 0; i < Cuentas.NuevasCuentas.length; i++) {
                if (Cuentas.NuevasCuentas[Numerocuenta][i] != null) {
                    ListaCuentas.addItem(String.valueOf(Cuentas.NuevasCuentas[Numerocuenta][i].getIdentificador())
                            + " " + Cuentas.NuevasCuentas[Numerocuenta][i].getCui() //EL numero toma en cuenta el numero de fila sin tomar 0
                            + " " + Cuentas.NuevasCuentas[Numerocuenta][i].getNombre()
                            + " " + Cuentas.NuevasCuentas[Numerocuenta][i].getApellido());
                    Pagar.setVisible(true);
                }
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "numero invalido");
            this.setVisible(false);
            Administrador.setVisible(true);
        }

    }//GEN-LAST:event_VerCuentasActionPerformed

    private void ServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServiciosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Administrador.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(PagosServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagosServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagosServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagosServicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagosServicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ListaCuentas;
    private javax.swing.JButton Pagar;
    private javax.swing.JComboBox<String> Servicios;
    private javax.swing.JComboBox<String> Usuarios;
    private javax.swing.JButton VerCuentas;
    private javax.swing.JButton VerDatos;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}