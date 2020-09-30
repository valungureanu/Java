package md.tekwill.lectia25;

import java.io.*;
import java.util.Arrays;

public class MultipleExceptions {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("file.txt");
            System.out.println("File Openes");
            fis.read();
            System.out.println("Read File ");
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found ");
        } catch (IOException ioe) {
            System.out.println("I/O Exception ");
        } finally {
            System.out.println("Finally ");
            // code to close fis
        }
        System.out.println("Next task ");
    }
}
