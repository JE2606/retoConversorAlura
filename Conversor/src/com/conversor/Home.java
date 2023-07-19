
package com.conversor;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Home extends javax.swing.JFrame {
    
    //para la barra de salir
    int xMouse, yMouse;
    
   
    public Home() {
        initComponents();
        
        this.setLocationRelativeTo(this);
        
        SetImageLabel(lbl1, "src/image/welcome.png");
        SetImageLabel(lbl2, "src/image/home.png");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        exitTXT = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        tituloPrincipal = new javax.swing.JLabel();
        textoSelector = new javax.swing.JLabel();
        fondoTXT = new javax.swing.JPanel();
        variableDivisa = new javax.swing.JPanel();
        divisaBtn = new javax.swing.JButton();
        variableTemperatura = new javax.swing.JPanel();
        temperaturabtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(250, 250, 250));
        bg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 400));

        header.setBackground(new java.awt.Color(250, 250, 250));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(250, 250, 250));
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        exitTXT.setBackground(new java.awt.Color(51, 51, 51));
        exitTXT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        exitTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTXT.setText("X");
        exitTXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTXTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTXTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTXTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitTXTMousePressed(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTXT, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(734, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 30));
        bg.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 40, 40));

        tituloPrincipal.setBackground(new java.awt.Color(250, 250, 250));
        tituloPrincipal.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        tituloPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        tituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipal.setText("RETO ALURA HECHO POR JUAN HERNANDEZ");
        bg.add(tituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 300, -1));

        textoSelector.setBackground(new java.awt.Color(250, 255, 247));
        textoSelector.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        textoSelector.setForeground(new java.awt.Color(51, 51, 51));
        textoSelector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoSelector.setText("SELECCIONE EL CONVERSOR QUE DESEA UTILIZAR...");
        bg.add(textoSelector, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 560, 40));

        fondoTXT.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout fondoTXTLayout = new javax.swing.GroupLayout(fondoTXT);
        fondoTXT.setLayout(fondoTXTLayout);
        fondoTXTLayout.setHorizontalGroup(
            fondoTXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        fondoTXTLayout.setVerticalGroup(
            fondoTXTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg.add(fondoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 560, 40));

        variableDivisa.setBackground(new java.awt.Color(0, 153, 255));
        variableDivisa.setLayout(new java.awt.BorderLayout());

        divisaBtn.setBackground(new java.awt.Color(0, 153, 255));
        divisaBtn.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        divisaBtn.setForeground(new java.awt.Color(250, 250, 250));
        divisaBtn.setText("Divisa");
        divisaBtn.setBorderPainted(false);
        divisaBtn.setContentAreaFilled(false);
        divisaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        divisaBtn.setFocusPainted(false);
        divisaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisaBtnActionPerformed(evt);
            }
        });
        variableDivisa.add(divisaBtn, java.awt.BorderLayout.CENTER);

        bg.add(variableDivisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 120, 30));

        variableTemperatura.setBackground(new java.awt.Color(0, 153, 255));
        variableTemperatura.setLayout(new java.awt.BorderLayout());

        temperaturabtn.setBackground(new java.awt.Color(0, 153, 255));
        temperaturabtn.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        temperaturabtn.setForeground(new java.awt.Color(250, 250, 250));
        temperaturabtn.setText("Temperatura");
        temperaturabtn.setBorderPainted(false);
        temperaturabtn.setContentAreaFilled(false);
        temperaturabtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        temperaturabtn.setFocusPainted(false);
        temperaturabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temperaturabtnActionPerformed(evt);
            }
        });
        variableTemperatura.add(temperaturabtn, java.awt.BorderLayout.CENTER);

        bg.add(variableTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTXTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTXTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitTXTMousePressed

    private void exitTXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTXTMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTXTMouseClicked

    private void exitTXTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTXTMouseEntered
        exitTXT.setBackground(Color.red);
    }//GEN-LAST:event_exitTXTMouseEntered

    private void exitTXTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTXTMouseExited
        exitTXT.setBackground(Color.white);
    }//GEN-LAST:event_exitTXTMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBackground(Color.red);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(Color.white);
    }//GEN-LAST:event_exitMouseExited

    private void divisaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisaBtnActionPerformed
        Divisa divisa = new Divisa();
        divisa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_divisaBtnActionPerformed

    private void temperaturabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temperaturabtnActionPerformed
        Temperatura temperatura = new Temperatura();
        temperatura.setVisible(true);
        this.setVisible(false);    
    }//GEN-LAST:event_temperaturabtnActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    
    private void SetImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(
                        labelName.getWidth(),
                       labelName.getHeight(),
                        Image.SCALE_DEFAULT)
        );
        labelName.setIcon(icon);
        this.repaint();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton divisaBtn;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel exitTXT;
    private javax.swing.JPanel fondoTXT;
    private javax.swing.JPanel header;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JButton temperaturabtn;
    private javax.swing.JLabel textoSelector;
    private javax.swing.JLabel tituloPrincipal;
    public javax.swing.JPanel variableDivisa;
    public javax.swing.JPanel variableTemperatura;
    // End of variables declaration//GEN-END:variables
}
