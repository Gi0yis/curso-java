import java.util.Scanner;

public class EstacionAnioMejorada {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("--- Identifica la estación del año ---");

        System.out.print("Ingresa un número del 1 al 12: ");
        var valorMes = Integer.parseInt(scanner.nextLine().trim());

        var estacion = switch (valorMes) {
            case 1, 2 , 12 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Estación Desconocida";
        };

        System.out.printf("La estación del mes %d es %s", valorMes, estacion);
    }
}