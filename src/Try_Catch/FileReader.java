package Try_Catch;
import java.util.*;
import java.io.*;
public class FileReader
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        String fileData = "";
        Scanner inputFile = null;


        System.out.println("Please enter the name of the file [text (.txt) file only]: ");
        String fileName = keyboard.nextLine();
        File file = new File(fileName);

        try
        {
            inputFile = new Scanner(file);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found!");
        }

        System.out.println("-DATA----------------------------------");

        while (inputFile.hasNext())
        {
            fileData = inputFile.nextLine();
            System.out.println(fileData);
        }

        System.out.println("----------------------------------DATA-");

        for(int i = 0; i < fileData.length(); i++)
        {
            count++;
        }

        System.out.println("\nTotal characters: " + count);

        do
        {
            System.out.println("\nFile reading is complete!");
        }while(fileData == "");

        inputFile.close();
    }
}
