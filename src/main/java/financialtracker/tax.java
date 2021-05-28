package financialtracker;

import java.util.Scanner;

/**
 *
 * @author fdynsn
 */
public class tax {

    double income;
    private double fedTax;
    private double stateTax = .0425;

    public double getIncome() {
        return income;
    }

    public void setIncome(double newIncome) {
        this.income = newIncome;
    }

    public double getFedTax() {
        return fedTax;
    }

    public double getStateTax() {
        return stateTax;
    }

    static double calcTax(double income, double fedTax, double stateTax) {
        double tt;

        if (income <= 9700) {
            fedTax = income * .10;

        } else if ((income >= 9701) && (income <= 39475)) {
            if (income <= 39475) {
                fedTax = .12 * (income - 9700) + (.1 * 9700);
                tt = fedTax + stateTax;
            }
        } else if ((income >= 39476) && (income <= 84200)) {
            if (income <= 84200) {
                fedTax = .22 * (income - 39475) + .12 * (income - 9700) + (.1 * 9700);
                tt = fedTax * stateTax;
            }
        } else if ((income >= 84200) && (income <= 160725)) {
            if (income <= 160725) {
                fedTax = .24 * (income - 84200) + .22 * (income - 39475) + .12 * (income - 9700) + (.1 * 9700);
                tt = fedTax * stateTax;
            }
        } else if ((income >= 160725) && (income <= 204100)) {
            if (income <= 204100) {
                fedTax = .32 * (income - 160725) + .24 * (income - 84200) + .22 * (income - 39475) + .12 * (income - 9700) + (.1 * 9700);
                tt = fedTax * stateTax;
            }
        } else if ((income >= 204100) && (income <= 510300)) {
            if (income <= 510300) {
                fedTax = .35 * (income - 204100) + .32 * (income - 160725) + .24 * (income - 84200) + .22 * (income - 39475) + .12 * (income - 9700) + (.1 * 9700);
                tt = fedTax * stateTax;
            }
        }
        return 0;

    }
}
