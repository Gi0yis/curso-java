import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final var USUARIO = "gio";
        final var PASSWORD = "12345";

        System.out.print("Usuario: ");
        var usuario = scanner.nextLine().strip();
        System.out.print("Password: ");
        var password = scanner.nextLine().strip();

        if (usuario.equals(USUARIO) && password.equals(PASSWORD))
            System.out.printf("Bienvanido al Sistema %s", USUARIO);
        else if(!usuario.equals(USUARIO) && password.equals(PASSWORD))
            System.out.println("Usuario incorrecta, favor de corregirlo!");
        else if(usuario.equals(USUARIO) && !password.equals(PASSWORD))
            System.out.println("Contraseña incorrecto, favor de corregirlo!");
        else
            System.out.println("Usuario y Contraseña incorrectos, favor de corregirlos!");
    }
}
