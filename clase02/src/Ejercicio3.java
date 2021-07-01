import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        
        //Inicialicemos  variables conocidas
        int salario = 1000;
        int bonus =250;
        int limiteVentasBonus = 10;

        // Capturamos las variables no conocidas
        System.out.println("Ingrese el numero de ventas de la persona");
        Scanner sc = new Scanner(System.in);
        int ventas = sc.nextInt();
        sc.close();

        //Tomar un camino logico dependiendo de la entrada
        if(ventas > limiteVentasBonus ){
            salario = salario + bonus;

        System.out.println("El salario final en esta semana es "+ salario);
        }
    }
}
