package financialtracker;

import java.io.FileNotFoundException;

public class FinancialTracker
{
    public static void main(String[] args) throws FileNotFoundException
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FintUI().setVisible(true);
                new PopNotification().setVisible(true);
            }
        });
    }
}
