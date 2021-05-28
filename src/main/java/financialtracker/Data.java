package financialtracker;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Data
{
    //File path is temporarily set to desktop
    private File desktop = new File(System.getProperty("user.home"), "/Desktop");

    private String incomeFileName = "Income.txt";
    public File incomeFile = new File(desktop, incomeFileName);

    private String expenseFileName = "Expense.txt";
    public File expenseFile = new File(desktop, expenseFileName);

    private String stockFileName = "Stocks.txt";
    public File stockFile = new File(desktop, stockFileName);



    public void storeIncome(Object i)
    {
        store(i, incomeFile);
    }

    public void storeExpense(Object i)
    {
        store(i, expenseFile);
    }

    public void storeStock(Object i)
    {
        store(i, stockFile);
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



    private void overwriteIncomeExpense(ArrayList<Object> i, File f, Object o)
    {
        try
        {
            if (!f.exists())
                f.createNewFile();

            FileWriter out = new FileWriter(f, true);

            int index = 0;
            boolean deleted = false;

            //Loop through all objects
            //If the object is not equal to the object we want to remove then write to the file
            for (int j = 0; j < i.size(); j++)
            {
                if (!i.get(j).toString().equals(o.toString()))
                    out.write(i.get(j).toString() + "\n");
                else
                    break;
            }

            out.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private void overwriteStock(ArrayList<Object> i, File f, Object o)
    {
        try
        {
            if (!f.exists())
                f.createNewFile();

            FileWriter out = new FileWriter(f, true);

            int index = 0;
            boolean deleted = false;

            //Loop through all objects
            //If the object is not equal to the object we want to remove then write to the file
            for (int j = 0; j < i.size(); j++)
            {
                if (i.get(j).toString().equals(o.toString()))
                {
                    System.out.println(i.get(j).toString());
                    index = i.indexOf(i.get(j));
                    System.out.println(index);
                    break;
                }
            }

            for (int j = 0; j < i.size(); j++)
            {
                if (!(j >= (index - 1) && j <= (index + 2)))
                {
                    out.write(i.get(j).toString() + "\n");
                }
            }

            out.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }



    public void removeIncome(Object i) throws FileNotFoundException
    {
        ArrayList<Object> data = read(stockFile);

        clearFile(incomeFile);

        overwriteIncomeExpense(data, stockFile, i);
    }

    public void removeExpense(Object i) throws FileNotFoundException
    {
        ArrayList<Object> data = read(stockFile);

        clearFile(expenseFile);

        overwriteIncomeExpense(data, stockFile, i);
    }

    public void removeStock(Object i) throws FileNotFoundException
    {
        //Store the original data
        ArrayList<Object> data = read(stockFile);

        //Clear the file
        PrintWriter writer = new PrintWriter(stockFile);
        writer.print("");
        writer.close();

        //Store all the data except the object we want to remove
        overwriteStock(data, stockFile, i);
    }

    public void clearFile(File f) throws FileNotFoundException
    {
        PrintWriter writer = new PrintWriter(f);
        writer.print("");
        writer.close();
    }



    public ArrayList<Object> readIncome()
    {
        return read(incomeFile);
    }

    public ArrayList<Object> readExpense()
    {
        return read(expenseFile);
    }

    public ArrayList<Object> readStock()
    {
        return read(stockFile);
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
