/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialtracker;

/**
 *
 * @author shubh
 */
public class IncomeCalculator {

    private double income;
    private double wage;
    protected double[] hours = new double [7];
    private double overtimeMult = 1.5;

    public double getIncome() {
        return income;
    }

    public void setIncome(double newIncome) {
        assert (newIncome >= 0.0) : "newIncome cannot be negative";
        this.income = newIncome;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double newWage) {
        assert (newWage >= 0.0) : "newWage cannot be negative";
        this.wage = newWage;
    }

    public double[] getHours() {
        return hours;
    }

    public void setHours(double newHours[]) {
        assert (newHours != null) : "newHours is null";
        assert (newHours.length <= 7) : "Weeks are only 7 days";
        this.hours = newHours;
    }

    public double getOvertime() {
        return overtimeMult;
    }

    public void setOvertime(double newOvertime) {
        this.overtimeMult = newOvertime;
    }

    public void updateIncome(double wage, double[] tempHours) 
    {
        income = 0.0;
        for (int i = 0; i < tempHours.length; i++) 
        {
            double currentHours = tempHours[i];
            if (tempHours[i] > 8) 
            {
                double overtime = tempHours[i] - 8.0;
                currentHours -= overtime;
                income += (overtime * wage * getOvertime());
            }
            income += (currentHours * wage);
        }
    }

}
