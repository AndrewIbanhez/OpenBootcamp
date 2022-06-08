public class EjTema4 {
    static public void Ej4If(int numeroIf){
        if (numeroIf > 0)
            System.out.println(numeroIf + "es un número positivo");
        else if (numeroIf < 0)
            System.out.println(numeroIf + "es un número negativo");
        else
            System.out.println(numeroIf + "es cero");
    }

   static  public void Ej4While(int numeroWhile){
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
    }

    static public void Ej4DoWhile(int numeroDoWhile){
        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }while(numeroDoWhile < 3);
    }

    static public void Ej4For(){
        for (int numeroFor = 0; numeroFor < 3; numeroFor++){
            System.out.println(numeroFor);
        }
    }

    static public void Ej4Switch(String estacion){
        switch (estacion) {
            case "primavera" -> System.out.println("es primavera");
            case "verano" -> System.out.println("es verano");
            case "otonio" -> System.out.println("es otonio");
            case "invierno" -> System.out.println("es invierno");
            default -> System.out.println(estacion + "no es una estación");
        }
    }

}
