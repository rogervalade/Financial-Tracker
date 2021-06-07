package financialtracker;

import java.awt.*;
import javax.swing.*;

public class FintUI extends javax.swing.JFrame {

  
    //This is to change color when you click each button on the side. 
    private void setColor(JPanel pane){
        pane.setBackground(new Color (41,57,80));
    }
    private void resetColor (JPanel []pane){
        for (int i = 0; i < pane.length; i++){
            pane[i].setBackground(new Color(23,35,51));
        }
    }
    
    
    
    
    public FintUI() {
        initComponents();
        
        //When the Program is started, the first window is Home. 
        
        Home window = new Home ();
        SwitchWindow.add(window).setVisible(true);
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SidePanel = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        HomeLabel = new javax.swing.JLabel();
        IncomePanel = new javax.swing.JPanel();
        IncomeLabel = new javax.swing.JLabel();
        ExpensePanel = new javax.swing.JPanel();
        ExpenseLabel = new javax.swing.JLabel();
        StocksPanel = new javax.swing.JPanel();
        StocksLabel = new javax.swing.JLabel();
        TopPanel = new javax.swing.JPanel();
        EixtLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MisPanel = new javax.swing.JPanel();
        MisTitlePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        SwitchWindow = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        SidePanel.setBackground(new java.awt.Color(23, 35, 51));
        SidePanel.setPreferredSize(new java.awt.Dimension(110, 500));

        HomePanel.setBackground(new java.awt.Color(41, 57, 80));
        HomePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomePanel.setPreferredSize(new java.awt.Dimension(110, 45));
        HomePanel.setRequestFocusEnabled(false);
        HomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomePanelMousePressed(evt);
            }
        });

        HomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        HomeLabel.setText("HOME");

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(HomeLabel))
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(HomeLabel)
                .addGap(19, 19, 19))
        );

        IncomePanel.setBackground(new java.awt.Color(23, 35, 51));
        IncomePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IncomePanel.setPreferredSize(new java.awt.Dimension(110, 45));
        IncomePanel.setRequestFocusEnabled(false);
        IncomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IncomePanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IncomePanelMousePressed(evt);
            }
        });

        IncomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IncomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        IncomeLabel.setText("INCOME");

        javax.swing.GroupLayout IncomePanelLayout = new javax.swing.GroupLayout(IncomePanel);
        IncomePanel.setLayout(IncomePanelLayout);
        IncomePanelLayout.setHorizontalGroup(
            IncomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(IncomeLabel))
        );
        IncomePanelLayout.setVerticalGroup(
            IncomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(IncomeLabel)
                .addGap(20, 20, 20))
        );

        ExpensePanel.setBackground(new java.awt.Color(23, 35, 51));
        ExpensePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExpensePanel.setPreferredSize(new java.awt.Dimension(110, 45));
        ExpensePanel.setRequestFocusEnabled(false);
        ExpensePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExpensePanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExpensePanelMousePressed(evt);
            }
        });

        ExpenseLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExpenseLabel.setForeground(new java.awt.Color(255, 255, 255));
        ExpenseLabel.setText("EXPENSES");

        javax.swing.GroupLayout ExpensePanelLayout = new javax.swing.GroupLayout(ExpensePanel);
        ExpensePanel.setLayout(ExpensePanelLayout);
        ExpensePanelLayout.setHorizontalGroup(
            ExpensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpensePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ExpenseLabel)
                .addGap(96, 96, 96))
        );
        ExpensePanelLayout.setVerticalGroup(
            ExpensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpensePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExpenseLabel)
                .addGap(19, 19, 19))
        );

        StocksPanel.setBackground(new java.awt.Color(23, 35, 51));
        StocksPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StocksPanel.setPreferredSize(new java.awt.Dimension(110, 45));
        StocksPanel.setRequestFocusEnabled(false);
        StocksPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StocksPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StocksPanelMousePressed(evt);
            }
        });

        StocksLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StocksLabel.setForeground(new java.awt.Color(255, 255, 255));
        StocksLabel.setText("STOCKS");

        javax.swing.GroupLayout StocksPanelLayout = new javax.swing.GroupLayout(StocksPanel);
        StocksPanel.setLayout(StocksPanelLayout);
        StocksPanelLayout.setHorizontalGroup(
            StocksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StocksPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(StocksLabel))
        );
        StocksPanelLayout.setVerticalGroup(
            StocksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StocksPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(StocksLabel)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IncomePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExpensePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StocksPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(HomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IncomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExpensePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StocksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        TopPanel.setBackground(new java.awt.Color(71, 120, 197));
        TopPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        TopPanel.setPreferredSize(new java.awt.Dimension(890, 50));
        TopPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TopPanelMouseDragged(evt);
            }
        });
        TopPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TopPanelMousePressed(evt);
            }
        });

        EixtLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EixtLabel.setForeground(new java.awt.Color(255, 255, 255));
        EixtLabel.setText("EXIT");
        EixtLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EixtLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EixtLabelMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FINT");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 812, Short.MAX_VALUE)
                .addComponent(EixtLabel)
                .addContainerGap())
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(EixtLabel))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        MisPanel.setBackground(new java.awt.Color(71, 120, 197));
        MisPanel.setPreferredSize(new java.awt.Dimension(230, 450));

        MisTitlePanel.setBackground(new java.awt.Color(120, 168, 252));
        MisTitlePanel.setPreferredSize(new java.awt.Dimension(230, 59));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CALENDAR");

        javax.swing.GroupLayout MisTitlePanelLayout = new javax.swing.GroupLayout(MisTitlePanel);
        MisTitlePanel.setLayout(MisTitlePanelLayout);
        MisTitlePanelLayout.setHorizontalGroup(
            MisTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MisTitlePanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MisTitlePanelLayout.setVerticalGroup(
            MisTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        jCalendar1.setBackground(new java.awt.Color(0, 204, 204));
        jCalendar1.setPreferredSize(new java.awt.Dimension(230, 450));

        javax.swing.GroupLayout MisPanelLayout = new javax.swing.GroupLayout(MisPanel);
        MisPanel.setLayout(MisPanelLayout);
        MisPanelLayout.setHorizontalGroup(
            MisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MisPanelLayout.createSequentialGroup()
                .addGroup(MisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MisTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MisPanelLayout.setVerticalGroup(
            MisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MisPanelLayout.createSequentialGroup()
                .addComponent(MisTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 211, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SwitchWindowLayout = new javax.swing.GroupLayout(SwitchWindow);
        SwitchWindow.setLayout(SwitchWindowLayout);
        SwitchWindowLayout.setHorizontalGroup(
            SwitchWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        SwitchWindowLayout.setVerticalGroup(
            SwitchWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(SwitchWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SwitchWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EixtLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EixtLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_EixtLabelMouseClicked
int x,y;
    private void TopPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopPanelMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_TopPanelMousePressed

    private void TopPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopPanelMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_TopPanelMouseDragged

    private void HomePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMousePressed
        setColor(HomePanel);
        resetColor (new JPanel[]{IncomePanel, StocksPanel, ExpensePanel});
    }//GEN-LAST:event_HomePanelMousePressed

    private void IncomePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncomePanelMousePressed
        setColor(IncomePanel);
        resetColor (new JPanel[]{HomePanel, StocksPanel, ExpensePanel});
    }//GEN-LAST:event_IncomePanelMousePressed

    private void ExpensePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpensePanelMousePressed
        setColor(ExpensePanel);
        resetColor (new JPanel[]{HomePanel, IncomePanel, StocksPanel});
    }//GEN-LAST:event_ExpensePanelMousePressed

    private void StocksPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StocksPanelMousePressed
        setColor(StocksPanel);
        resetColor (new JPanel[]{HomePanel, IncomePanel, ExpensePanel});
    }//GEN-LAST:event_StocksPanelMousePressed

    private void HomePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseClicked
      
        //Clicking the Home "button" changes the window
        
      SwitchWindow.removeAll();
      Home window = new Home ();
      SwitchWindow.add(window).setVisible(true);
    }//GEN-LAST:event_HomePanelMouseClicked

    private void IncomePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncomePanelMouseClicked
        
        SwitchWindow.removeAll();
        Income window = new Income();
        SwitchWindow.add(window).setVisible(true);
        
    }//GEN-LAST:event_IncomePanelMouseClicked

    private void ExpensePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpensePanelMouseClicked
        
        SwitchWindow.removeAll();
        Expenses window = new Expenses();
        SwitchWindow.add(window).setVisible(true);
        
    }//GEN-LAST:event_ExpensePanelMouseClicked

    private void StocksPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StocksPanelMouseClicked
        
        SwitchWindow.removeAll();
        Stocks window = new Stocks ();
        SwitchWindow.add(window).setVisible(true);
        
    }//GEN-LAST:event_StocksPanelMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EixtLabel;
    private javax.swing.JLabel ExpenseLabel;
    private javax.swing.JPanel ExpensePanel;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel IncomeLabel;
    private javax.swing.JPanel IncomePanel;
    private javax.swing.JPanel MisPanel;
    private javax.swing.JPanel MisTitlePanel;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel StocksLabel;
    private javax.swing.JPanel StocksPanel;
    private javax.swing.JDesktopPane SwitchWindow;
    private javax.swing.JPanel TopPanel;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
