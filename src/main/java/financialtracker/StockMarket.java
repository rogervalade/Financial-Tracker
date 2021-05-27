package financialtracker;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static financialtracker.CoinMarketCapApi.makeAPICall;

public class StockMarket
{
    private Data data = new Data();

    public double getStockPrice(String symbol)
    {
        String uri = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/info";
        List<NameValuePair> paratmers = new ArrayList<NameValuePair>();

        paratmers.add(new BasicNameValuePair("symbol", symbol));

        String priceString = "";
        double price = -1.0;

        try
        {
            String result = makeAPICall(uri, paratmers);

            int target = result.indexOf("price of");
            int decimal = 0;
            int start;
            int end;

            while (decimal < target || result.charAt(decimal) != '.')
            {
                decimal++;
            }

            start = decimal;
            end = decimal;

            while (result.charAt(start) != ' ')
            {
                start--;
            }

            start++;

            while (result.charAt(end) != ' ')
            {
                end++;
            }

            end--;

            while (start != end)
            {
                if (result.charAt(start) == ',')
                    start++;

                priceString = priceString + result.charAt(start);
                start++;
            }

            price = Double.parseDouble(priceString);
        }
        catch (IOException e)
        {
            System.out.println("Error: cannont access content - " + e.toString());
        }
        catch (URISyntaxException e)
        {
            System.out.println("Error: Invalid URL " + e.toString());
        }

        return price;
    }

    public void buyStock(String symbol, double amount)
    {
        double stockPrice = getStockPrice(symbol);

        double price = amount * stockPrice;

        data.storeStock(symbol);
        data.storeStock(amount);
        data.storeStock(stockPrice);
        data.storeStock(price);
    }

    public void sellStock(String symbol, double amount)
    {
        double stockPrice = getStockPrice(symbol);

        double price = amount * stockPrice;
    }
}

