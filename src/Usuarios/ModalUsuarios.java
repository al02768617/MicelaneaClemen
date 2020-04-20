/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import alertas.principal.AWTUtilities;
import alertas.principal.AlertaError;
import alertas.principal.AlertaExito;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

/**
 *
 * @author davidramos
 */
public class ModalUsuarios extends javax.swing.JDialog {
    
    Timer timer = null;
    TimerTask task;
    int i = 32;

    /**
     * Creates new form ModalUsuarios
     */
    public ModalUsuarios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        AWTUtilities.setOpaque(this, false);
        this.tipo.setCursor(new Cursor(12));
        this.id.setVisible(false);
        this.nombreUs.setVisible(false);
        Ubicar(0);
        this.txtUsuario.requestFocus();
    }

    private void limpiarCampos() {

        this.txtUsuario.requestFocus();
        this.txtUsuario.setText("");
        this.txtPassword.setText("");
        this.tipo.setSelectedIndex(0);

        Opciones.listar("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jPanel2 = new javax.swing.JPanel();
        cerrar = new principal.MaterialButton();
        titulo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tipo = new componentes.org1.bolivia.combo.SComboBox();
        txtUsuario = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new jpass.JRPasswordField();
        jLabel8 = new javax.swing.JLabel();
        nombreUs = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        limpiar = new principal.MaterialButton();
        registrar = new principal.MaterialButton();
        id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setText("X");
        cerrar.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Cerrar</h4> </body> </html>");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cerrar.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("TITULO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 10, 458, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        jPanel4.setBorder(dropShadowBorder1);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono-usuario.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIPO USUARIO", "ADMINISTRADOR", "NORMAL" }));
        tipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 240, 30));

        txtUsuario.setBorder(null);
        txtUsuario.setForeground(new java.awt.Color(58, 159, 171));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUsuario.setPlaceholder("USUARIO");
        jPanel4.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 240, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/campo-usuario.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        txtPassword.setBorder(null);
        txtPassword.setForeground(new java.awt.Color(58, 159, 171));
        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.setPlaceholder("CONTRASEÑA");
        jPanel4.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 240, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/campo-contrasena.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        nombreUs.setText("nombreUs");
        jPanel4.add(nombreUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 370, -1));

        panel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 420, 330));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        limpiar.setBackground(new java.awt.Color(255, 255, 255));
        limpiar.setText("LIMPIAR CAMPOS");
        limpiar.setToolTipText("<html> <head> <style> #contenedor{background:#3A9FAB;color:white; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Limpiar campos</h4> </body> </html>");
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        limpiar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel3.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 160, 50));

        registrar.setBackground(new java.awt.Color(255, 255, 255));
        registrar.setText("REGISTRAR");
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registrar.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        registrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                registrarKeyTyped(evt);
            }
        });
        jPanel3.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 50));

        id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("id");
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 30, -1));

        panel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 340, 459, 150));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 0) {
                    Cerrar();
                } else {
                    Ubicar(i);
                    i -= 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);
    }//GEN-LAST:event_cerrarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_limpiarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if (this.txtUsuario.getText().equals("") || this.txtPassword.getText().equals("")
            || this.tipo.getSelectedIndex() == 0) {

            AlertaError er = new AlertaError(new JFrame(), true);
            er.Titulo.setText("OOPS...");
            er.Mensaje.setText("FALTAN CAMPOS DE LLENAR");
            er.Mensaje1.setText("");
            er.setVisible(true);

        } else {
            if (this.txtPassword.getText().length() <= 7) {
                AlertaError er = new AlertaError(new JFrame(), true);
                er.Titulo.setText("OOPS...");
                er.Mensaje.setText("LA CONTRASEÑA DEBE CONTENER");
                er.Mensaje1.setText("MINIMO 8 CARACTERES");
                er.setVisible(true);
            } else {

                if (this.registrar.getText().equals("GUARDAR")) {

                    if (Opciones.verificaUsuario(this.txtUsuario.getText())
                        && !this.txtUsuario.getText().equals(this.nombreUs.getText())) {
                        AlertaError er = new AlertaError(new JFrame(), true);
                        er.Titulo.setText("OOPS...");
                        er.Mensaje.setText("EL NOMBRE DE USUARIO");
                        er.Mensaje1.setText("YA ÉXISTE");
                        er.setVisible(true);
                    } else {
                        Sentencias s = new Sentencias();

                        s.setUsuario(this.txtUsuario.getText());
                        s.setPassword(this.txtPassword.getText());
                        s.setTipo(this.tipo.getSelectedItem().toString());
                        s.setId(Integer.parseInt(this.id.getText()));

                        int opcion = Opciones.actualizar(s);
                        if (opcion != 0) {
                            Opciones.listar("");
                            AlertaExito sa = new AlertaExito(new JFrame(), true);
                            sa.Titulo.setText("¡HECHO!");
                            sa.Mensaje.setText("SE HAN GUARDADO LOS CAMBIOS");
                            sa.Mensaje1.setText("");
                            sa.setVisible(true);
                        }
                    }
                } else {
                    if (Opciones.verificaUsuario(this.txtUsuario.getText())) {
                        AlertaError er = new AlertaError(new JFrame(), true);
                        er.Titulo.setText("OOPS...");
                        er.Mensaje.setText("EL NOMBRE DE USUARIO");
                        er.Mensaje1.setText("YA ÉXISTE");
                        er.setVisible(true);
                    } else {
                        Sentencias s = new Sentencias();

                        s.setUsuario(this.txtUsuario.getText());
                        s.setPassword(this.txtPassword.getText());
                        s.setTipo(this.tipo.getSelectedItem().toString());

                        int opcion = Opciones.registrar(s);
                        if (opcion != 0) {
                            limpiarCampos();
                            AlertaExito sa = new AlertaExito(new JFrame(), true);
                            sa.Titulo.setText("¡HECHO!");
                            sa.Mensaje.setText("SE HA REGISTRADO UN");
                            sa.Mensaje1.setText("NUEVO USUARIO");
                            sa.setVisible(true);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void registrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registrarKeyTyped
        if ((evt.getKeyChar() == KeyEvent.VK_ENTER)) {
            if (this.txtUsuario.getText().equals("") || this.txtPassword.getText().equals("")
                || this.tipo.getSelectedIndex() == 0) {

                AlertaError er = new AlertaError(new JFrame(), true);
                er.Titulo.setText("OOPS...");
                er.Mensaje.setText("FALTAN CAMPOS DE LLENAR");
                er.Mensaje1.setText("");
                er.setVisible(true);

            } else {
                if (this.txtPassword.getText().length() <= 7) {
                    AlertaError er = new AlertaError(new JFrame(), true);
                    er.Titulo.setText("OOPS...");
                    er.Mensaje.setText("LA CONTRASEÑA DEBE CONTENER");
                    er.Mensaje1.setText("MINIMO 8 CARACTERES");
                    er.setVisible(true);
                } else {

                    if (this.registrar.getText().equals("GUARDAR")) {

                        if (Opciones.verificaUsuario(this.txtUsuario.getText())
                            && !this.txtUsuario.getText().equals(this.nombreUs.getText())) {
                            AlertaError er = new AlertaError(new JFrame(), true);
                            er.Titulo.setText("OOPS...");
                            er.Mensaje.setText("EL NOMBRE DE USUARIO");
                            er.Mensaje1.setText("YA ÉXISTE");
                            er.setVisible(true);
                        } else {
                            Sentencias s = new Sentencias();

                            s.setUsuario(this.txtUsuario.getText());
                            s.setPassword(this.txtPassword.getText());
                            s.setTipo(this.tipo.getSelectedItem().toString());
                            s.setId(Integer.parseInt(this.id.getText()));

                            int opcion = Opciones.actualizar(s);
                            if (opcion != 0) {
                                Opciones.listar("");
                                AlertaExito sa = new AlertaExito(new JFrame(), true);
                                sa.Titulo.setText("¡HECHO!");
                                sa.Mensaje.setText("SE HAN GUARDADO LOS CAMBIOS");
                                sa.Mensaje1.setText("");
                                sa.setVisible(true);
                            }
                        }
                    } else {
                        if (Opciones.verificaUsuario(this.txtUsuario.getText())) {
                            AlertaError er = new AlertaError(new JFrame(), true);
                            er.Titulo.setText("OOPS...");
                            er.Mensaje.setText("EL NOMBRE DE USUARIO");
                            er.Mensaje1.setText("YA ÉXISTE");
                            er.setVisible(true);
                        } else {
                            Sentencias s = new Sentencias();

                            s.setUsuario(this.txtUsuario.getText());
                            s.setPassword(this.txtPassword.getText());
                            s.setTipo(this.tipo.getSelectedItem().toString());

                            int opcion = Opciones.registrar(s);
                            if (opcion != 0) {
                                limpiarCampos();
                                AlertaExito sa = new AlertaExito(new JFrame(), true);
                                sa.Titulo.setText("¡HECHO!");
                                sa.Mensaje.setText("SE HA REGISTRADO UN");
                                sa.Mensaje1.setText("NUEVO USUARIO");
                                sa.setVisible(true);
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_registrarKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 352) {
                    timer.cancel();
                } else {
                    Ubicar(i);
                    i += 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ModalUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModalUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModalUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModalUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModalUsuarios dialog = new ModalUsuarios(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButton cerrar;
    public static javax.swing.JLabel id;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private principal.MaterialButton limpiar;
    public static javax.swing.JLabel nombreUs;
    private java.awt.Panel panel1;
    public static principal.MaterialButton registrar;
    public static componentes.org1.bolivia.combo.SComboBox tipo;
    public static javax.swing.JLabel titulo;
    public static jpass.JRPasswordField txtPassword;
    public static app.bolivia.swing.JCTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void Cerrar() {
        this.dispose();
        timer = null;
        task = null;
    }

    private void Trasparencia(float trasp) {
        AWTUtilities.setOpacity(this, trasp);
    }

    private void Ubicar(int y) {
        this.setLocation(603, y - 200);
    }
}