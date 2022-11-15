package ie.atu;

import java.io.*;
import java.nio.file.Path;

public class CreateFile {
    public static void main(String[] args)
    {
        File myFile = new File("MyFile2.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());
        String content = "Details to write";
        try
        {
            PrintWriter myWriter = new PrintWriter(new FileWriter(myFile,true));
            myWriter.println("hello ");
            myWriter.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
