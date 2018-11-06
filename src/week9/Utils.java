package week9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Utils {

    public static String readContentFromFile(String path){
        FileInputStream fr;
        String a = "";
        try {
            fr = new FileInputStream(path);
            int i = 0;
            while ((i = fr.read()) != -1) {
                a = a + (char)i;
            }
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        File f = new File(path);
        boolean fileIsEmpty = f.exists() && f.length() == 0;

        return a;
    }

    public static void writeContentToFile(String path, String contents){
        FileOutputStream fo;
        try {
            fo = new FileOutputStream(path);

            for(int i = 0;i < contents.length();i++) {
                fo.write((int)contents.charAt(i));
            }

            fo.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void writeContentToBottomFile(String path, String contents){
        FileOutputStream fo;
        File f;

        try {
            f = new File(path);
            fo = new FileOutputStream(f.getAbsoluteFile(),true);


            for(int i = 0;i < contents.length();i++) {
                fo.write((int)contents.charAt(i));
            }

            fo.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static File findFileByName(String folderPath, String fileName) {
        File f = new File(folderPath);
        String[] nameFile;
        File f_founded = null;

        nameFile = f.list();
        for(String name : nameFile) {
            if(name.contains(fileName)) {
                f_founded = new File(folderPath + "/" + fileName);
            }
        }

        return f_founded;


    }

    public static void main(String[] args) {

        String dataFile = "src/week9/FileData.txt";

        /**
         * doc du lieu tu mot file
         */
        System.out.println(readContentFromFile(dataFile));

        /**
         * write content to file
         */
        writeContentToFile(dataFile, "le canh duy.");

        /**
         * chen du lieu vao cuoi cua file
         */
        writeContentToBottomFile(dataFile,"con ca");

        writeContentToFile(dataFile,"hello");

        System.out.println(readContentFromFile(dataFile));


        /**
         * tim kiem file
         */
        findFileByName("src/week9","FileData.txt");
        System.out.println(findFileByName("src/week9","FileData.txt").getPath());
    }
}
