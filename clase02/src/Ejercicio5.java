import java.util.Scanner;
public class Ejercicio5 {
    
public static void main(String[] args) {
    System.out.print("Ingrese la nota");
    Scanner sc = new Scanner(System.in);
    String nota = sc.next();
    sc.close();
    String mensaje = "";

    switch(nota){
        case "E":
            mensaje = "Exelente Trabajo!, la mejor nota!";
            break;
        case "S" :
            mensaje = "Sobresaliente!, buena nota!";
            break;
        case "R":
            mensaje = "Regular, puedes hacerlo mejor!";
            break;   
        case "I":
            mensaje = "Insuficiente, vuelve a intentarlo";
            break;
        
    }
    System.out.println(mensaje);
}
}
