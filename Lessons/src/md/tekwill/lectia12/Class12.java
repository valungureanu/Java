package md.tekwill.lectia12;

public class Class12 {

    private int sumaNumerelor(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    private int sumaNumerelorPare(int n) {
        int sum = 0;
        if (n > 1) {
            for (int i = 2; i <= n; i += 2) {
                sum += i;
            }
        } else {
            System.out.printf("Introduceti un numar mai mare dacat 1!");
        }
        return sum;
    }

    public void metodaPublica(int n) {
        System.out.println(this.sumaNumerelor(n));
        System.out.println(this.sumaNumerelorPare(n));
    }

    public static void main(String[] args) {
        Class12 obj = new Class12();
        obj.metodaPublica(1111);
    }

}
