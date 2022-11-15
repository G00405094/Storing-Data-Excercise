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
            FileWriter myWriter = new FileWriter(myFile,true);
            myWriter.write("hello");
            myWriter.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
