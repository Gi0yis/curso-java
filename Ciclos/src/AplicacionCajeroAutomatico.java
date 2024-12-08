import java.util.Scanner;

public class AplicacionCajeroAutomatico {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var saldo = 1_000.00;
        var salir = false;

        while (!salir) {
            System.out.print("""
                    --- Aplicación de Cajero Automático ---
                    Operaciones que puedes realizar:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción:\s""");

            var opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.printf("Tu saldo Actual es: Q%.2f%n%n", saldo);
                case 2 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    var retirarSaldo = scanner.nextDouble();

                    if (retirarSaldo > saldo) {
                        System.out.printf("No cuentas con el saldo suficiente. Su saldo actual es: Q%.2f%n%n", saldo);
                    } else {
                        saldo -= retirarSaldo;
                        System.out.printf("Tu nuevo saldo es de: Q%.2f%n%n", saldo);
                    }
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    var depositarSaldo = scanner.nextDouble();

                    saldo += depositarSaldo;
                    System.out.printf("Tu nuevo saldo es de: Q%.2f%n%n", saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero automático. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida. Selecciona otra opción\n");
            }
        }
    }
}
