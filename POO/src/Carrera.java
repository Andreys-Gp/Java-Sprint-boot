public class Carrera {
    String nombre;
    int Duracion;
    boolean estaEncurso;

    public Carrera() {
        this.nombre = "";
        this.Duracion = 0;
        this.estaEncurso = false;
    }

    public Carrera(String nombre, int duracion, boolean estaEncurso) {
        this.nombre = nombre;
        this.Duracion = duracion;
        this.estaEncurso = estaEncurso;
    }
    
}
