import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String password = "";
//        boolean salir = false;

//        while (!salir) {
//            System.out.println("--- Validación de Password ---");
//            System.out.println("La contraseña debe tener al menos 6 caracteres");
//            System.out.print("Escriba su contraseña: ");
//            password = scanner.nextLine();
//
//            if (password.length() >= 6) {
//                System.out.println("Password válido");
//                salir = true;
//            }
//            else
//                System.out.println("Password inválida. Intente de nuevo...\n");
//        }
        while (password.length() < 6) {
            System.out.println("--- Validación de Password ---");
            System.out.println("La contraseña debe tener al menos 6 caracteres");
            System.out.print("Escriba su contraseña: ");
            password = scanner.nextLine();
            System.out.print("\nPassword inválida. Intente de nuevo:");
            password = scanner.nextLine();
        }

        System.out.println("Password válido");
    }
}
