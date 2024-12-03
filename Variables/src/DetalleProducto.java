public class DetalleProducto {
    public static void main(String[] args) {
        String nombreDelProducto = "Laptop Lenovo";
        double precioDelProducto = 1000.50;
        int cantidadDisponible = 15;
        boolean disponibleVenta = true;

        // Imprimir Variables
        System.out.println("nombreDelProducto = " + nombreDelProducto);
        System.out.println("precioDelProducto = " + precioDelProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);

        // Cambiar valores
        nombreDelProducto = "Laptot lenovo ideapad1";
        precioDelProducto = 1500.99;
        cantidadDisponible = 0;
        disponibleVenta = false;
        System.out.println();
        System.out.println("nombreDelProducto = " + nombreDelProducto);
        System.out.println("precioDelProducto = " + precioDelProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);
    }
}
