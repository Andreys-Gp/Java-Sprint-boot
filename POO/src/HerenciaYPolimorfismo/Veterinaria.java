package HerenciaYPolimorfismo;

public class Veterinaria {
    public static void main(String[] args) {
        Animal animal = new Animal("Natacha", 5);
        Gato gato = new Gato("Copito", 3);
        Perro perro = new Perro("Firulais", 4);

        System.out.println("El nombre del animal es: " + animal.nombre);
        System.out.println(animal.hacerSonido());
        System.out.println("El nombre del gato es: " + gato.nombre);
        System.out.println(gato.hacerSonido());
        System.out.println("El nombre del perro es: " + perro.nombre);
        System.out.println(perro.hacerSonido());

        System.out.println("El número total de animales es: " + Animal.getContadorAnimal());
        System.out.println("El número total de gatos es: " + Gato.getContadorAnimal());
        System.out.println("El número total de perros es: " + Perro.getContadorAnimal());
        System.out.println("El número total de sucursales es: " + Sucursales.nombre + " " + Sucursales.direccion + " " + Sucursales.telefono);

    }

}
