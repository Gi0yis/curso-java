import java.util.Scanner;

public class IntroducirDatosMatrices {
    public static void main(String[] args) {
        // Introducir valores a una matriz
        var consola = new Scanner(System.in);
        int renglones, columnas;

        // Definir la matriz
        System.out.print("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine().strip());
        System.out.print("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine().strip());

        var matriz = new int[renglones][columnas];

        // Solicitar valores
        for (var ren = 0; ren < renglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                System.out.printf("Valor[%d][%d] = ", ren, col);
                matriz[ren][col] = Integer.parseInt(consola.nextLine().strip());
            }
        }

        System.out.println();
        // Iterar los valores de la matriz
        for (var ren = 0; ren < renglones; ren++) {
            for (var col = 0; col < columnas; col++) {
                System.out.printf("Matriz[%d][%d] = %d%n", ren, col, matriz[ren][col]);
            }
        }
    }
}
