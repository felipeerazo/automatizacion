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
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 800, 800);        
        g.drawImage(new ImageIcon(getClass().getResource("../Recursos/tanque.png")).getImage(), 40, 40, 500, 500, this);
        g.setColor(new Color(98, 146, 173));
        g.fillRect(144, (int) (430 - tanque.getNivel()), 300, (int) (tanque.getNivel()));
        g.drawImage(new ImageIcon(getClass().getResource("../Recursos/alcohol1.png")).getImage(), 40, 40, 500, 500, this);        
        g.drawImage(new ImageIcon(getClass().getResource("../Recursos/alcohol2.png")).getImage(), 40, (int) (40 - tanque.getNivel()), 500, 500, this);       
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
