public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("*** break y continue ***");

        // Imprimir solo el primer número par
        for (var numero = 1; numero < 10; numero++) {
            if (numero % 2 == 0) {
                System.out.print(numero + " \n\n");
                break;
            }
        }

        // Imprimir solo números pares
        for (int numero = 1; numero < 10; numero++) {
            if (numero % 2 == 1)
                continue;

            System.out.println(numero);
        }
    }
}
