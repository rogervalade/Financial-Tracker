/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialtracker;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


/**
 *
 * @author shubh
 */
public class PopNotification extends javax.swing.JFrame {
     NumberFormat fmt = NumberFormat.getCurrencyInstance();
    StockMarket tmp = new StockMarket();
    double x = tmp.getStockPrice("btc");
    
    
    public PopNotification() {
        
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
       
        
        Insets toolHeight = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        new Thread (new Runnable(){
            @Override
            public void run (){
                for (int i = 0; i<getHeight(); i++){
                     setLocation (scrSize.width - getWidth(), scrSize.height - toolHeight.bottom - getHeight()-i);
                     try {
                         Thread.sleep (10);
                         
                     } catch (InterruptedException ex){
                         Logger.getLogger(PopNotification.class.getName()).log(Level.SEVERE,null,ex);
                     }
                }
            }
        }).start();
        
       
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NotifStock = new javax.swing.JTextField();
        NotifPrice = new javax.swing.JTextField();
        GetNotification = new javax.swing.JButton();
        NotifStockResult = new javax.swing.JTextField();
        NotifPriceResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(23, 35, 51));

        NotifStock.setBackground(new java.awt.Color(31, 48, 71));
        NotifStock.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NotifStock.setForeground(new java.awt.Color(255, 255, 255));
        NotifStock.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        NotifStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotifStockActionPerformed(evt);
            }
        });

        NotifPrice.setBackground(new java.awt.Color(31, 48, 71));
        NotifPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NotifPrice.setForeground(new java.awt.Color(255, 255, 255));
        NotifPrice.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        NotifPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotifPriceActionPerformed(evt);
            }
        });

        GetNotification.setBackground(new java.awt.Color(47, 70, 103));
        GetNotification.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        GetNotification.setForeground(new java.awt.Color(255, 255, 255));
        GetNotification.setText("GetNotifButton");
        GetNotification.setActionCommand("GetNotif");
        GetNotification.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        GetNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetNotificationActionPerformed(evt);
            }
        });

        NotifStockResult.setBackground(new java.awt.Color(23, 35, 51));
        NotifStockResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NotifStockResult.setForeground(new java.awt.Color(255, 255, 255));
        NotifStockResult.setBorder(null);
        NotifStockResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotifStockResultActionPerformed(evt);
            }
        });

        NotifPriceResult.setBackground(new java.awt.Color(23, 35, 51));
        NotifPriceResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NotifPriceResult.setForeground(new java.awt.Color(255, 255, 255));
        NotifPriceResult.setBorder(null);
        NotifPriceResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotifPriceResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(GetNotification)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NotifStockResult, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NotifStock, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NotifPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NotifPriceResult, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NotifStock)
                    .addComponent(NotifPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GetNotification)
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NotifStockResult)
                    .addComponent(NotifPriceResult))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NotifStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotifStockActionPerformed
       
             

    }//GEN-LAST:event_NotifStockActionPerformed

    private void NotifPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotifPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotifPriceActionPerformed

    private void NotifStockResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotifStockResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotifStockResultActionPerformed

    private void NotifPriceResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotifPriceResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotifPriceResultActionPerformed

    private void GetNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetNotificationActionPerformed
     
        double tolerance = .001;
          Insets toolHeight = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        
     double x = tmp.getStockPrice(NotifStock.getText());
     double y = Double.parseDouble(NotifPrice.getText());
     
     if(Math.abs(x-y)< tolerance){
         NotifStockResult.setText(NotifStock.getText());
         NotifPriceResult.setText(NotifPrice.getText());
        
         new Thread (new Runnable(){
            @Override
            public void run (){
                for (int i = 0; i<getHeight(); i++){
                     setLocation (scrSize.width - getWidth(), scrSize.height - toolHeight.bottom - getHeight()-i);
                     try {
                         Thread.sleep (10);
                         
                     } catch (InterruptedException ex){
                         Logger.getLogger(PopNotification.class.getName()).log(Level.SEVERE,null,ex);
                     }
                }
            }
        }).start();
        
     } else {
          new Thread (new Runnable(){
            @Override
            public void run (){
                dispose();
                     
                     try {
                         Thread.sleep (5000);
                         
                     } catch (InterruptedException ex){
                         Logger.getLogger(PopNotification.class.getName()).log(Level.SEVERE,null,ex);
                     }
                SwingUtilities.invokeLater(new Runnable(){
                    @Override
                    public void run(){
                        new PopNotification().setVisible(true);
                    }
                });
            }
        }).start();
     }
     
    }//GEN-LAST:event_GetNotificationActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GetNotification;
    private javax.swing.JTextField NotifPrice;
    private javax.swing.JTextField NotifPriceResult;
    private javax.swing.JTextField NotifStock;
    private javax.swing.JTextField NotifStockResult;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
