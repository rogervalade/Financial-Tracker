package financialtracker;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.text.NumberFormat;
import javafx.scene.paint.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author shubh
 */
public class Income extends javax.swing.JInternalFrame {

    IncomeCalculator tmp = new IncomeCalculator();

    tax tmpo = new tax();

    NumberFormat fmt = NumberFormat.getCurrencyInstance();

    public Income() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        WageTxtField = new javax.swing.JTextField();
        HoursWorked = new javax.swing.JTextField();
        WeeklyIncome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        MonthlyIncome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        YearlyIncome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FederalTax = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        StateTax = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TotalTax = new javax.swing.JTextField();
        HourGraph = new javax.swing.JButton();
        IncomeGraph = new javax.swing.JButton();

        setBackground(new java.awt.Color(23, 35, 51));
        setPreferredSize(new java.awt.Dimension(660, 450));

        jPanel1.setBackground(new java.awt.Color(23, 35, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(660, 450));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Weekly Income:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hours Worked (Enter the hours worked in a week separated by commas. Strarting with Monday):");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hourly Wage:");

        jButton1.setBackground(new java.awt.Color(47, 70, 103));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Calculate");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(47, 70, 103));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        WageTxtField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        HoursWorked.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HoursWorked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoursWorkedActionPerformed(evt);
            }
        });

        WeeklyIncome.setEditable(false);
        WeeklyIncome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estimated Monthly Income:");

        MonthlyIncome.setEditable(false);
        MonthlyIncome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estimated Yearly Income:");

        YearlyIncome.setEditable(false);
        YearlyIncome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estimated Federal Tax:");

        FederalTax.setEditable(false);
        FederalTax.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        FederalTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FederalTaxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estimated State Tax:");

        StateTax.setEditable(false);
        StateTax.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Tax:");

        TotalTax.setEditable(false);
        TotalTax.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TotalTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalTaxActionPerformed(evt);
            }
        });

        HourGraph.setBackground(new java.awt.Color(47, 70, 103));
        HourGraph.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        HourGraph.setForeground(new java.awt.Color(255, 255, 255));
        HourGraph.setText("Hours Graph");
        HourGraph.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        HourGraph.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HourGraph.setPreferredSize(new java.awt.Dimension(99, 23));
        HourGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HourGraphActionPerformed(evt);
            }
        });

        IncomeGraph.setBackground(new java.awt.Color(47, 70, 103));
        IncomeGraph.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        IncomeGraph.setForeground(new java.awt.Color(255, 255, 255));
        IncomeGraph.setText("Income Graph");
        IncomeGraph.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        IncomeGraph.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IncomeGraph.setPreferredSize(new java.awt.Dimension(99, 23));
        IncomeGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncomeGraphActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HourGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(WageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(HoursWorked, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TotalTax, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(StateTax, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FederalTax, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(YearlyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(WeeklyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MonthlyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(131, 131, 131)
                            .addComponent(IncomeGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WageTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HoursWorked, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(WeeklyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HourGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MonthlyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IncomeGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(YearlyIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(FederalTax, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(StateTax, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TotalTax, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FederalTax.setText("");
        HoursWorked.setText("");
        MonthlyIncome.setText("");
        StateTax.setText("");
        WageTxtField.setText("");
        WeeklyIncome.setText("");
        YearlyIncome.setText("");
        TotalTax.setText("");


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            double x = Double.parseDouble(WageTxtField.getText());

            String s = HoursWorked.getText();
            String[] srevised = s.split(",", -2);
            double[] num = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

            for (int i = 0; i < srevised.length; i++) {
                num[i] = Double.parseDouble(srevised[i]);
            }

            tmp.updateIncome(x, num);

            double y = tmp.getIncome();

            WeeklyIncome.setText(String.valueOf(fmt.format(y)));

            MonthlyIncome.setText(String.valueOf(fmt.format(y * 4)));

            YearlyIncome.setText(String.valueOf(fmt.format(y * 52)));

            double YIncome = y * 52; //Finding yearly income based on the weekly income calculated

            tmpo.setIncome(YIncome);

            tmpo.setFedRate(tmpo.getFedTaxRate(YIncome));

            double FedTax = tmpo.calcFedTax(YIncome);

            double StTax = tmpo.calcStateTax(YIncome);

            double TT = tmpo.calcTotalTax(YIncome);

            FederalTax.setText(String.valueOf(fmt.format(FedTax)));
            StateTax.setText(String.valueOf(fmt.format(StTax)));
            TotalTax.setText(String.valueOf(fmt.format(TT)));

            WageTxtField.setText(String.valueOf(fmt.format(x)));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Occured: " + e.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HoursWorkedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoursWorkedActionPerformed


    }//GEN-LAST:event_HoursWorkedActionPerformed

    private void FederalTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FederalTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FederalTaxActionPerformed

    private void TotalTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalTaxActionPerformed

    private void HourGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HourGraphActionPerformed

        try{
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();

        
        String s = HoursWorked.getText();
        String[] srevised = s.split(",", -2);
        double[] num = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

        for (int i = 0; i < srevised.length; i++) {
            num[i] = Double.parseDouble(srevised[i]);
        }
        double x1 = num[0];
        double x2 = num[1];
        double x3 = num[2];
        double x4 = num[3];
        double x5 = num[4];
        double x6 = num[5];
        double x7 = num[6];

        barChartData.setValue(x1, "Hours", "Monday");
        barChartData.setValue(x2, "Hours", "Tuesday");
        barChartData.setValue(x3, "Hours", "Wednesday");
        barChartData.setValue(x4, "Hours", "Thursday");
        barChartData.setValue(x5, "Hours", "Friday");
        barChartData.setValue(x6, "Hours", "Saturday");
        barChartData.setValue(x7, "Hours", "Sunday");
        
        JFreeChart barChart = ChartFactory.createBarChart("Wage Graph", "Days", "Hours", barChartData);
//        CategoryPlot barchrt = barChart.getCategoryPlot();
//        barchrt.setRangeGridlinePaint(Color.ORANGE);
        ChartFrame frame = new ChartFrame("Wage Graph", barChart);
        frame.setVisible(true);
       frame.setSize(600,800);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error Occured: " + e.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_HourGraphActionPerformed

    private void IncomeGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncomeGraphActionPerformed

       try {
           
           DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
           
       
        double xYearly = (tmp.getIncome()) * 52;
        double xState = tmpo.calcStateTax(xYearly);
        double xFed = tmpo.calcFedTax(xYearly);
        double xTotalTax = tmpo.calcTotalTax(xYearly);
        double xRemain = xYearly - xTotalTax;
        
        barChartData.setValue(xYearly, "Dollars", "Est. Yearly Income");
        barChartData.setValue(xState, "Dollars", "Est. State Tax");
        barChartData.setValue(xFed, "Dollars", "Est. Federal Tax");
        barChartData.setValue(xTotalTax, "Dollars", "Est. Total Tax");
        barChartData.setValue(xRemain, "Dollars", "Remaining Income");
                
        
        JFreeChart barChart = ChartFactory.createBarChart("Income Graph", "Criterias", "Dollars", barChartData);
        
        ChartFrame frame = new ChartFrame ("Income Graph",barChart);
        frame.setVisible(true);
        frame.setSize(600,800);
        
        
       } catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error Occured: " + e.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
       }
        
        
        
    }//GEN-LAST:event_IncomeGraphActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FederalTax;
    private javax.swing.JButton HourGraph;
    private javax.swing.JTextField HoursWorked;
    private javax.swing.JButton IncomeGraph;
    private javax.swing.JTextField MonthlyIncome;
    private javax.swing.JTextField StateTax;
    private javax.swing.JTextField TotalTax;
    private javax.swing.JTextField WageTxtField;
    private javax.swing.JTextField WeeklyIncome;
    private javax.swing.JTextField YearlyIncome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
