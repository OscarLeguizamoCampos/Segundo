import java.util.Scanner;

public class EjeRepaso1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Capturar nombre
        System.out.println("Digite su nombre: "); var nombreEmpleado = sc.nextLine();
        //Capturar nombre
        System.out.println("Digite su edad: "); var edad = sc.nextInt();

    //Camino logico
    if (edad < 16){
    String T_salario = (nombreEmpleado +", no tiene edad para trabajar.");
    System.out.println(T_salario);
        }
    else {//Capturar salario; 
        System.out.println("Digite su salario: "); var salario = sc.nextDouble();
        
        if (edad >= 19 && edad <= 50){salario += salario*0.05;
        }
        else if (edad >= 51 && edad <= 60){salario += salario*0.1;
        }
        else if (edad >= 61){salario += salario*0.15;
        }
        String T_salario = (nombreEmpleado + ", el salario total es: "+ salario);
        System.out.println(T_salario);
        }
        sc.close();     
    }
}
