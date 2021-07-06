import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la estacion del año");
        String estacion=sc.next();

        System.out.println("Ingrese el numero entero");
        int numero = sc.nextInt();

        System.out.println("Ingrese el adjetivo");
        String adjetivo = sc.next();
         
        sc.close();
        String oracion = "En un dia "+ adjetivo +" de "+ estacion + ", yo bebo un minimo de "+ numero +" tazas de cafe";

        System.out.println();
        System.out.println(oracion);
    }
}