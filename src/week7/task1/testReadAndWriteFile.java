package week7.task1;

import java.io.*;
import java.nio.file.Files;


public class testReadAndWriteFile {
    public static void main(String[] args) {
        FileReader fr;
        String a = "";
        try {
             fr = new FileReader("src/week9/FileData.txt");
             int i = 0;
             while ((i = fr.read()) != -1) {
                 a = a + (char)i;
             }
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(a);
    }
}
