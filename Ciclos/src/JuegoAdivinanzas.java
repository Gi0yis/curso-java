import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var random = new Random();

        final var INTENTOS = 3;

        var numeroAleatorio = random.nextInt(10) + 1;
        var numeroUsuario = 0;
        var contador = 0;

        System.out.println("--- Juego de Adivinanzas ---");

        while (numeroUsuario != numeroAleatorio && contador < INTENTOS) {
            System.out.print("Adivina el número secreto (1 - 10): ");
            numeroUsuario = scanner.nextInt();
            if (numeroUsuario > numeroAleatorio)
                System.out.println("El número secreto es menor que " + numeroUsuario + "\n");
            else if (numeroUsuario < numeroAleatorio)
                System.out.println("El número secreto es mayor que " + numeroUsuario + "\n");

            contador++;
        }

        if (numeroUsuario != numeroAleatorio) {
            System.out.println("Lo sentimos. No tienes mas intentos");
            System.out.println("El numero secreto es " + numeroAleatorio);
        }
        else
            System.out.printf("Felicidades has acertado el número secreto es: %d. Lo hiciste en %d intentos", numeroAleatorio, contador);
    }
}
