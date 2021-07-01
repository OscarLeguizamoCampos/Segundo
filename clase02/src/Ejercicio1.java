import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner capturador = new Scanner(System.in);

    //1. capturar el numero de horas trabajadas
        System.out.println("Ingrese la cantidad de horas trabajadas");
        int horasTrabajadas = capturador.nextInt();
        
    //2. Capturar el costo de la hora del trabajador
        System.out.println("Ingrese el costo de horas trabajadas");
        double costoHora = capturador.nextDouble();

        capturador.close();
    //3. Multiplicar las horas trabajadas por el trabajador
        double costoTotal = horasTrabajadas * costoHora;
    //4. Mostrar resultado
        System.out.println("El pago del empleado es : " + costoTotal);
    }
}
