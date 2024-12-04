public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("*** Operadores Aritméticos ***");
        // Declaración compuesta --> Se pueden crear variables del mismo tipo en una sola linea (no se puede con "var")
        int a = 5, b = 3, resultado;

        // Suma +
        resultado = a + b;
        System.out.println("resultado = " + resultado);

        // Resta -
        resultado = a - b;
        System.out.println("resultado = " + resultado);

        // Multiplicación
        resultado = a * b;
        System.out.println("resultado = " + resultado);

        // Dicisión
        resultado = a / b;
        System.out.println("resultado = " + resultado);

        // Modulo
        resultado = a % b;
        System.out.println("resultado = " + resultado);
    }
}
