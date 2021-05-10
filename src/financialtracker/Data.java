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
    private String fileName = "Data.txt";
    private File file = new File(desktop, fileName);



    public void store(Object i)
    {
        try
        {
            if (!file.exists())
                file.createNewFile();

            FileWriter out = new FileWriter(file, true);
            out.write(i.toString() + "\n");
            out.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }



    public ArrayList<Object> read()
    {
        ArrayList<Object> data = new ArrayList<>();
        int i = 0;

        try
        {
            Scanner in = new Scanner(file);
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
