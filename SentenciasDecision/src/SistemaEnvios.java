import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        final var COSTO_NACIONAL = 10; // 10 * Kilo
        final var COSTO_INTERNACIONAL = 20; // 20 * Kilo

        Double costoEnvio = 0.0;

        System.out.println("--- Sistemas de Envíos ---");

        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        var destino = scanner.nextLine().trim().toLowerCase();

        System.out.print("Ingresa el peso del paquete (en kg): ");
        var pesoKG = Double.parseDouble(scanner.nextLine().trim());

//        costoEnvio = switch (destino) {
//            case "nacional" -> costoEnvio = pesoKG * COSTO_NACIONAL;
//            case "internacional" -> costoEnvio = pesoKG * COSTO_INTERNACIONAL;
//            default -> {
//                System.out.printf("Error destino inválido '%s'", destino);
//                yield null;
//            }
//        };

        if (destino.equals("nacional"))
            costoEnvio = pesoKG * COSTO_NACIONAL;
        else if (destino.equals("internacional"))
            costoEnvio = pesoKG * COSTO_INTERNACIONAL;
        else
            System.out.printf("Error destino inválido '%s'", destino);

        if (costoEnvio != 0.0)
            System.out.printf("El costo de envío del paquete es: %.2f", costoEnvio);;
    }
}
