
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class App {

    public static void main(String[] args) throws Exception {
        //las colecciones de derivan de Hashset,Treeset,LinkedHashset
        // Hashset: no mantiene el orden de inserción, no permite duplicados    
        // Treeset: mantiene el orden natural de los elementos, no permite duplicados
        // LinkedHashset: mantiene el orden de inserción, no permite duplicados

        /* Set<String> superheroes = new HashSet<>(); */
        //Set<String> superheroes = new TreeSet<>(); // HashSet es una implementación de Set
       // Set<String> superheroes = new LinkedHashSet<>(); // TreeSet es una implementación de Set

      // List<String> superheroes = new ArrayList<>(); 
      //List<String> superheroes = new LinkedList<>(); // ArrayList es una implementación de List
         List<String> superheroes = new Vector<>(); // LinkedList es una implementación de List 
        superheroes.add("Superman");
        superheroes.add("Batman");
        superheroes.add("Wonder Woman");
        superheroes.add("Flash");
        superheroes.add("Hulk");
        superheroes.add("Spiderman");

        superheroes.add("Iron Man"); 

        if (superheroes.contains("Spiderman")) {
            System.out.println("Spiderman is in the set!");
        } else {
            System.out.println("Spiderman is not in the set!");
        }

        superheroes.set(2, "Brayan Gonzalez"); // remove by value
        superheroes.remove(4); 

        /* if (superheroes.isEmpty()) {
            System.out.println("The set is empty!");
        } else {
            System.out.println("The set is not empty!");

        } */

        if(!superheroes.contains("Hulk")){
            System.out.println("Hulk is not in the set!");
        }


        System.out.println("Quienes estan aun en la lista:...");
        for (String hero : superheroes) {
            System.out.println(hero);
        }

        System.out.println("Superheroes: " + superheroes.size() + " superheroes in the set.");
    }
}
