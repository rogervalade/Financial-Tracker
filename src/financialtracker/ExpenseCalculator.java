package financialtracker;

import java.io.IOException;
import java.util.ArrayList;

public class ExpenseCalculator
{
    public static void main(String[] args ) throws IOException
    {
        Data data = new Data();
        ArrayList<Object> expenses = data.readExpense();




        int weeklyExpense = 0;

        FileReader fileReader = new FileReader("D:\\expenses.txt");

        BufferedReader brReadFile = new BufferedReader(fileReader);
        String singleLineText = null;

        System.out.println("Expense Calculator :");
        System.out.println("\t Day \tTotal Expenses ");
        System.out.println("\t --- ----------------");

        while((singleLineText = brReadFile.readLine()) != null)
        {
            String[] extractData = singleLineText.split(",");
            System.out.print("\t"+ extractData[0]);

            int totalExpensePerDay = 0;
            for(int i=1;i< extractData.length;i++)
                totalExpensePerDay += Integer.parseInt(extractData[i]);

            System.out.println("\t" + totalExpensePerDay);
            weeklyExpense += totalExpensePerDay;

        }

        System.out.println("\n\nYou have spent Rs :"+ weeklyExpense+ " this week!");
        brReadFile.close();

        System.out.println("\n\nEnd of program ....");
    }
}
