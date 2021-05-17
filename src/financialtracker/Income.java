/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialtracker;

/**
 *
 * @author rogervalade
 */

public class Income 
{
    
    private double income = 0.0;
    private double wage = 0.0;
    private double[] hours = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
    private double overtimeMult = 1.5;
    
    public double getIncome() {
        return income;
    }
    
    public void setIncome(double newIncome) {
        assert(newIncome >= 0.0) : "newIncome cannot be negative";
        this.income = newIncome;
    }
    
    public double getWage() {
        return wage;
    }
    
    public void setWage(double newWage) {
        assert(newWage >= 0.0) : "newWage cannot be negative";
        this.wage = newWage;
    }
    
    public double[] getHours() {
        return hours;
    }
    
    public void setHours(double newHours[]) 
    {
        assert(newHours != null) : "newHours is null";
        assert(newHours.length <= 7) : "Weeks are only 7 days";
        this.hours = newHours;
    }
    
    public double getOvertime() {
        return overtimeMult;
    }
    
    public void setOvertime(double newOvertime) {
        this.overtimeMult = newOvertime;
    }
    
    public void updateIncome(double wage, double overtimeMult) 
    {
        income = 0.0;
        for (int i = 0; i < hours.length; i++) 
        {
            double tempHours = hours[i];
            if (hours[i] > 8) 
            {
                double overtime = hours[i] - 8.0;
                tempHours -= overtime;
                income += (overtime * wage * overtimeMult);
            }
            income += (tempHours * wage);
        }
    }
    
    
}
