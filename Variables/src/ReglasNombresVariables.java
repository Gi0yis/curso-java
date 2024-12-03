public class ReglasNombresVariables {
    public static void main(String[] args) {
        String nombreCompleto = "Giovanni López"; // Correcto, y buenas prácticas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Giovanni López 2"; // Correcto, no aplica las buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
        // String nombre-cliente = "Giovanni"; // Incorrecto
        String nombre_cliente = "Giovanni"; // Correcto, no aplica buenas practicas
        String _apellido = "López"; // Correcto y aceptable
        String $apellido = "López"; // Correcto y aceptable
        int totpzs = 10; // Correcto, no aplica buenas practicas
        int totalPiezas = 10; // Correcto, aplica buenas practicas
        boolean casado = true; // Correcto, aun puede mejorar
        boolean esCasado = true; // Correcto, y aplica buenas practicas
        boolean isCasado = true; // Correcto, y aplica buenas practicas *
        boolean tieneSaldo = false; // Correcto, y aplica buenas practicas
        boolean hasSaldo = false; // Correcto, y aplica buenas practicas *

    }
}
