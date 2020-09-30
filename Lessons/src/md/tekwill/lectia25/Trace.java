package md.tekwill.lectia25;

public class Trace {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        String[] students = {"Shreya","Joseph"};
        System.out.println(students[0]);
    }
}
