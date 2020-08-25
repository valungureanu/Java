package md.tekwill.exercitiu1;

public class ClasaB {
    void metB(){
        ClasaA ob1 = new ClasaA();
        ob1.metA();
    }
    void metC(ClasaA argA){
        argA.metA();
    }
}
