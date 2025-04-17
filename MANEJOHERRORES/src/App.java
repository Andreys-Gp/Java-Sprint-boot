import Exception.CalculadoraExcption;
import Exception.DividirEntreCero;

public class App {

    public static void main(String[] args) throws Exception {

        double numero1 = 5;
        int numero2 = 0;
        int resultado;

        Calculadora calculadora = new Calculadora();
        try {
            resultado = calculadora.division((int) numero1, numero2);
            System.out.println("El resultado es: " + resultado);
        } catch (CalculadoraExcption e) {
            e.printStackTrace();
        }finally {
            System.out.println("Fin del programa.");
        };




        /* 
        try {
            resultado = (int) numero1 / numero2;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Error: Division por cero no permitida.");
        } */

    }
}
