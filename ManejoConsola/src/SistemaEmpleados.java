import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Empleados ***");

        var scanner = new Scanner(System.in);

        // Nombre del empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = scanner.nextLine();

        // Edad del empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(scanner.nextLine());

        // Salario del empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(scanner.nextLine());

        // Es jefe de departamento
        System.out.print("Es jefe de departamento (true/false)? ");
        var esJefeDepartamento = Boolean.parseBoolean(scanner.nextLine());

        // Imprimir los valores del Empleado
        System.out.println("\n Datos del Empleado: ");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado + " años");
//        System.out.println("\tSalario: " + salarioEmpleado);
//        System.out.println("\tSalario: $%.2f".formatted(salarioEmpleado));
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado); // %n --> salto de linea / printf --> imprimir con formato
        System.out.println("\tEs jefe de departemento? " + esJefeDepartamento);
    }
}
