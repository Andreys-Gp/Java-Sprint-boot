package Exception;

public class DividirEntreCero extends Exception {

    @Override
    public String getMessage() {
        return "Error: Division por cero no permitida.";
    }

}
