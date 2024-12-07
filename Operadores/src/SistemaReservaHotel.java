import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        /*
        Pedir:
        - Nombre del cliente
        - Dias de estadía en el hotel
        - ¿Cuarto con vista al mar?

        Tarifas:
        - Cuarto sin vista al mar: $ 150.50 por día
        - Cuarto con vista al mar: $ 190.50 por día
        */
        var scanner = new Scanner(System.in);

        final var PRECIO_VISTA_MAR = 190.50;
        final var PRECIO_SIN_VISTA_MAR = 150.50;

        System.out.println("--- Sistema de Reserva de Hotel ---");

        System.out.print("Nombre del Cliente: ");
        var nombreCliente = scanner.nextLine();

        System.out.print("Días de estadía: ");
        var diasEstadia = Integer.parseInt(scanner.nextLine().trim());

        System.out.print("¿Con vista al mar (true/false)? ");
        var conVistaMar = Boolean.parseBoolean(scanner.nextLine().trim().toLowerCase());

        var costoTotal = (conVistaMar == true) ? PRECIO_VISTA_MAR * diasEstadia : PRECIO_SIN_VISTA_MAR * diasEstadia;

        System.out.printf("""
                %n--------- Detalles de la Reservavión ---------
                Cliente: %s
                Días de estadía: %d
                Costo total: $%.2f
                Habitación con vista al mar: %s
                """, nombreCliente, diasEstadia, costoTotal, conVistaMar ? "Sí :)" : "No :(");
    }
}
