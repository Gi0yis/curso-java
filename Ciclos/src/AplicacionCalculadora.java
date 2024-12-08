import java.util.Scanner;

public class AplicacionCalculadora {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        double valor1 = 0.0, valor2 = 0.0, resultado;

        var salir = false;

        while (!salir) {
            System.out.print("""
                    --- Aplicación en Java ---
                    Operaciones que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Escoge una opción:\s""");

            var opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Dame el valor 1: ");
                valor1 = scanner.nextDouble();
                System.out.print("Dame el valor 2: ");
                valor2 = scanner.nextDouble();
            }

            switch (opcion) {
                case 1 -> {
                    resultado = valor1 + valor2;
                    System.out.printf("Resultado Suma: %.2f%n%n", resultado);
                }
                case 2 -> {
                    resultado = valor1 - valor2;
                    System.out.printf("Resultado Resta: %.2f%n%n", resultado);
                }
                case 3 -> {
                    resultado = valor1 * valor2;
                    System.out.printf("Resultado Multiplicación: %.2f%n%n", resultado);
                }
                case 4 -> {
                    if (valor2 != 0) {
                        resultado = valor1 / valor2;
                        System.out.printf("Resultado División: %.2f%n%n", resultado);
                    }
                    else
                        System.out.println("Error: División por cero.\n");
                }
                case 5 -> {
                    System.out.println("Saliendo de la calculadora...");
                    salir = true;
                }
                default -> System.out.println("Opción inválida. Selecciona otra opción\n");
            }
        }
    }
}