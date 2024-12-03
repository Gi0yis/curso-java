import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        /*
        Crear un programa para solicitar los valores más importantes de una receta de cocina.

        Los valores que debe introducir el usuario son:

        - Nombre de la Receta
        - Ingredientes Principales
        - Tiempo de preparación (min)
        - Dificultad ('Facil, Media o Alta')

        Al finalizar debe mandar a imprimir la receta.
        */
        var scanner = new Scanner(System.in);

        System.out.println("*** Recetas de Cocina ***");

        System.out.print("Ingrese el nombre de la receta: ");
        var nombreReceta = scanner.nextLine();

        System.out.print("Ingrese los ingredientes: ");
        var ingredientes = scanner.nextLine();

        System.out.print("Ingese el tiempo de preparación (min): ");
        var tiempoPreparacion = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la dificultad: ");
        var dificultad = scanner.nextLine();

        var respuesta = String.join(" ", "Nombre receta:", nombreReceta, "\nIngredientes:", ingredientes,
                "\nTiempo de preparación: " + tiempoPreparacion, "\nDificultad:", dificultad);

        System.out.println("\n--- Receta de Cocina ---");
        System.out.println(respuesta);
    }
}
