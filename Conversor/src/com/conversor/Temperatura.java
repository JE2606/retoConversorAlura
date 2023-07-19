
package com.conversor;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Temperatura extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    public Temperatura() {
        initComponents();
        
        this.setLocationRelativeTo(this);
        
         SetImageLabel(imgTemperatura, "src/image/temperatura.png");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTemperatura = new javax.swing.JPanel();
        imgTemperatura = new javax.swing.JLabel();
        headerTemperatura = new javax.swing.JPanel();
        btnExitTemperatura = new javax.swing.JPanel();
        exitTemperatura = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        contentVolver1 = new javax.swing.JPanel();
        volveraCasa1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        divisa1 = new javax.swing.JButton();
        seleccion1 = new javax.swing.JComboBox<>();
        seleccion2 = new javax.swing.JComboBox<>();
        primeraTemperatura = new javax.swing.JTextField();
        segundaTemperatura = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        limpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        convertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bgTemperatura.setBackground(new java.awt.Color(250, 250, 250));
        bgTemperatura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bgTemperatura.add(imgTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 400));

        headerTemperatura.setBackground(new java.awt.Color(250, 250, 250));
        headerTemperatura.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerTemperaturaMouseDragged(evt);
            }
        });
        headerTemperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerTemperaturaMousePressed(evt);
            }
        });

        btnExitTemperatura.setBackground(new java.awt.Color(250, 250, 250));
        btnExitTemperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitTemperaturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitTemperaturaMouseExited(evt);
            }
        });

        exitTemperatura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        exitTemperatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTemperatura.setText("X");
        exitTemperatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTemperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTemperaturaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnExitTemperaturaLayout = new javax.swing.GroupLayout(btnExitTemperatura);
        btnExitTemperatura.setLayout(btnExitTemperaturaLayout);
        btnExitTemperaturaLayout.setHorizontalGroup(
            btnExitTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );
        btnExitTemperaturaLayout.setVerticalGroup(
            btnExitTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerTemperaturaLayout = new javax.swing.GroupLayout(headerTemperatura);
        headerTemperatura.setLayout(headerTemperaturaLayout);
        headerTemperaturaLayout.setHorizontalGroup(
            headerTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerTemperaturaLayout.createSequentialGroup()
                .addGap(0, 758, Short.MAX_VALUE)
                .addComponent(btnExitTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerTemperaturaLayout.setVerticalGroup(
            headerTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExitTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bgTemperatura.add(headerTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 830, 30));

        Titulo.setBackground(new java.awt.Color(250, 250, 250));
        Titulo.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 51));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Conversor de Temperatura");
        bgTemperatura.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 230, 20));

        contentVolver1.setBackground(new java.awt.Color(0, 153, 255));
        contentVolver1.setForeground(new java.awt.Color(250, 250, 250));
        contentVolver1.setLayout(new java.awt.BorderLayout());

        volveraCasa1.setBackground(new java.awt.Color(0, 153, 255));
        volveraCasa1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        volveraCasa1.setForeground(new java.awt.Color(250, 250, 250));
        volveraCasa1.setText("Volver a Casa");
        volveraCasa1.setBorderPainted(false);
        volveraCasa1.setContentAreaFilled(false);
        volveraCasa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volveraCasa1.setFocusPainted(false);
        volveraCasa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volveraCasa1ActionPerformed(evt);
            }
        });
        contentVolver1.add(volveraCasa1, java.awt.BorderLayout.CENTER);

        bgTemperatura.add(contentVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 120, 30));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setForeground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new java.awt.BorderLayout());

        divisa1.setBackground(new java.awt.Color(0, 153, 255));
        divisa1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        divisa1.setForeground(new java.awt.Color(250, 250, 250));
        divisa1.setText("Divisa");
        divisa1.setToolTipText("");
        divisa1.setBorderPainted(false);
        divisa1.setContentAreaFilled(false);
        divisa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        divisa1.setFocusPainted(false);
        divisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisa1ActionPerformed(evt);
            }
        });
        jPanel1.add(divisa1, java.awt.BorderLayout.CENTER);

        bgTemperatura.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 120, 30));

        seleccion1.setBackground(new java.awt.Color(204, 204, 204));
        seleccion1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        seleccion1.setForeground(new java.awt.Color(51, 51, 51));
        seleccion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));
        seleccion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seleccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccion1ActionPerformed(evt);
            }
        });
        bgTemperatura.add(seleccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 100, 30));

        seleccion2.setBackground(new java.awt.Color(204, 204, 204));
        seleccion2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        seleccion2.setForeground(new java.awt.Color(51, 51, 51));
        seleccion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenheit", "Celsius", "Kelvin" }));
        seleccion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bgTemperatura.add(seleccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, 30));

        primeraTemperatura.setBackground(new java.awt.Color(204, 204, 204));
        primeraTemperatura.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        primeraTemperatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bgTemperatura.add(primeraTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 160, 30));

        segundaTemperatura.setBackground(new java.awt.Color(204, 204, 204));
        segundaTemperatura.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        segundaTemperatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bgTemperatura.add(segundaTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 160, 30));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setForeground(new java.awt.Color(250, 250, 250));

        limpiar.setBackground(new java.awt.Color(0, 51, 204));
        limpiar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        limpiar.setForeground(new java.awt.Color(250, 250, 250));
        limpiar.setText("Limpiar");
        limpiar.setBorderPainted(false);
        limpiar.setContentAreaFilled(false);
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.setFocusPainted(false);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgTemperatura.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, -1, 30));

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setForeground(new java.awt.Color(250, 250, 250));

        convertir.setBackground(new java.awt.Color(0, 51, 204));
        convertir.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        convertir.setForeground(new java.awt.Color(250, 250, 250));
        convertir.setText("Convertir");
        convertir.setBorderPainted(false);
        convertir.setContentAreaFilled(false);
        convertir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        convertir.setFocusPainted(false);
        convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(convertir, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgTemperatura.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerTemperaturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerTemperaturaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerTemperaturaMousePressed

    private void headerTemperaturaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerTemperaturaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerTemperaturaMouseDragged

    private void exitTemperaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTemperaturaMouseClicked
         System.exit(0);
    }//GEN-LAST:event_exitTemperaturaMouseClicked

    private void btnExitTemperaturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitTemperaturaMouseEntered
        btnExitTemperatura.setBackground(Color.red);
    }//GEN-LAST:event_btnExitTemperaturaMouseEntered

    private void btnExitTemperaturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitTemperaturaMouseExited
        btnExitTemperatura.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnExitTemperaturaMouseExited

    private void volveraCasa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volveraCasa1ActionPerformed
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volveraCasa1ActionPerformed

    private void divisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisa1ActionPerformed
        Divisa divisa = new Divisa();
        divisa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_divisa1ActionPerformed

    private void seleccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seleccion1ActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        primeraTemperatura.setText("");
        segundaTemperatura.setText("");
                
    }//GEN-LAST:event_limpiarActionPerformed

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        
        String box1 = (String)seleccion1.getSelectedItem();
        String box2 = (String)seleccion2.getSelectedItem();
        
