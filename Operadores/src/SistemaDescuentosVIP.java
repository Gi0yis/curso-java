import java.util.Locale;
import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Descuentos VIP ***");
        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.print("Cuatos productos compraste hoy? ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes la menbresía de la tienda (true/false)? ");
        var tieneMembresia = Boolean.parseBoolean(consola.nextLine().toLowerCase());

        var esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tieneMembresia;

        System.out.println("Tienes acceso al descuento VIP? = " + esElegibleDescuento);
    }
}
