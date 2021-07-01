public class Ejercicio6 {
    public static void main(String[] args) {
        var nombre ="Cecilia";
        var resultado = saludo(nombre);
        System.out.println(resultado);
    }
    public static String saludo(String nombre) {
        return "Hola "+nombre+"!";
    }
}
