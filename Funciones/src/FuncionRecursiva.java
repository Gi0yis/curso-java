public class FuncionRecursiva {
    // Imprimir número del 1 al 5 usando una función recursiva
    // Función recursiva

    static void funcionRecursiva(int numero) {
        if (numero == 1)
            System.out.print(numero + " ");
        else {
            // Caso recursivo
            System.out.print(numero + " "); // Ascendente
            funcionRecursiva(numero - 1);
//            System.out.print(numero + " "); // Descendente
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
