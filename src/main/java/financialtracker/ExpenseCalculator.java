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
   
   // private instance variables
   private double dailyExpense;
   private double groceries;
   private double gas;
   private double entertainment;
   private double electricity;
   private double consumersEnergy;
   private double otherMonthlyExpenses;
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
   * @return groceries
   */
   public double getGroceries() {
       return groceries;
   }

   /**
   *
   * @param groceries
   */
   public void setGroceries(double groceries) {
       assert (groceries >= 0.0) : "groceries cannot be negative";
       this.groceries = groceries;
   }
   
   /**
   *
   * @return gas
   */
   public double getGas() {
       return gas;
   }

   /**
   *
   * @param gas
   */
   public void setGas(double gas) {
       assert (gas >= 0.0) : "gas cannot be negative";
       this.gas = gas;
   }
   
   /**
   *
   * @return entertainment
   */
   public double getEntertainment() {
       return entertainment;
   }

   /**
   *
   * @param entertainment
   */
   public void setEntertainment(double entertainment) {
       assert (entertainment >= 0.0) : "entertainment cannot be negative";
       this.entertainment = entertainment;
   }
   
   /**
   *
   * @return electricity
   */
   public double getElectricity() {
       return electricity;
   }

   /**
   *
   * @param electricity
   */
   public void setElectricity(double electricity) {
       assert (electricity >= 0.0) : "electricity cannot be negative";
       this.electricity = electricity;
   }
   
    /**
   *
   * @return consumersEnergy
   */
   public double getConsumersEnergy() {
       return consumersEnergy;
   }

   /**
   *
   * @param consumersEnergy
   */
   public void setConsumersEnergy(double consumersEnergy) {
       assert (consumersEnergy >= 0.0) : "Consumers Energy cannot be negative";
       this.consumersEnergy = consumersEnergy;
   }
   
   /**
   *
   * @return otherMonthlyExpenses
   */
   public double getotherMonthlyExpenses() {
       return otherMonthlyExpenses;
   }

   /**
   *
   * @param otherMonthlyExpenses
   */
   public void setOtherMonthlyExpenses(double otherMonthlyExpenses) {
       assert (otherMonthlyExpenses >= 0.0) : "Other Monthly Expenses cannot "
               + "be negative";
       this.otherMonthlyExpenses = otherMonthlyExpenses;
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
   * @param groceries
   * @param gas
   * @param entertainment
   * @param electricity
   * @param consumersEnergy
   * @param otherMonthlyExpenses
   * @param medicalExpense
   * @param tax

   */
   public void updateExpense(double dailyExpense, double groceries, double gas,
           double entertainment, double electricity, double consumersEnergy,
           double otherMonthlyExpenses, double medicalExpense, double tax) {
       this.dailyExpense += dailyExpense;
       this.groceries += groceries;
       this.gas += gas;
       this.entertainment += entertainment;
       this.electricity += electricity;
       this.consumersEnergy += consumersEnergy;
       this.otherMonthlyExpenses += otherMonthlyExpenses;
       this.medicalExpense += medicalExpense;
       this.tax += tax;
   }
   public void updateExpense (double dailyExpense, double groceries){
       this.dailyExpense += dailyExpense;
       this.groceries += groceries;
   }
   public void updateExpense (double dailyExpense, double groceries, double gas){
       this.dailyExpense += dailyExpense;
       this.groceries += groceries;
       this.gas += gas;
   }
   public void updateExpense (double dailyExpense, double groceries, double gas,
           double entertainment){
       this.dailyExpense += dailyExpense;
       this.groceries += groceries;
       this.gas += gas;
       this.entertainment += entertainment;
   }
   public void updateExpense (double dailyExpense, double groceries, double gas,
           double entertainment, double electricity){
       this.dailyExpense += dailyExpense;
       this.groceries += groceries;
       this.gas += gas;
       this.entertainment += entertainment;
       this.electricity += electricity;
   }
   public void updateExpense (double dailyExpense, double groceries, double gas,
           double entertainment, double electricity, double consumersEnergy){
       this.dailyExpense += dailyExpense;
       this.groceries += groceries;
       this.gas += gas;
       this.entertainment += entertainment;
       this.electricity += electricity;
       this.consumersEnergy += consumersEnergy;   
   }
   public void updateExpense (double dailyExpense, double groceries, double gas,
           double entertainment, double electricity, double consumersEnergy,
           double otherMonthlyExpenses){
       this.dailyExpense += dailyExpense;
       this.groceries += groceries;
       this.gas += gas;
       this.entertainment += entertainment;
       this.electricity += electricity;
       this.consumersEnergy += consumersEnergy;
       this.otherMonthlyExpenses += otherMonthlyExpenses;
   }
     public void updateExpenseNoTax (double dailyExpense, double groceries, 
             double gas, double entertainment, double electricity, 
             double consumersEnergy, double otherMonthlyExpenses,
             double medicalExpense){
       this.dailyExpense += dailyExpense;
       this.groceries += groceries;
       this.gas += gas;
       this.entertainment += entertainment;
       this.electricity += electricity;
       this.consumersEnergy += consumersEnergy;
       this.otherMonthlyExpenses += otherMonthlyExpenses;
       this.medicalExpense += medicalExpense;
   }  
     public void updateExpenseNoMedical (double dailyExpense, double groceries, 
             double gas, double entertainment, double electricity, 
             double consumersEnergy, double otherMonthlyExpenses, double tax){
       this.dailyExpense += dailyExpense;
       this.groceries += groceries;
       this.gas += gas;
       this.entertainment += entertainment;
       this.electricity += electricity;
       this.consumersEnergy += consumersEnergy;
       this.otherMonthlyExpenses += otherMonthlyExpenses;
       this.tax += tax;
   }

   /**
   *
   * @return total expense = sum of dailyExpense,groceries,gas,entertainment,
   * electricity,consumersEnergy,otherMonthlyExpenses,medicalExpense,and tax
   */
   public double getTotalExpense() {
       
       double totalExpense = 0;
       
       if (medicalExpense == 0 && tax == 0){
           totalExpense = dailyExpense + groceries + gas + entertainment + 
                  electricity + consumersEnergy + otherMonthlyExpenses;
       }else if (medicalExpense ==0){
           totalExpense = dailyExpense + groceries + gas + entertainment + 
                  electricity + consumersEnergy + otherMonthlyExpenses +tax ;
       }else if (tax == 0){
           totalExpense = dailyExpense + groceries + gas + entertainment + 
                  electricity + consumersEnergy + otherMonthlyExpenses + 
                   medicalExpense;
       } else{
          totalExpense = dailyExpense + groceries + gas + entertainment + 
                  electricity + consumersEnergy + otherMonthlyExpenses + 
                  medicalExpense +tax ; 
       }
       
       
       return totalExpense;
   }
}
