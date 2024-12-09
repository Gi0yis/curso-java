import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var promedio = 0.0;
        System.out.println("--- Promedio de Calificaciones ---");

        System.out.print("¿Cuantas Calificaciones deseas agregar? ");
        var numeroCalificaciones = Integer.parseInt(scanner.nextLine());
        var calificaciones = new double[numeroCalificaciones];

        for (int i = 0; i < numeroCalificaciones; i++) {
            System.out.print("Calificación[" + i + "] = ");
            calificaciones[i] = Double.parseDouble(scanner.nextLine());
            promedio += calificaciones[i];
        }

        promedio /= numeroCalificaciones;

        System.out.println("\nPromedio de las Calificacions: " + promedio);
    }
}
