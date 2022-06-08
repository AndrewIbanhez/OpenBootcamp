public class Main {
    public static void main(String[] args) {
        //primera parte
        System.out.println(suma(5, 6,7));

        //segunda parte
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.numPuertas);
    }
    //primera parte
    static int suma(int a, int b, int c){
        return a + b + c;
    }
}
//segunda parte
class Coche {
    public int numPuertas = 0;

    public void incrementarPuertas(){
        this.numPuertas++;
    }
}