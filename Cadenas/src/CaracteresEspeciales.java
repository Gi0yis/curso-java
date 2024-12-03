public class CaracteresEspeciales {
    public static void main(String[] args) {
        // Caracteres Especiales
        // \n - Imprimir un salto del linea
        var cadena1 = "Hola\nMundo";
        System.out.println("cadena1 = " + cadena1);

        // '\t' - tabulador
        var cadena2 = "\tHola\tMundo";
        System.out.println("cadena2 = " + cadena2);

        // "\'" o '\"' - agrega una comilla simple o una comilla doble
        var cadena3 = "Hola \'Mundo\'"; // Aqui "\'" es opcional
        System.out.println("cadena3 = " + cadena3);
        var cadena4 = "Hola \"Mundo\"";
        System.out.println("cadena4 = " + cadena4);

        // "\\" - agrega una diagonal invertida
        var cadena5 = "Hola \\ Mundo";
        System.out.println("cadena5 = " + cadena5);
    }
}
