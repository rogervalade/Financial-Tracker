package financialtracker;

import java.io.IOException;
import java.util.ArrayList;

public class ExpenseCalculator
{

/**
*
* @author brittanyzora
*
*/
public class ExpenseCalculator {
   // private instance variables
   private double dailyExpense;
   private double monthlyBills;
   private double medicalExpense;
   private double tax;

   /**
   *
   * @return dailyExpense
   */
   public double getDailyExpense() {
       return dailyExpense;
   }

   /**
   *
   * @param dailyExpense
   */
   public void setDailyExpense(double dailyExpense) {
       assert (dailyExpense >= 0.0) : "daily expense cannot be negative";
       this.dailyExpense = dailyExpense;
   }

   /**
   *
   * @return monthlyBills
   */
   public double getMonthlyBills() {
       return monthlyBills;
   }

   /**
   *
   * @param monthlyBills
   */
   public void setMonthlyBills(double monthlyBills) {
       assert (monthlyBills >= 0.0) : "monthly bills cannot be negative";
       this.monthlyBills = monthlyBills;
   }

   /**
   *
   * @return medicalExpense
   */
   public double getMedicalExpense() {
       return medicalExpense;
   }

   /**
   *
   * @param medicalExpense
   */
   public void setMedicalExpense(double medicalExpense) {
       assert (medicalExpense >= 0.0) : "medicalExpense cannot be negative";
       this.medicalExpense = medicalExpense;
   }

   /**
   *
   * @return tax
   */
   public double getTax() {
       return tax;
   }

   /**
   *
   * @param tax
   */
   public void setTax(double tax) {
       assert (tax >= 0.0) : "tax cannot be negative";
       this.tax = tax;
   }

   /**
   *
   * @param dailyExpense
   * @param monthlyBills
   * @param medicalExpense
   * @param tax
   */
   public void updateExpense(double dailyExpense, double monthlyBills, double medicalExpense, double tax) {
       this.dailyExpense += dailyExpense;
       this.monthlyBills += monthlyBills;
       this.medicalExpense += medicalExpense;
       this.tax += tax;
   }

   /**
   *
   * @return total expense = sum of dailyExpense,monthlyBills,medicalExpense and
   * tax
   */
   public double getTotalExpense() {
       double totalExpense = 0;
       totalExpense = getDailyExpense() + getMonthlyBills() + getMedicalExpense() + getTax();
       return totalExpense;
   }
}
