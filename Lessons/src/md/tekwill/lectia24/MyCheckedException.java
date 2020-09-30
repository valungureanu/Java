package md.tekwill.lectia24;

public class MyCheckedException {

    public static void m1(boolean isException) throws Exception {
        System.out.println("Pana la exceptie in m1()");
        if(isException){
            throw new Exception();
        }
        System.out.println("Restul Programului in m1()");
    }

}
