package financialtracker;


import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author shubh
 */
public class Stocks extends javax.swing.JInternalFrame {
    
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    StockMarket tmp = new StockMarket();
    /**
     * Creates new form Stocks
     */
    public Stocks() {
       initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FirstStock = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        PriceButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        BuyOneButton = new javax.swing.JButton();
        SellOneButton = new javax.swing.JButton();
        FinalMessage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RecentSearches = new javax.swing.JTextArea();
        SecondStock = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BuyBothButton = new javax.swing.JButton();
        SellBothButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        RecentSearches1 = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(660, 450));

        jPanel1.setBackground(new java.awt.Color(23, 35, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(660, 450));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stocks You Are Interested In:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Prices:");

        FirstStock.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FirstStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstStockActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(23, 35, 51));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        PriceButton.setBackground(new java.awt.Color(47, 70, 103));
        PriceButton.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        PriceButton.setForeground(new java.awt.Color(255, 255, 255));
        PriceButton.setText("GetPrice");
        PriceButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PriceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(47, 70, 103));
        ClearButton.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton.setText("Clear");
        ClearButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ClearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        BuyOneButton.setBackground(new java.awt.Color(47, 70, 103));
        BuyOneButton.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        BuyOneButton.setForeground(new java.awt.Color(255, 255, 255));
        BuyOneButton.setText("Buy One");
        BuyOneButton.setActionCommand("Buy One");
        BuyOneButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BuyOneButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyOneButtonActionPerformed(evt);
            }
        });

        SellOneButton.setBackground(new java.awt.Color(47, 70, 103));
        SellOneButton.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        SellOneButton.setForeground(new java.awt.Color(255, 255, 255));
        SellOneButton.setText("Sell One");
        SellOneButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        SellOneButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SellOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellOneButtonActionPerformed(evt);
            }
        });

        FinalMessage.setEditable(false);
        FinalMessage.setBackground(new java.awt.Color(23, 35, 51));
        FinalMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FinalMessage.setForeground(new java.awt.Color(255, 255, 255));
        FinalMessage.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Recent Searches:");

        RecentSearches.setEditable(false);
        RecentSearches.setColumns(20);
        RecentSearches.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RecentSearches.setRows(5);
        jScrollPane2.setViewportView(RecentSearches);

        SecondStock.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SecondStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondStockActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(23, 35, 51));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/25823-5-stock-market-thumb.png"))); // NOI18N

        BuyBothButton.setBackground(new java.awt.Color(47, 70, 103));
        BuyBothButton.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        BuyBothButton.setForeground(new java.awt.Color(255, 255, 255));
        BuyBothButton.setText("Buy Both");
        BuyBothButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BuyBothButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BuyBothButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyBothButtonActionPerformed(evt);
            }
        });

        SellBothButton.setBackground(new java.awt.Color(47, 70, 103));
        SellBothButton.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        SellBothButton.setForeground(new java.awt.Color(255, 255, 255));
        SellBothButton.setText("Sell Both");
        SellBothButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        SellBothButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SellBothButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellBothButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Use Three Letters");

        RecentSearches1.setEditable(false);
        RecentSearches1.setColumns(20);
        RecentSearches1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RecentSearches1.setRows(5);
        RecentSearches1.setText("Bitcoin-BTC\nLitecoin-LTC\nBitcoin Cash-BCH\nDogecoin-DOGE\nStellar Lumens-XLM\nEthereum-ETH\nBitcoin Gold-BTG\n\n");
        jScrollPane3.setViewportView(RecentSearches1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BuyOneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BuyBothButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(6, 6, 6))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(FirstStock, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField5)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(SellOneButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(SellBothButton)
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addComponent(FinalMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SecondStock, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PriceButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SecondStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(PriceButton)
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClearButton)
                            .addComponent(BuyOneButton)
                            .addComponent(SellOneButton)
                            .addComponent(BuyBothButton)
                            .addComponent(SellBothButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FinalMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FirstStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstStockActionPerformed
        
 
        tmp.getStockPrice(FirstStock.getText());
        
    }//GEN-LAST:event_FirstStockActionPerformed
public void actionPerformed (ActionEvent event){
   
}
    private void PriceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceButtonActionPerformed
        
            double  x = tmp.getStockPrice(FirstStock.getText());
            double y = tmp.getStockPrice(SecondStock.getText());
            jTextField2.setText(String.valueOf(fmt.format(x)));
             jTextField5.setText(String.valueOf(fmt.format(y)));
             RecentSearches.append(FirstStock.getText()+ " ," + SecondStock.getText() + "\n");
        
            
        
        
        
       
    
    }//GEN-LAST:event_PriceButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        FirstStock.setText("");
        jTextField2.setText("");
        FinalMessage.setText("");
        RecentSearches.setText("");
        SecondStock.setText("");
        jTextField5.setText("");
        
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void BuyOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyOneButtonActionPerformed
        tmp.buyStock(FirstStock.getText(), ABORT);
        FinalMessage.setText("Congratulations, you bought " + FirstStock.getText() + " stock!");
        double  x = tmp.getStockPrice(FirstStock.getText());
                  
       jTextField2.setText(String.valueOf(fmt.format(x)));
       
    }//GEN-LAST:event_BuyOneButtonActionPerformed

    private void SellOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellOneButtonActionPerformed
        try {
            tmp.sellStock(FirstStock.getText(), ABORT);
            FinalMessage.setText("Congratulations, you sold your " + FirstStock.getText() + " stock!");
            double  x = tmp.getStockPrice(FirstStock.getText());
            jTextField2.setText(String.valueOf(fmt.format(x)));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Stocks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SellOneButtonActionPerformed

    private void SecondStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondStockActionPerformed
      
    }//GEN-LAST:event_SecondStockActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void BuyBothButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyBothButtonActionPerformed
        tmp.buyStock(FirstStock.getText(), ABORT);
        tmp.buyStock(SecondStock.getText(), ABORT);
        FinalMessage.setText("Congratulations, you bought " + FirstStock.getText() + ", and " + SecondStock.getText() + " stocks!");
        double  x = tmp.getStockPrice(FirstStock.getText());
        double y = tmp.getStockPrice(SecondStock.getText());
                  
       jTextField2.setText(String.valueOf(fmt.format(x)));
       jTextField5.setText(String.valueOf(fmt.format(y)));
    }//GEN-LAST:event_BuyBothButtonActionPerformed

    private void SellBothButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellBothButtonActionPerformed
        try {
            tmp.sellStock(FirstStock.getText(), ABORT);       
            tmp.sellStock(SecondStock.getText(), ABORT);
            FinalMessage.setText("Congratulations, you sold " + FirstStock.getText() + ", and " + SecondStock.getText() + " stocks!");
            double  x = tmp.getStockPrice(FirstStock.getText());
              double y = tmp.getStockPrice(SecondStock.getText());
                  
       jTextField2.setText(String.valueOf(fmt.format(x)));
       jTextField5.setText(String.valueOf(fmt.format(y)));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Stocks.class.getName()).log(Level.SEVERE, null, ex);
        }

       
    }//GEN-LAST:event_SellBothButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuyBothButton;
    private javax.swing.JButton BuyOneButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JTextField FinalMessage;
    private javax.swing.JTextField FirstStock;
    private javax.swing.JButton PriceButton;
    private javax.swing.JTextArea RecentSearches;
    private javax.swing.JTextArea RecentSearches1;
    private javax.swing.JTextField SecondStock;
    private javax.swing.JButton SellBothButton;
    private javax.swing.JButton SellOneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
