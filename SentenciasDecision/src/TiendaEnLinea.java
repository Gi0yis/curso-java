import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final var MONTO_DESCUENTO = 1_000.00;
        int porcentajeDescuento = 0;
        double montoDescuento, montofinal;

        System.out.println("*** Tienda en Línea con Descuentos ***");

        System.out.print("¿Cual fue el monto de tu compra? ");
        var montoCompra = Double.parseDouble(scanner.nextLine().trim());

        System.out.print("¿Eres miembro de la tienda (true/false)?: ");
        var esMiembro = Boolean.parseBoolean(scanner.nextLine().trim().toLowerCase());

        // Calculamos el descuento
        if (montoCompra >= MONTO_DESCUENTO && esMiembro) {
            porcentajeDescuento = 10;
        } else if (montoCompra < MONTO_DESCUENTO && esMiembro) {
            porcentajeDescuento = 5;
        }

        montoDescuento = montoCompra * (porcentajeDescuento / 100.0);

        // Mostar mensaje
        if (porcentajeDescuento != 0) {
            montofinal = montoCompra - montoDescuento;
            System.out.printf("""
                %nFelicidades, has obtenido un descuento del %d%%
                Monto de la compra: Q%.2f
                Monto del descuento: Q%.2f
                Monto final de la compra con descuento Q%.2f
                """, porcentajeDescuento, montoCompra, montoDescuento, montofinal);
        } else {
            System.out.printf("""
                    %nNo obtuviste ningún tipo de descuento
                    Te invitamos a hacerte miembro de la tienda
                    Monto final de la compra: Q%.2f
                    """, montoCompra);
        }
    }
}
