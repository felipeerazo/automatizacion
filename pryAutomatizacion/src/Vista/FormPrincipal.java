/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.DAORegistros;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * @author Dahiana Andrea Barreto
 * @author David Asaaf Vergara Almanza
 * @author Felipe Erazo Guerrero
 */
public class FormPrincipal extends javax.swing.JFrame {

    boolean bandera = true;
    int caudalMax = 10;
    private boolean on;
    DAORegistros dao = new DAORegistros();
    FormRegistros fRegistros = new FormRegistros();
    int i = 0;
    private boolean bandera2 = true;
    boolean hervir = false;
    boolean banderaHervir = true;

    public FormPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        insertar();
        hervir();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        panelGraficos1 = new Vista.panelGraficos();
        ContenedorInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTemperatura = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblQ1 = new javax.swing.JLabel();
        lblQ2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEncender = new javax.swing.JButton();
        btnRegistros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(31, 52, 113));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salir1.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        panelGraficos1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        javax.swing.GroupLayout panelGraficos1Layout = new javax.swing.GroupLayout(panelGraficos1);
        panelGraficos1.setLayout(panelGraficos1Layout);
        panelGraficos1Layout.setHorizontalGroup(
            panelGraficos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        panelGraficos1Layout.setVerticalGroup(
            panelGraficos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ContenedorInfo.setBackground(new java.awt.Color(157, 174, 191));
        ContenedorInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Temperatura:");

        lblTemperatura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTemperatura.setText("0");

        lblNivel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNivel.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nivel (m" + String.valueOf((char) 179) + "):");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Caudal Q1:");

        lblQ1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQ1.setText("0");

        lblQ2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQ2.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Caudal Q2:");

        btnEncender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/apagado1.png"))); // NOI18N
        btnEncender.setBorder(null);
        btnEncender.setBorderPainted(false);
        btnEncender.setContentAreaFilled(false);
        btnEncender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEncenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEncenderMouseExited(evt);
            }
        });
        btnEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncenderActionPerformed(evt);
            }
        });

        btnRegistros.setText("Registros");
        btnRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorInfoLayout = new javax.swing.GroupLayout(ContenedorInfo);
        ContenedorInfo.setLayout(ContenedorInfoLayout);
        ContenedorInfoLayout.setHorizontalGroup(
            ContenedorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEncender)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorInfoLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(ContenedorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistros)
                    .addGroup(ContenedorInfoLayout.createSequentialGroup()
                        .addGroup(ContenedorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(ContenedorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNivel)
                            .addComponent(lblQ1)
                            .addComponent(lblQ2)
                            .addComponent(lblTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );

        ContenedorInfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4});

        ContenedorInfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblNivel, lblQ1, lblQ2, lblTemperatura});

        ContenedorInfoLayout.setVerticalGroup(
            ContenedorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEncender)
                .addGap(91, 91, 91)
                .addGroup(ContenedorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTemperatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContenedorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContenedorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblQ1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContenedorInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblQ2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addComponent(btnRegistros)
                .addGap(30, 30, 30))
        );

        ContenedorInfoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4});

        ContenedorInfoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblNivel, lblQ1, lblQ2, lblTemperatura});

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(panelGraficos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ContenedorInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir)))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelGraficos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContenedorInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        cambiarIcono("../Recursos/salir2.png", btnSalir);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        cambiarIcono("../Recursos/salir1.png", btnSalir);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncenderActionPerformed
        if (on) {
            on = false;
            apagar();
            cambiarIcono("../Recursos/apagado1.png", btnEncender);
        } else {
            on = true;
            encender();
            cambiarIcono("../Recursos/encendido1.png", btnEncender);
        }
    }//GEN-LAST:event_btnEncenderActionPerformed

    private void btnRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrosActionPerformed
        // TODO add your handling code here:
        fRegistros.llenarTabla();
        fRegistros.setVisible(true);
    }//GEN-LAST:event_btnRegistrosActionPerformed

    private void btnEncenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncenderMouseEntered
        if (!on) {
            cambiarIcono("../Recursos/apagado2.png", btnEncender);
        } else {
            cambiarIcono("../Recursos/encendido2.png", btnEncender);
        }
    }//GEN-LAST:event_btnEncenderMouseEntered

    private void btnEncenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncenderMouseExited
        if (!on) {
            cambiarIcono("../Recursos/apagado1.png", btnEncender);
        } else {
            cambiarIcono("../Recursos/encendido1.png", btnEncender);
        }
    }//GEN-LAST:event_btnEncenderMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel ContenedorInfo;
    private javax.swing.JButton btnEncender;
    private javax.swing.JButton btnRegistros;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblQ1;
    private javax.swing.JLabel lblQ2;
    private javax.swing.JLabel lblTemperatura;
    private Vista.panelGraficos panelGraficos1;
    // End of variables declaration//GEN-END:variables

    private void salir() {
        try {
            bandera = false;
            banderaHervir = false;
            dao.getConn().cerrarConexion();
            System.exit(0);
        } catch (SQLException ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void encender() {
        bandera = true;
        new Thread() {
            @Override
            public void run() {
                while (bandera) {
                    calcularTemperatura();
                    if (panelGraficos1.tanque.getNivel() > 223) {
                        panelGraficos1.q2.setApertura((float) 0.5);
                        panelGraficos1.q1.setApertura(0);
                    } else if (panelGraficos1.tanque.getNivel() < 150) {
                        panelGraficos1.q2.setApertura(0);
                    }
                    if (panelGraficos1.q2.getApertura() == 0) {
                        panelGraficos1.q1.setApertura((float) (1 - (0.0044445 * panelGraficos1.tanque.getNivel())));
                    }
                    panelGraficos1.tanque.setNivel(panelGraficos1.tanque.getNivel() + caudalMax * (panelGraficos1.q1.getApertura() - panelGraficos1.q2.getApertura()));
                    lblNivel.setText(String.valueOf(panelGraficos1.tanque.getNivel()));
                    lblQ1.setText(String.valueOf(panelGraficos1.q1.getApertura() * caudalMax));
                    lblQ2.setText(String.valueOf(panelGraficos1.q2.getApertura() * caudalMax));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        }.start();
    }

    private void cambiarIcono(String ruta, JButton boton) {
        boton.setIcon(new ImageIcon(getClass().getResource(ruta)));
    }

    private void apagar() {
        bandera = false;
        panelGraficos1.q1.setApertura(0);
        new Thread() {
            @Override
            public void run() {
                while (panelGraficos1.tanque.getNivel() > 0 && !bandera) {
                    if (panelGraficos1.tanque.getNivel() > 75) {
                        panelGraficos1.q2.setApertura(1);
                    } else if (panelGraficos1.tanque.getNivel() > 50) {
                        panelGraficos1.q2.setApertura((float) 0.5);
                    }
                    panelGraficos1.tanque.setNivel(panelGraficos1.tanque.getNivel() - caudalMax * panelGraficos1.q2.getApertura());
                    lblNivel.setText(String.valueOf(panelGraficos1.tanque.getNivel()));
                    lblQ1.setText(String.valueOf(caudalMax * panelGraficos1.q1.getApertura()));
                    lblQ2.setText(String.valueOf(caudalMax * panelGraficos1.q2.getApertura()));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                panelGraficos1.tanque.setNivel(0);
                //panelGraficos1.q2.setApertura(0);                
                lblNivel.setText("0.0");
                lblQ2.setText("0.0");
            }
        }.start();
    }

    private void insertar() {

        new Thread() {
            @Override
            public void run() {
                try {
                    while (bandera) {
                        sleep(10000);
                        String temperatura = lblTemperatura.getText();
                        String nivel = lblNivel.getText();
                        String caudal_q1 = lblQ1.getText();
                        String caudal_q2 = lblQ2.getText();
                        System.out.println(dao.insertar(temperatura, nivel, caudal_q1, caudal_q2));
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }

    private void hervir() {
        new Thread() {
            @Override
            public void run() {
                int i = 1;
                try {
                    while (banderaHervir) {
                        if (panelGraficos1.tanque.getTemperatura() > 78 && panelGraficos1.tanque.getNivel() != 0) {
                            sleep(100);
                            if (i <= 16) {
                                panelGraficos1.alcoholHirviendo = new ImageIcon(getClass().getResource("../Recursos/SpritesAguaHirviendo/" + i + ".png"));
                                i++;
                            } else {
                                i = 1;
                            }
                        } else {
                            panelGraficos1.alcoholHirviendo = null;
                            panelGraficos1.imagenTanque = new ImageIcon(getClass().getResource("../Recursos/tanque.png"));
                            panelGraficos1.imagenNivelSuperior = new ImageIcon(getClass().getResource("../Recursos/alcohol2.png"));
                        }
                    }
                    panelGraficos1.alcoholHirviendo = null;
                    panelGraficos1.imagenTanque = new ImageIcon(getClass().getResource("../Recursos/tanque.png"));
                    panelGraficos1.imagenNivelSuperior = new ImageIcon(getClass().getResource("../Recursos/alcohol2.png"));
                } catch (InterruptedException ex) {
                    Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }

    private void calcularTemperatura() {
        if (bandera2) {
            i++;
        } else {
            i--;
        }
        panelGraficos1.tanque.setTemperatura((float) (14.512 * i) / panelGraficos1.tanque.getNivel() + 25);
        if (panelGraficos1.tanque.getTemperatura() > (float) 100) {
            bandera2 = false;
            panelGraficos1.bajarTemperatura();
        }
        if (panelGraficos1.tanque.getTemperatura() > 78 && panelGraficos1.tanque.getNivel() != 0) {
            panelGraficos1.imagenTanque = new ImageIcon(getClass().getResource("../Recursos/tanqueCaliente.png"));
            panelGraficos1.tanque.setNivel(panelGraficos1.tanque.getNivel() - ((float) 0.00411 * i));
        }
        if (panelGraficos1.tanque.getTemperatura() < 60) {
            bandera2 = true;
        }
        lblTemperatura.setText(String.valueOf(panelGraficos1.tanque.getTemperatura()));
    }
}
