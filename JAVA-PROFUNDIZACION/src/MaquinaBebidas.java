import java.util.Scanner;

public class MaquinaBebidas {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la máquina de bebidas");
        System.out.println("Seleccione una bebida:");
        System.out.println("1. Café");
        System.out.println("2. Mate");
        System.out.println("3. Té");
        System.out.println("4. Limonada");
        System.out.println("5. Salir");
        System.out.print("Ingrese el número de la bebida que desea: ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Preparando café...");
                break;
            case 2:
                System.out.println("Preparando mate...");
                break;
            case 3:
                System.out.println("Preparando té...");
                break;
            case 4:
                System.out.println("Preparando limonada...");
                break;
            case 5:
                System.out.println("Saliendo de la máquina de bebidas...");
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                break;
        }
        System.out.println("Gracias por usar la máquina de bebidas.");
        scanner.close();

    }
}
