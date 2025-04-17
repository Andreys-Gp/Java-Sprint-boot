package Exception;

public class CalculadoraExcption extends Exception {

    String mensajeError;
    public CalculadoraExcption(String mensajeError) {
        setMensajeError(mensajeError);
    }

    @Override
    public String getMessage() {
        return getMensajeError();
    };
    
    


    public String getMensajeError() {
        return mensajeError;
    };
    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    };
    

}
