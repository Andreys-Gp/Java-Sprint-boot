
public class App {
    public static void main(String[] args) throws Exception {

        Persona persona1 = new Persona(
                "Juan",
                "Pérez",
                25,
                new String[] { "Java", "Python", "JavaScript" },
                true,
                "Ingeniería de Sistemas",
                10,
                true
                );


        persona1.setNombre("Juanito");
        persona1.setApellido("Pérez");




        /*
         * persona1.nombre = "Juan";
         * persona1.apellido = "Pérez";
         * persona1.edad = 25;
         * persona1.tecnologias = new String[] { "Java", "Python", "JavaScript" };
         * persona1.esEstudiante = true;
         * 
         * persona1.carrera.nombre="Ingeniería de Sistemas";
         * persona1.carrera.Duracion=10;
         * persona1.carrera.estaEncurso=true;
         * 
         * System.err.println(persona1.datosPersona());
         * System.err.println(persona1.enviarSaludo("juanito"));
         */

        /*
         * Persona persona2 = new Persona();
         * persona2.nombre = "Ana";
         * persona2.apellido = "Gómez";
         * persona2.edad = 60;
         * persona2.tecnologias = new String[] { "C++", "C#", "PHP" };
         * persona2.esEstudiante = false;
         */

        /*
         * System.out.println(persona1.nombre + " " + persona1.apellido + " tiene " +
         * persona1.edad + " años." + " Es estudiante: " + persona1.esEstudiante + "."
         * + " Tecnologías: " + String.join(", ", persona1.tecnologias));
         */
        /*
         * Carrera carrera1 = new Carrera();
         * carrera1.nombre = "Ingeniería de Sistemas";
         * carrera1.Duracion = 10;
         * carrera1.estaEncurso = true;
         */
        /*
         * Carrera carrera2 = new Carrera();
         * carrera2.nombre = "Ingeniería de Software";
         * carrera2.Duracion = 8;
         * carrera2.estaEncurso = false;
         */
        /* persona1.carrera = carrera1; */
        /* persona2.carrera = carrera2; */

        /* String saludado = "Juanito"; */

        /*
         * System.out.println(persona1.darInformacion());
         * System.out.println(persona2.darInformacion());
         * System.out.println(persona1.enviarSaludo(saludado));
         * System.out.println(persona2.enviarSaludo(saludado));
         * System.out.println(saludado);
         * System.out.println(persona1.enviarSaludo("Brayan Gonzalez"));
         * System.out.println(persona2.enviarSaludo("Brayan Gonzalez"));
         */

    }
}
