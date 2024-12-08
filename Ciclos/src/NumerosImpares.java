public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("--- Números Impares del 0 al 20 ---");

        var i = 0;

        do {
            if (i % 2 != 0) System.out.println(i);
            i++;
        } while (i <= 20);
    }
}
