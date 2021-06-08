package financialtracker;

/**
 *
 * @author fdynsn
 */
public class tax {

   private double income;
    protected double[] rate = {0.10, 0.12, .22, 0.24, 0.32, 0.35, .39};
    final double stateTax = .0425;
    private double fedTotal;
    private double fedRate;
    private double st;
    private double tt;

    public double getIncome() {
        return income;
    }

    public void setIncome(double newIncome) {
        assert (newIncome >= 0);
        this.income = newIncome;
    }

    public double getFedTaxRate(double income) {
        if (income <= 9700) {
            fedRate = rate[0];
        } else if ((income >= 9701) && (income <= 39475)) {
            if (income <= 39475) {
                fedRate = rate[1];
            }
        } else if ((income >= 39476) && (income <= 84200)) {
            if (income <= 84200) {
                fedRate = rate[2];
            }
        } else if ((income >= 84200) && (income <= 160725)) {
            if (income <= 160725) {
                fedRate = rate[3];
            }
        } else if ((income >= 160725) && (income <= 204100)) {
            if (income <= 204100) {
                fedRate = rate[4];
            }
        } else if ((income >= 204100) && (income <= 510300)) {
            if (income <= 510300) {
                fedRate = rate[5];
            } else if ((income > 510301)) {
                fedRate = rate[6];
            }
        }
        return fedRate;
    }

    public void setFedRate(double fedTax) {
        assert (fedTax >= 0);
        this.fedRate = fedTax;
    }

    public double calcFedTax(double income) {
        if (income <= 9700) {
            fedTotal = rate[0] * income;

        } else if ((income >= 9701) && (income <= 39475)) {
            if (income <= 39475) {
                fedTotal = rate[1] * (income - 9700) + (rate[0] * 9700);

            }
        } else if ((income >= 39476) && (income <= 84200)) {
            if (income <= 84200) {
                fedTotal = rate[2] * (income - 39475) + rate[1] * (income - 9700) + (rate[0] * 9700);

            }
        } else if ((income >= 84200) && (income <= 160725)) {
            if (income <= 160725) {
                fedTotal = rate[3] * (income - 84200) + rate[2] * (income - 39475) + rate[1] * (income - 9700) + (rate[0] * 9700);

            }
        } else if ((income >= 160725) && (income <= 204100)) {
            if (income <= 204100) {
                fedTotal = rate[4] * (income - 160725) + rate[3] * (income - 84200) + rate[2] * (income - 39475) + rate[1] * (income - 9700) + (rate[0] * 9700);

            }
        } else if ((income >= 204100) && (income <= 510300)) {
            if (income <= 510300) {
                fedTotal = rate[5] * (income - 204100) + rate[4] * (income - 160725) + rate[3] * (income - 84200) + rate[2] * (income - 39475) + rate[1] * (income - 9700) + (rate[0] * 9700);

            } else if ((income > 510301)) {

                fedTotal = rate[6] * (income - 510300) + rate[5] * (income - 204100) + rate[4] * (income - 160725) + rate[3] * (income - 84200) + rate[2] * (income - 39475) + rate[1] * (income - 9700) + (rate[0] * 9700);

            }

        }
        return fedTotal;

    }

    public void setFedTotal(double newFedTax) {
        this.fedTotal = newFedTax;
    }

    public double calcStateTax(double income) {
        st = income * stateTax;
        return st;
    }

    public void setStateTax(double newStateTax) {
        this.st = newStateTax;
    }

    public double calcTotalTax(double income) {
        tt = (stateTax * income) + fedTotal;
        return tt;
    }
}
