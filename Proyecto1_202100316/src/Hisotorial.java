
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Hinestroza
 */
public class Hisotorial extends javax.swing.JFrame {

    static Historial verHistoria[][] = new Historial[5][20];
    MenuAdmin Administrador = new MenuAdmin();
    CrearCuentas cuentas = new CrearCuentas();
    static RegistroClientes registro = new RegistroClientes();
    static int numerocuento = 0;
    static int numerocuento1 = 0;
    static int numerocuento2 = 0;
    static int numerocuento3 = 0;
    static int numerocuento4 = 0;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    /**
     * Creates new form
     */
    public Hisotorial() {
        initComponents();
    }

    public void Transacciones(int fila, int cuenta, String tipo, int dinero) {
        LocalDateTime now = LocalDateTime.now();
        String fecha = dtf.format(now);
        
        if (fila == 0) {
            if (numerocuento < 20) {
                if (tipo.equals("transferencia") || tipo.equals("deposito")) { 
                    verHistoria[fila][numerocuento] = new Historial(String.valueOf(cuentas.NuevasCuentas[fila][cuenta].getIdentificador()),
                            fecha, registro.ListaRegistradora[fila].getNombre(), registro.ListaRegistradora[fila].getApellido(), tipo,
                            dinero, 0);
                    numerocuento++;
                    
                }if (numerocuento < 20) {
                        if (tipo.equals("retiro transferencia") || tipo.equals("pago Servicio Luz") 
                                || tipo.equals("pago Servicio Agua") || tipo.equals("pago Servicio Telefonico")) {
                            
                            verHistoria[fila][numerocuento] = new Historial(String.valueOf(cuentas.NuevasCuentas[fila][cuenta].getIdentificador()),
                                    fecha, registro.ListaRegistradora[fila].getNombre(), registro.ListaRegistradora[fila].getApellido(), tipo,
                                    0, dinero);
                            numerocuento++;
                        }
                    }
                JOptionPane.showMessageDialog(rootPane, "Transaccions realizada con exito");
            } else {
                JOptionPane.showMessageDialog(null, "No puede realizar más transaccioens");
                Administrador.setVisible(true);
                this.setVisible(false);
            }
        }
        if (fila == 1) {
            if (numerocuento1 < 20) {
                if (tipo.equals("transferencia") || tipo.equals("deposito")) {
                    verHistoria[fila][numerocuento1] = new Historial(String.valueOf(cuentas.NuevasCuentas[fila][cuenta].getIdentificador()),
                            fecha, registro.ListaRegistradora[fila].getNombre(), registro.ListaRegistradora[fila].getApellido(), tipo,
                            dinero, 0);
                    numerocuento1++;
                    
                } if (numerocuento1 < 20) {
                        if (tipo.equals("retiro transferencia") || tipo.equals("pago Servicio Luz") 
                                || tipo.equals("pago Servicio Agua") || tipo.equals("pago Servicio Telefonico")) {
                            verHistoria[fila][numerocuento1] = new Historial(String.valueOf(cuentas.NuevasCuentas[fila][cuenta].getIdentificador()),
                                    fecha, registro.ListaRegistradora[fila].getNombre(), registro.ListaRegistradora[fila].getApellido(), tipo,
                                    0, dinero);
                            numerocuento1++;
                        }
                    }
                JOptionPane.showMessageDialog(rootPane, "Transaccions realizada con exito");
        } else {
            JOptionPane.showMessageDialog(null, "No puede realizar más transaccioens");
            Administrador.setVisible(true);
            this.setVisible(false);
        }
        }
        if (fila == 2) {
            if (numerocuento2 < 20) {

                if (tipo.equals("transferencia") || tipo.equals("deposito")) {
                    verHistoria[fila][numerocuento2] = new Historial(String.valueOf(cuentas.NuevasCuentas[fila][cuenta].getIdentificador()),
                            fecha, registro.ListaRegistradora[fila].getNombre(), registro.ListaRegistradora[fila].getApellido(), tipo,
                            dinero, 0);
                    numerocuento2++;
                    
                }if (numerocuento2 < 20) {
                        if (tipo.equals("retiro transferencia") || tipo.equals("pago Servicio Luz") 
                                || tipo.equals("pago Servicio Agua") || tipo.equals("pago Servicio Telefonico")) {
                            verHistoria[fila][numerocuento2] = new Historial(String.valueOf(cuentas.NuevasCuentas[fila][cuenta].getIdentificador()),
                                    fecha, registro.ListaRegistradora[fila].getNombre(), registro.ListaRegistradora[fila].getApellido(), tipo,
                                    0, dinero);
                            numerocuento2++;
                        }
                    }

            } else {
                JOptionPane.showMessageDialog(null, "No puede realizar más transaccioens");
                Administrador.setVisible(true);
                this.setVisible(false);
            }
        }
        if (fila == 3) {
            if (numerocuento3 < 20) {
                if (tipo.equals("transferencia") || tipo.equals("deposito")) {
                    verHistoria[fila][numerocuento3] = new Historial(String.valueOf(cuentas.NuevasCuentas[fila][cuenta].getIdentificador()),
                            fecha, registro.ListaRegistradora[fila].getNombre(), registro.ListaRegistradora[fila].getApellido(), tipo,
                            dinero, 0);
                    numerocuento3++;
                    
                }if (numerocuento3 < 20) {
                        if (tipo.equals("retiro transferencia") || tipo.equals("pago Servicio Luz") 
                                || tipo.equals("pago Servicio Agua") || tipo.equals("pago Servicio Telefonico")) {
                            verHistoria[fila][numerocuento3] = new Historial(String.valueOf(cuentas.NuevasCuentas[fila][cuenta].getIdentificador()),
                                    fecha, registro.ListaRegistradora[fila].getNombre(), registro.ListaRegistradora[fila].getApellido(), tipo,
                                    0, dinero);
                            numerocuento3++;
                        }
                    }

            } else {
                JOptionPane.showMessageDialog(null, "No puede realizar más transaccioens");
                Administrador.setVisible(true);
                this.setVisible(false);
            }
        }
        if (fila == 4) {
            if (numerocuento4 < 20) {

                if (tipo.equals("transferencia") || tipo.equals("deposito")) {
                    verHistoria[fila][numerocuento4] = new Historial(String.valueOf(cuentas.NuevasCuentas[fila][cuenta].getIdentificador()),
                            fecha, registro.ListaRegistradora[fila].getNombre(), registro.ListaRegistradora[fila].getApellido(), tipo,
                            dinero, 0);
                    numerocuento4++;
                   
                } if (numerocuento4 < 20) {
                        if (tipo.equals("retiro transferencia") || tipo.equals("pago Servicio Luz") 
                                || tipo.equals("pago Servicio Agua") || tipo.equals("pago Servicio Telefonico")) {
                            verHistoria[fila][numerocuento4] = new Historial(String.valueOf(cuentas.NuevasCuentas[fila][cuenta].getIdentificador()),
                                    fecha, registro.ListaRegistradora[fila].getNombre(), registro.ListaRegistradora[fila].getApellido(), tipo,
                                    0, dinero);
                            numerocuento4++;
                        }
                    }

            } else {
                JOptionPane.showMessageDialog(null, "No puede realizar más transaccioens");
                Administrador.setVisible(true);
                this.setVisible(false);
            }
        }
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
        jLabel1 = new javax.swing.JLabel();
        VerDatos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        VerCuentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Usuarios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
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

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        VerCuentas.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        VerCuentas.setText("Ver Cuentas");
        VerCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCuentasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(VerCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(48, 48, 48)
                                .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(VerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VerDatos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerCuentas)
                    .addComponent(jButton1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuariosActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Administrador.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VerCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCuentasActionPerformed
        // TODO add your handling code here:

        int numerocuenta = Usuarios.getSelectedIndex();
        String[][] matriz = new String[20][7];
        if (numerocuenta != -1) {
            for (int i = 0; i < 20; i++) {
                if (verHistoria[numerocuenta][i] != null) {
                    matriz[i][0] = String.valueOf(verHistoria[numerocuenta][i].getID());
                    matriz[i][1] = verHistoria[numerocuenta][i].getHora();
                    matriz[i][2] = verHistoria[numerocuenta][i].getNombre(); // columna nombres
                    matriz[i][3] = verHistoria[numerocuenta][i].getApellido();
                    matriz[i][4] = verHistoria[numerocuenta][i].getTipo(); // apellidos
                    matriz[i][5] = String.valueOf(verHistoria[numerocuenta][i].getAcreditado()); 
                    matriz[i][6] = String.valueOf(verHistoria[numerocuenta][i].getDebito());
                }
            }
            String[] encabezado = {"No. Cuenta", "fecha", "Nombre", "Apellido", "tipo transaccion", "acreditado", "retirado"};
            tablaDatos.setModel(new DefaultTableModel(
                    matriz,
                    encabezado
            ));
            VerDatos.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No hay cuentas por ver ");
            this.setVisible(false);
            Administrador.setVisible(true);
        }
    }//GEN-LAST:event_VerCuentasActionPerformed

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
            java.util.logging.Logger.getLogger(Hisotorial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hisotorial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hisotorial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hisotorial.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hisotorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Usuarios;
    private javax.swing.JButton VerCuentas;
    private javax.swing.JButton VerDatos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
