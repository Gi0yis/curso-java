public class RecorrerMatriz {
    public static void main(String[] args) {
        System.out.println("Matrices en Java");

        final var REGLONES = 2;
        final var COLUMNAS = 3;

        var matriz = new int[REGLONES][COLUMNAS];

        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valor 2 [0][1] = " + matriz[0][1]);
        System.out.println("Valor 3 [0][2] = " + matriz[0][2]);
        System.out.println("Valor 4 [1][0] = " + matriz[1][0]);
        System.out.println("Valor 5 [1][1] = " + matriz[1][1]);
        System.out.println("Valor 6 [1][2] = " + matriz[1][2]);

        // Recorrer una matriz

        // 1. Ciclo externo. Recorrer los renglones
        for (var ren = 0; ren < REGLONES; ren++) {
            // 2. Ciclo interno. Recorrer las columnas
            for (var col = 0; col < COLUMNAS; col++) {
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
