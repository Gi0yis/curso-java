public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma Acumulativa ***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        var numero = 1;

        while (numero <= MAXIMO) {
            System.out.println("(acumuladorSuma + numero) -> " + acumuladorSuma + " + " + numero);

            acumuladorSuma += numero++;
            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");
        }

        System.out.println("Suma de los primeros " + MAXIMO + " números: " + acumuladorSuma);

        acumuladorSuma = 0;

        // Usando for y do-while

        for (int i = 1; i <= MAXIMO; i++)
            acumuladorSuma += i;

        System.out.println("\nSuma de los primeros " + MAXIMO + " números: " + acumuladorSuma);

        acumuladorSuma = 0;
        numero = 1;

        do {
            acumuladorSuma += numero++;
        } while (numero <= MAXIMO);

        System.out.println("\nSuma de los primeros " + MAXIMO + " números: " + acumuladorSuma);
    }
}
