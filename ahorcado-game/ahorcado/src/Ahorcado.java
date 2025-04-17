import java.util.Scanner;

public class Ahorcado {
        public static void main(String[] args) {
            
           Scanner scanner = new Scanner(System.in);

           String palabrasecreta = "programacion";
           int intentosMaximos = 11;
           int intentos= 0;
           boolean palabraAdivinada = false;

           char[] letrasadivinadas = new char[palabrasecreta.length()];
              for (int i = 0; i < letrasadivinadas.length; i++) {
                letrasadivinadas[i] = '_';
              }

              while (!palabraAdivinada && intentos< intentosMaximos) {

                System.out.println("Palabra a adivinar: "+ String.valueOf(letrasadivinadas));
                System.out.print("Introduce una letra: ");
                char letra =  Character.toLowerCase(scanner.next().charAt(0));
                boolean letraCorrecta = false;
                System.out.println("Intentos restantes: " + (intentosMaximos - intentos));
                
                for (int i = 0; i < palabrasecreta.length(); i++) {
                    if (palabrasecreta.charAt(i) == letra) {
                        letrasadivinadas[i] = letra;
                        letraCorrecta = true;
                    }
                }
                if (!letraCorrecta) {
                    intentos++;
                    System.out.println("Letra incorrecta. Te quedan " + (intentosMaximos - intentos) + " intentos.");
                }
                if (String.valueOf(letrasadivinadas).equals(palabrasecreta)) {
                    palabraAdivinada = true;
                    System.out.println("¡Felicidades! Has adivinado la palabra: " + palabrasecreta);
                } 

              }
                if (!palabraAdivinada) {
                    System.out.println("Lo siento, has perdido. La palabra era: " + palabrasecreta);
                }
                scanner.close();



    }
}
