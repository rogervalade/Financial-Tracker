package financialtracker;

import java.io.FileNotFoundException;

public class FinancialTracker
{
    public static void main(String[] args) throws FileNotFoundException
    {
        StockMarket sm = new StockMarket();
        Data data = new Data();

        //sm.buyStock("BTC", 1);
        //sm.buyStock("BTC", 9);
        //sm.buyStock("BTC", 2);

        //System.out.println(sm.sellStock("BTC", 2));

        //data.removeStock(2.0);
    }
}
