import java.util.Scanner;

public class NumeroPositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Valor Positivo o Negativo ***");
        System.out.print("Ingresa un número Positivo o Negativo: ");
        var numeroIngresado = Integer.parseInt(scanner.nextLine());

//        if (numeroIngresado > 0) System.out.println("Es positivo");
//        else if (numeroIngresado < 0) System.out.println("Es negativo");
//        else System.out.println("Es cero");

        if (numeroIngresado > 0) {
            System.out.println("Es positivo: " + numeroIngresado);
        } else if (numeroIngresado < 0) {
            System.out.println("Es negativo: " + numeroIngresado);
        } else {
            System.out.println("Es cero: " + numeroIngresado);
        }
    }
}
