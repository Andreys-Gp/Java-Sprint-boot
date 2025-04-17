
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Bienbenido a la tienda de frutas");

       // Map<String, Double> inventario = new HashMap<>();
      // Map<String, Double> inventario = new TreeMap<>(); // Crear un mapa para almacenar frutas y precios
      Map<String, Double> inventario = new LinkedHashMap<>(); // Crear un mapa para almacenar frutas y precios

        inventario.put("Manzana", 1.50);
        inventario.put("Banana", 0.75);
        inventario.put("Naranja", 1.00);
        inventario.put("Pera", 1.25);
        inventario.put("Uva", 2.00);

        System.out.println("Inventario de frutas:");
        for (String fruta : inventario.keySet()) {
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        String frutaElegida = "Manzana";
        System.out.println("La fruta elegida es: " + frutaElegida);
        if (inventario.containsKey(frutaElegida)) {
            System.out.println("El precio de " + frutaElegida + " es: $" + inventario.get(frutaElegida));
        } else {
            System.out.println("La fruta no está disponible en el inventario.");
        }

        String sinStock = "Pera";
        inventario.remove(sinStock);

        System.out.println("la cantidad de frutas en el inventario es: " + inventario.size());

    }
}

