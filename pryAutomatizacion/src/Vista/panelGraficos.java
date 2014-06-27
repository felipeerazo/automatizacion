/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Tanque;
import Modelo.Valvula;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class panelGraficos extends javax.swing.JPanel {

    Tanque tanque = new Tanque(0, 0, 300);
    Valvula q1 = new Valvula((float) 0.5, 0);
    Valvula q2 = new Valvula((float) 0.5, 0);

    /**
     * Creates new form panelGraficos
     */
    public panelGraficos() {
        initComponents();
    }

    @Override
    protected void paintComponent(Graphics g) {
        //color fondo
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 800, 800);
        //tubo del gas
        g.setColor(Color.BLACK);
        g.fillRect(200, 470, 117, 30);
        //dibujo tanque
        g.drawImage(new ImageIcon(getClass().getResource("../Recursos/tanque.png")).getImage(), 10, 40, 500, 500, this);
        //dibujo del alcohol
        g.setColor(new Color(98, 146, 173));//--->color alcohol
        g.fillRect(114, (int) (430 - tanque.getNivel()), 300, (int) (tanque.getNivel()));//relleno alcohol
        g.drawImage(new ImageIcon(getClass().getResource("../Recursos/alcohol1.png")).getImage(), 10, 40, 500, 500, this);
        g.drawImage(new ImageIcon(getClass().getResource("../Recursos/alcohol2.png")).getImage(), 10, (int) (40 - tanque.getNivel()), 500, 500, this);
        //fuego
        g.drawImage(new ImageIcon(getClass().getResource("../Recursos/fuego.gif")).getImage(), 248, 460, 25, 32, this);
        g.drawImage(new ImageIcon(getClass().getResource("../Recursos/fuego.gif")).getImage(), 205, 460, 25, 32, this);
        g.drawImage(new ImageIcon(getClass().getResource("../Recursos/fuego.gif")).getImage(), 290, 460, 25, 32, this);

        //dibujo valores de las aperturas de las válvulas
        g.setColor(Color.WHITE);
        g.drawString(String.valueOf(q1.getApertura() * 100), 60, 80);
        g.drawString(String.valueOf(q2.getApertura() * 100), 450, 400);
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
