package ie.atu;

import java.io.*;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String myFile = keyboard.nextLine();
        try
        {
            Scanner inputFile = new Scanner(new File(myFile));
            while (inputFile.hasNextLine()){
                System.out.println(inputFile.nextLine());
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
