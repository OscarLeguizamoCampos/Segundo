package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio1 {
    
    
    public static void saludo(){
        System.out.println("Hola - APP Numero de la suerte");
    }
    // 1.Solicita la fecha de nacimiento
    public static String leerFecha(){
        System.out.println("Ingresar la fecha en formato DD/MM/AAAA :");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        sc.close();
        return fecha;
    }
    // 2. Solicitaextraerlas porciones que hacen referencia al dia, mes, año(split)
    public static int obtenerNumerosSuerte(String fecha){
        //variable que almacena el resultado
        int numeroSuerte = 0;
        //Extraer las porciones
        //"15/01/10998"- ["15","01", "1998"]
        String [] arregloFecha = fecha.split("/",3);
        //Variables para las versiones numericas
        int valorDia = Integer.parseInt(arregloFecha[0]);
        int valorMes = Integer.parseInt(arregloFecha[1]);
        int valorAnio = Integer.parseInt(arregloFecha[2]);

        //Tomar
        System.out.println(valorDia);
        System.out.println(valorMes);
        System.out.println(valorAnio);
        return 1;
    }
    public static void main(String[] args) {
        saludo();
        String datoFecha = leerFecha(); 
        obtenerNumerosSuerte(datoFecha);
    }
}