//        CELSIUS
        if(box1.equals("Celsius") && box2.equals("Fahrenheit"))
        {
            double c = Double.parseDouble(primeraTemperatura.getText());
            double f = (double)(c * 1.8 + 32);
            
            segundaTemperatura.setText(String.valueOf(f));
        }
        
         if(box1.equals("Celsius") && box2.equals("Kelvin"))
        {
            double c = Double.parseDouble(primeraTemperatura.getText());
            double k = (double)(c + 273.15 );
            
            segundaTemperatura.setText(String.valueOf(k));
        }
         if(box1.equals("Celsius") && box2.equals("Celsius"))
        {
            double c = Double.parseDouble(primeraTemperatura.getText());
            
            segundaTemperatura.setText(String.valueOf(c));
        }
         
//         FAHRENHEIT
           if(box1.equals("Fahrenheit") && box2.equals("Celsius"))
       {
           double f = Double.parseDouble(primeraTemperatura.getText());
           
           double c = (double)((f - 32)*5/9);
           
           segundaTemperatura.setText(String.valueOf(c));
       }
       else if(box1.equals("Fahrenheit") && box2.equals("Kelvin"))
       {
           double f = Double.parseDouble(primeraTemperatura.getText());
           
           double k = (double)((f - 32)*5/9 + 273.15);
           
           segundaTemperatura.setText(String.valueOf(k));
       }
       else if(box1.equals("Fahrenheit") && box2.equals("Fahrenheit"))
       {
           double f = Double.parseDouble(primeraTemperatura.getText());
         
           segundaTemperatura.setText(String.valueOf(f));
       }
       
// KELVIN
       if(box1.equals("Kelvin") && box2.equals("Celsius"))
       {
           double k = Double.parseDouble(primeraTemperatura.getText());
           
           double c = (double)(0 - 273.15);
           
          segundaTemperatura.setText(String.valueOf(c));
       }
       else if(box1.equals("Kelvin") && box2.equals("Fahrenheit"))
       {
           double k = Double.parseDouble(primeraTemperatura.getText());
           
           double f = (double)(0 - 273.15) * 9/5 +32;
           
           segundaTemperatura.setText(String.valueOf(f));
       }
       else if(box1.equals("Kelvin") && box2.equals("Kelvin"))
       {
           double k = Double.parseDouble(primeraTemperatura.getText());
         
           segundaTemperatura.setText(String.valueOf(k));
       }
         
    }//GEN-LAST:event_convertirActionPerformed

    
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
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Temperatura().setVisible(true);
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
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel bgTemperatura;
    private javax.swing.JPanel btnExitTemperatura;
    private javax.swing.JPanel contentVolver1;
    private javax.swing.JButton convertir;
    private javax.swing.JButton divisa1;
    private javax.swing.JLabel exitTemperatura;
    private javax.swing.JPanel headerTemperatura;
    private javax.swing.JLabel imgTemperatura;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField primeraTemperatura;
    private javax.swing.JTextField segundaTemperatura;
    private javax.swing.JComboBox<String> seleccion1;
    private javax.swing.JComboBox<String> seleccion2;
    private javax.swing.JButton volveraCasa1;
    // End of variables declaration//GEN-END:variables
}
