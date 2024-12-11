package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        var salir = false;
        var consola = new Scanner(System.in);
        // Creamos la lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("-------------- Maquina de maquina_snacks.presentacion.servicio.Snacks --------------\n");
        maquina_snacks.Snacks.mostarSnacks(); // Mostar el inventario de snacks disponibles
        while (!salir) {
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos);
            } catch (Exception e) {
                System.out.println("Ocurrio un error " + e.getMessage());
            }
            finally {
                System.out.println(); // Imprime un salto de linea con cada iteracion
            }
        }
    }

    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                1. Compar snack
                2. Mostar ticket
                3. Agregar Nuevo maquina_snacks.presentacion.dominio.Snack
                4. Salir
                Elige una opcion:\s""");

        // leemos y retornamos la opcion seleccionada
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos) {
        var salir = false;
        switch (opcion) {
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.println("Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion invalida: " + opcion);
        }
        return salir;
    }

    private static void comprarSnack(Scanner consola, List<Snack> productos) {
        System.out.print("¿Que snack quieres comprar (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine());
        // Validar que le snack exista en la lista de snacks
        var snackEncontrado = false;
        for (var snack : Snacks.getSnacks()) {
            if (idSnack == snack.getIdSnak()) {
                // Agregamos el snack a la lista de productos
                productos.add(snack);
                System.out.println("Ok, maquina_snacks.presentacion.dominio.Snack agregado " + snack);
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado) {
            System.out.println("Id de snack no encontrado: " + idSnack);
        }
    }

    private static void mostarTicket(List<Snack> productos) {
        var ticket = "--- Ticket de Venta ---";
        var total = 0.0;
        for (var producto : productos) {
            ticket += "\n\t- " + producto.getNombre() + " - Q" + producto.getPrecio();
            total += producto.getPrecio();
        }

        ticket += "\n\tTotal -> Q" + total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner consola) {
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();
        System.out.print("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu snack se a agregado correctamente");
        Snacks.mostarSnacks();
    }
}