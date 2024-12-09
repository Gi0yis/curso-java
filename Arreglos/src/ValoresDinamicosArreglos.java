import java.util.Scanner;

public class ValoresDinamicosArreglos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());

        var enteros = new int[largoArreglo];

        for (var i = 0; i < largoArreglo; i++) {
            System.out.print("Proporciona enteros[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }

        System.out.println("\nImpresión del Arreglo: ");
        for (var i = 0; i < largoArreglo; i++)
            System.out.print(enteros[i] + " ");
    }
}
