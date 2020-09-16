package md.tekwill.lectia20;

public class MyClass {

    private int number = 10;

    public int returnSuma() {
        return number + number;
    }

    public void m1() {
        System.out.println(m2() + m3());
    }

    private int m2() {
        return 10;
    }

    private int m3() {
        return 20;
    }

    public void setNumber(int number) {
        if (number > 100) {
            this.number = number;
        }
    }

    public int getNumber() {
        return this.number;
    }

}
