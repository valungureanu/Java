package md.tekwill.lectia24;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class TestException {

    public static void main(String[] args) throws Exception {

        MyCheckedException myCheckedException = new MyCheckedException();



//        try {
//            MyCheckedException.m1(true);
//        } catch (FileNotFoundException | NullPointerException | IndexOutOfBoundsException ex) {
//            System.out.println("Exceptie prinsa");
//        }


//        finally {
//            System.out.println(" sdsdsdsdsd");
//        }

        System.out.println("Restul codului din main!");

    }
}
