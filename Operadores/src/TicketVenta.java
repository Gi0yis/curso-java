import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generación Ticket de Venta ***");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio plátanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar algún descuento (%)? ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // Cálculo del subtotal (sin impuestos)
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        // Aplicar descuento
        var descuento = subtotal * (descuentoPorcentaje / 100.0);

        // Subtotal con descuento
        var subtotalConDescuento = subtotal - descuento;

        // Cálculo con impuestos (12%)
        var impuesto = subtotalConDescuento * 0.16;

        // Cálculo total de la compra (con impuestos)
        var costoTotalCompra = subtotalConDescuento + impuesto;

        // Imprimir  el ticker de venta
        System.out.printf("""
                %nTicket de Venta
                ---------------
                Subtotal: Q%.2f
                Descuento: Q%.2f (%d%%)
                Impuesto (12%%): Q%.2f
                Costo total de la compra: Q%.2f
                """, subtotal, descuento, descuentoPorcentaje, impuesto, costoTotalCompra);
    }
}