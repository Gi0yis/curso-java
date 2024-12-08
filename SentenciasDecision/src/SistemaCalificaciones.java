import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var letra = "";

        System.out.println("--- Sistema de Calificaciones ---");

        System.out.print("Ingresa la calificación (1 - 10): ");
        var calificaion = Double.parseDouble(scanner.nextLine().trim());

        if (calificaion >= 9 && calificaion <= 10)
            letra = "A";
        else if (calificaion >= 8 && calificaion < 9)
            letra = "B";
        else if (calificaion >= 7 && calificaion < 8)
            letra = "C";
        else if (calificaion >= 6 && calificaion < 7)
            letra = "D";
        else if (calificaion >= 0 && calificaion < 6)
            letra = "F";
        else
            letra = "Valor desconocido";

        System.out.printf("Su calificación es %.2f. Usted tiene una %s", calificaion, letra);
    }
}