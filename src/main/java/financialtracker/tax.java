package financialtracker;

/**
 *
 * @author fdynsn
 */
public class tax {

    private double income;
    protected double[] rate = {0.10, 0.12, .22, 0.24, 0.32, 0.35, .39};
    private double stateTax = .0425;
    private double fedTotal;
    private double ft;
    private double st;
    private double tt;

    public double getIncome() {
        return income;
    }

    public void setIncome(double newIncome) {
        assert (newIncome >= 0);
        this.income = newIncome;
    }

    public double getFedTax() {
        if (income <= 9700) {
            ft = rate[0];
        } else if ((income >= 9701) && (income <= 39475)) {
            if (income <= 39475) {
                ft = rate[1];
            }
        } else if ((income >= 39476) && (income <= 84200)) {
            if (income <= 84200) {
                ft = rate[2];
            }
        } else if ((income >= 84200) && (income <= 160725)) {
            if (income <= 160725) {
                ft = rate[3];
            }
        } else if ((income >= 160725) && (income <= 204100)) {
            if (income <= 204100) {
                ft = rate[4];
            }
        } else if ((income >= 204100) && (income <= 510300)) {
            if (income <= 510300) {
                ft = rate[5];
            } else if ((income >= 510301)) {
                ft = rate[6];
            }
        }
        return ft;
    }

    public void setFedTax(double fedTax) {
        assert (fedTax >= 0);
        this.ft = fedTax;
    }

    public double calcFedTax() {
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
            } else if ((income >= 510301)) {
                fedTotal = rate[6] * (income - 510300) + rate[5] * (income - 204100) + rate[4] * (income - 160725) + rate[3] * (income - 84200) + rate[2] * (income - 39475) + rate[1] * (income - 9700) + (rate[0] * 9700);

            }

        }
        return fedTotal;

    }

    public void setFed(double newFedTax) {
        assert (newFedTax >= 0);
        this.fedTotal = newFedTax;
    }

    public double calcStateTax() {
        st = income * stateTax;
        return 0;
    }

    public void setStateTax(double newStateTax) {
        this.st = newStateTax;
    }

    public void calcTotalTax() {
        tt = (ft + stateTax) * income;
    }
}
