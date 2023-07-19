
package com.conversor;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Divisa extends javax.swing.JFrame {

    static void setVisable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    int xMouse, yMouse;
    double valor;
    int primeraDivisa;
    int divisaFinal;
    
    public Divisa() {
        initComponents();
        
        this.setLocationRelativeTo(this);
        
        SetImageLabel(imgDivisa, "src/image/moneda.png");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgDivisa = new javax.swing.JPanel();
        imgDivisa = new javax.swing.JLabel();
        headerDivisa = new javax.swing.JPanel();
        btnExitDivisa = new javax.swing.JPanel();
        exitDivisa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        contentVolver1 = new javax.swing.JPanel();
        volveraCasa1 = new javax.swing.JButton();
        irTemperatura = new javax.swing.JPanel();
        iraTemperatura = new javax.swing.JButton();
        textoDivisa = new javax.swing.JTextField();
        InsertarDivisa2 = new javax.swing.JComboBox<>();
        InsertarDivisa1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        convertir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bgDivisa.setBackground(new java.awt.Color(250, 250, 250));
        bgDivisa.setForeground(new java.awt.Color(51, 51, 51));
        bgDivisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bgDivisa.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        bgDivisa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bgDivisa.add(imgDivisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 400));

        headerDivisa.setBackground(new java.awt.Color(250, 250, 250));
        headerDivisa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerDivisaMouseDragged(evt);
            }
        });
        headerDivisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerDivisaMousePressed(evt);
            }
        });

        btnExitDivisa.setBackground(new java.awt.Color(250, 250, 250));
        btnExitDivisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitDivisaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitDivisaMouseExited(evt);
            }
        });

        exitDivisa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        exitDivisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitDivisa.setText("X");
        exitDivisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitDivisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitDivisaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitDivisaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitDivisaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitDivisaLayout = new javax.swing.GroupLayout(btnExitDivisa);
        btnExitDivisa.setLayout(btnExitDivisaLayout);
        btnExitDivisaLayout.setHorizontalGroup(
            btnExitDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitDivisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );
        btnExitDivisaLayout.setVerticalGroup(
            btnExitDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitDivisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerDivisaLayout = new javax.swing.GroupLayout(headerDivisa);
        headerDivisa.setLayout(headerDivisaLayout);
        headerDivisaLayout.setHorizontalGroup(
            headerDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerDivisaLayout.createSequentialGroup()
                .addContainerGap(746, Short.MAX_VALUE)
                .addComponent(btnExitDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerDivisaLayout.setVerticalGroup(
            headerDivisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerDivisaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExitDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgDivisa.add(headerDivisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, 30));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversor de Divisas");
        bgDivisa.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 240, 30));

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

        bgDivisa.add(contentVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 120, 30));

        irTemperatura.setBackground(new java.awt.Color(0, 153, 255));
        irTemperatura.setForeground(new java.awt.Color(250, 250, 250));
        irTemperatura.setLayout(new java.awt.BorderLayout());

        iraTemperatura.setBackground(new java.awt.Color(0, 153, 255));
        iraTemperatura.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        iraTemperatura.setForeground(new java.awt.Color(250, 250, 250));
        iraTemperatura.setText("Temperatura");
        iraTemperatura.setBorderPainted(false);
        iraTemperatura.setContentAreaFilled(false);
        iraTemperatura.setFocusPainted(false);
        iraTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iraTemperaturaActionPerformed(evt);
            }
        });
        irTemperatura.add(iraTemperatura, java.awt.BorderLayout.CENTER);

        bgDivisa.add(irTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 120, 30));

        textoDivisa.setBackground(new java.awt.Color(204, 204, 204));
        textoDivisa.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        textoDivisa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textoDivisa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textoDivisa.setMargin(new java.awt.Insets(3, 3, 3, 3));
        bgDivisa.add(textoDivisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 180, 20));

        InsertarDivisa2.setBackground(new java.awt.Color(204, 204, 204));
        InsertarDivisa2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        InsertarDivisa2.setForeground(new java.awt.Color(51, 51, 51));
        InsertarDivisa2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "DOP" }));
        InsertarDivisa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarDivisa2ActionPerformed(evt);
            }
        });
        bgDivisa.add(InsertarDivisa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 60, 20));

        InsertarDivisa1.setBackground(new java.awt.Color(204, 204, 204));
        InsertarDivisa1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        InsertarDivisa1.setForeground(new java.awt.Color(51, 51, 51));
        InsertarDivisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOP", "EUR", "USD" }));
        InsertarDivisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarDivisa1ActionPerformed(evt);
            }
        });
        bgDivisa.add(InsertarDivisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, 20));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        convertir.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        convertir.setForeground(new java.awt.Color(250, 250, 250));
        convertir.setText("Convertir");
        convertir.setBorderPainted(false);
        convertir.setContentAreaFilled(false);
        convertir.setFocusPainted(false);
        convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bgDivisa.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, -1, 30));

        resultado.setBackground(new java.awt.Color(204, 204, 204));
        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        resultado.setForeground(new java.awt.Color(51, 51, 51));
        resultado.setRows(2);
        resultado.setTabSize(4);
        resultado.setBorder(null);
        jScrollPane1.setViewportView(resultado);

        bgDivisa.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 270, 70));

        jLabel2.setBackground(new java.awt.Color(250, 250, 250));
        jLabel2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Ingrese la suma a cambiar...");
        bgDivisa.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgDivisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgDivisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerDivisaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerDivisaMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerDivisaMousePressed

    private void headerDivisaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerDivisaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerDivisaMouseDragged

    private void exitDivisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitDivisaMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitDivisaMouseClicked

    private void exitDivisaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitDivisaMouseEntered
        exitDivisa.setBackground(Color.red);
    }//GEN-LAST:event_exitDivisaMouseEntered

    private void exitDivisaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitDivisaMouseExited
       exitDivisa.setBackground(Color.white);
    }//GEN-LAST:event_exitDivisaMouseExited

    private void btnExitDivisaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitDivisaMouseEntered
        btnExitDivisa.setBackground(Color.red);
    }//GEN-LAST:event_btnExitDivisaMouseEntered

    private void btnExitDivisaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitDivisaMouseExited
        btnExitDivisa.setBackground(Color.white);
    }//GEN-LAST:event_btnExitDivisaMouseExited

    private void volveraCasa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volveraCasa1ActionPerformed
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_volveraCasa1ActionPerformed

    private void iraTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iraTemperaturaActionPerformed
        Temperatura temperatura = new Temperatura();
        temperatura.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_iraTemperaturaActionPerformed

    private void InsertarDivisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarDivisa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertarDivisa2ActionPerformed

    private void InsertarDivisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarDivisa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertarDivisa1ActionPerformed

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        valor = Double.parseDouble(textoDivisa.getText());
        primeraDivisa = InsertarDivisa1.getSelectedIndex();
        divisaFinal = InsertarDivisa2.getSelectedIndex();
        
        
    //conexion
        DivisaOperacion conexion = new DivisaOperacion();
        
        conexion.setValor(valor);
        conexion.setPrimeraDivisa(primeraDivisa);
        conexion.setDivisaFinal(divisaFinal);
        
//        ejecutar
        conexion.convertir();
        
//        limpiar el textarea
        resultado.setText(" ");
        
        
//        mostrar
        resultado.append(""+conexion.convertir());
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
            java.util.logging.Logger.getLogger(Divisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Divisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Divisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Divisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Divisa().setVisible(true);
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
    private javax.swing.JComboBox<String> InsertarDivisa1;
    private javax.swing.JComboBox<String> InsertarDivisa2;
    private javax.swing.JPanel bgDivisa;
    private javax.swing.JPanel btnExitDivisa;
    public javax.swing.JPanel contentVolver1;
    private javax.swing.JButton convertir;
    private javax.swing.JLabel exitDivisa;
    private javax.swing.JPanel headerDivisa;
    private javax.swing.JLabel imgDivisa;
    public javax.swing.JPanel irTemperatura;
    private javax.swing.JButton iraTemperatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultado;
    private javax.swing.JTextField textoDivisa;
    private javax.swing.JButton volveraCasa1;
    // End of variables declaration//GEN-END:variables
}
