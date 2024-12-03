import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var random = new Random();
        var crearId = new StringBuffer();
        System.out.println("*** Sistema Generador de ID Único ***");
        System.out.print("Ingrese su nombre: ");
        var nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        var apellidoUsuario = scanner.nextLine();
        System.out.print("Ingrese su año de nacimiento (YYYY): ");
        var nacimientoUsuario = Integer.parseInt(scanner.nextLine());
        var valorAleatorio = random.nextInt(999) + 1;

//        var identificador = String.join("", nombreUsuario.substring(0, 2).toUpperCase(), apellidoUsuario.substring(0, 2).toUpperCase(),
//                String.valueOf(nacimientoUsuario).substring(2, 4));
        var identificador = crearId.append(nombreUsuario.toUpperCase(), 0, 2).append(apellidoUsuario.toUpperCase(), 0, 2)
                .append(String.valueOf(nacimientoUsuario), 2, 4);

        System.out.printf("""
                Hola %s,
                \tTu nuevo número de identificación (ID) generado por el sistema es:
                \t%s%04d
                \tFelicidades!
                """, nombreUsuario, identificador, valorAleatorio);
    }
}
