public class MatrizSimple {
    public static void main(String[] args) {
        var matriz = new int[][]{{100, 200, 300}, {400, 500, 600}};

        for (var ren = 0; ren < matriz.length; ren++) {
            // 2. Ciclo interno. Recorrer las columnas
            for (var col = 0; col < matriz[ren].length; col++) {
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
