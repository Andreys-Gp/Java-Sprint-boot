public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String[] tecnologias;
    private boolean esEstudiante;
    private String nombreCarrera;
    private int duracion;
    private boolean estaEncurso;
    /* Carrera carrera; */

    public Persona(
            String nombre,
            String apellido,
            int edad,
            String[] tecnologias,
            boolean esEstudiante,
            String nombreCarrera,
            int duracion,
            boolean estaEncurso) {
        /* this.carrera = new Carrera(); */// Constructor vacío
        /* carrera = new Carrera(nombreCarrera, duracion, estaEncurso); */
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tecnologias = tecnologias;
        this.esEstudiante = esEstudiante;
        this.nombreCarrera = nombreCarrera;
        this.duracion = duracion;
        this.estaEncurso = estaEncurso;

        /*
         * this.carrera.nombre = nombreCarrera;
         * this.carrera.Duracion = duracion;
         * this.carrera.estaEncurso = estaEncurso;
         */
    }


    public String darNombre() {
        return getNombre() + " " + getApellido();
    }






    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String[] tecnologias) {
        this.tecnologias = tecnologias;
    }

    public boolean isEsEstudiante() {
        return esEstudiante;
    }

    public void setEsEstudiante(boolean esEstudiante) {
        this.esEstudiante = esEstudiante;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isEstaEncurso() {
        return estaEncurso;
    }

    public void setEstaEncurso(boolean estaEncurso) {
        this.estaEncurso = estaEncurso;
    }

   

    /*
     * public String darNombreCompleto() {
     * return nombre + " " + apellido;
     * }
     * 
     * public String darTecnologias() {
     * return String.join(", ", tecnologias);
     * }
     * 
     * public String darInformacion() {
     * return "Nombre: " + darNombreCompleto() + ", Edad: " + edad +
     * ", Tecnologías: " + darTecnologias()
     * + ", Es estudiante: " + esEstudiante + ", Carrera: " + carrera.nombre +
     * ", Duración: "
     * + carrera.Duracion
     * + ", En curso: " + carrera.estaEncurso;
     * }
     * 
     * public String enviarSaludo(String saludado) {
     * if (edad > 40)
     * return "cordial saludo" + " " + saludado;
     * return " hola como te encuentras " + saludado + "?";
     * }
     * 
     * public String datosPersona() {
     * return "Nombre: " +
     * nombre +
     * ", Apellido: "
     * + apellido
     * + ", Edad: "
     * + edad
     * + ", Tecnologías: "
     * + String.join(", ", tecnologias)
     * + ", Es estudiante: "
     * + esEstudiante
     * + ", Carrera: "
     * + carrera.nombre
     * + ", Duración: "
     * + carrera.Duracion
     * + ", En curso: "
     * + carrera.estaEncurso;
     * }
     */

}
