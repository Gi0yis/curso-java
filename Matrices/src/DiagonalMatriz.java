import java.util.Scanner;

public class DiagonalMatriz {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int renglones, columnas;
        var suma = 0;

        System.out.println("--- Suma de la Diagonal de una Matriz ---");

        System.out.print("Proporciona los renglones: ");
        renglones = Integer.parseInt(scanner.nextLine().strip());
        System.out.print("Proporciona las columnas: ");
        columnas = Integer.parseInt(scanner.nextLine().strip());

        var matriz = new int[renglones][columnas];

        System.out.println();
        for (var ren = 0; ren < renglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                System.out.printf("Valor[%d][%d] = ", ren, col);
                matriz[ren][col] = Integer.parseInt(scanner.nextLine().strip());
            }
        }

        for (var ren = 0; ren < renglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                if (col != ren)
                    continue;

                suma += matriz[ren][col];
            }
        }

        System.out.printf("%nLa suma de la diagonal de la matriz es = %d", suma);
    }
}
