import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final var USER = "admin";
        final var PASSWORD = "12345";

        System.out.println("*** Sistema de Autenticación ***");

        System.out.print("Usuario: ");
        var user = scanner.nextLine();

        System.out.print("Contraseña: ");
        var password = scanner.nextLine();

        var isDataCorrect = user.equals(USER) && password.equals(PASSWORD);

        System.out.println("Usuario y Contraseña correctos? " + isDataCorrect);
    }
}
