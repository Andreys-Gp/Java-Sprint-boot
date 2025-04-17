package HerenciaYPolimorfismo;

public class Animal {
    String nombre;
    int edad;
    static int contadorAnimal = 0;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorAnimal++;
    }

    public String hacerSonido() {
        return "El animal hace un sonido";
    }

    public static int getContadorAnimal() {
        return contadorAnimal;
    }

}
