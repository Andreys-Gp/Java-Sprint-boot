import Exception.CalculadoraExcption;
import Exception.DividirEntreCero;

public class Calculadora {

    public int division(int numerador, int divisor) throws  CalculadoraExcption {
        if (divisor == 0) throw new CalculadoraExcption("Error: Division por cero no permitida.");
            
        return numerador / divisor;
    };

}
