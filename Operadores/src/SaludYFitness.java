import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        System.out.println("*** Salud y Fitness ***");

        // Constantes
        final var META_PASOS_DIARIO = 10_000;
        final var CALORIAS_POR_PASO = 0.04; // Valor aproximado, son kilocalorias

        // Pedimos los valores al usuario
        var consola = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        var nombreUsuario = consola.nextLine();

        System.out.print("¿Cuántos pasos has caminado hoy? ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        // varificar si el usuario alcanzó la meta de pasos diarios
        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIO) ? "Sí :)" : "No :(";

        // Calcular las calorías quemadas
        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

        // Mostramos la información
        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorias quemadas: %.2f kcal
                Meta de pasos diarios alcanzada: %s
                -----------------------------------
                La meta de pasos diarios es de: %d pasos
                """, nombreUsuario, pasosDiarios, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIO);
    }
}