package financialtracker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Data
{
    //File path is temporarily set to desktop
    private File desktop = new File(System.getProperty("user.home"), "/Desktop");

    private String incomeFileName = "Income.txt";
    private File incomeFile = new File(desktop, incomeFileName);

    private String expenseFileName = "Expense.txt";
    private File expenseFile = new File(desktop, expenseFileName);



    public void storeIncome(Object i)
    {
        store(i, incomeFile);
    }

    public void storeExpense(Object i)
    {
        store(i, expenseFile);
    }

    private void store(Object i, File f)
    {
        try
        {
            if (!f.exists())
                f.createNewFile();

            FileWriter out = new FileWriter(f, true);
            out.write(i.toString() + "\n");
            out.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }



    public ArrayList<Object> readIncome()
    {
        return read(incomeFile);
    }

    public ArrayList<Object> readExpense()
    {
        return read(expenseFile);
    }

    private ArrayList<Object> read(File f)
    {
        ArrayList<Object> data = new ArrayList<>();
        int i = 0;

        try
        {
            Scanner in = new Scanner(f);
            while (in.hasNext())
            {
                data.add(in.nextLine());
                i++;
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        return data;
    }
}
