import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("--- Identifica la estación del año ---");

        System.out.print("Ingresa un número del 1 al 12: ");
        var valorMes = Integer.parseInt(scanner.nextLine().trim());
        var estacion = "";

        if (valorMes == 1 || valorMes == 2 || valorMes == 12)
            estacion = "Invierno";
        else if (valorMes == 3 || valorMes == 4 || valorMes == 5)
            estacion = "Primavera";
        else if (valorMes == 6 || valorMes == 7 || valorMes == 8)
            estacion = "Verano";
        else if (valorMes == 9 || valorMes == 10 || valorMes == 11)
            estacion = "Otoño";
        else
            estacion = "Estación Desconocida";

        System.out.printf("La estación del mes %d es %s", valorMes, estacion);
    }
}