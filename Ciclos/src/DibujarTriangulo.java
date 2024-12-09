import java.util.Scanner;

public class DibujarTriangulo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("--- Dibuja un Rectángulo ---");

        System.out.print("Proporciona el número de filas: ");
        var tamanoTriangulo = scanner.nextInt();

        for (int i = 1; i <= tamanoTriangulo; i++) {
            System.out.print(" ".repeat(tamanoTriangulo - i));
            System.out.println("*".repeat(2 * i - 1));
        }
    }
}
