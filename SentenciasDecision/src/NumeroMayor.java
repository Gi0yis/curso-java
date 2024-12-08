import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("--- El mayor de dos Números ---");

        System.out.print("Ingres el primer número: ");
        var primerNumero = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Ingres el segundo número: ");
        var segundoNumero = Integer.parseInt(scanner.nextLine().trim());

        if ( primerNumero > segundoNumero ) {
            System.out.println("El número mayor es: " + primerNumero);
        } else if ( primerNumero < segundoNumero ) {
            System.out.println("El número mayor es: " + segundoNumero);
        } else {
            System.out.println("Ambos números tienen el mismo valor");
        }
    }
}
