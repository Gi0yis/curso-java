public class IndicesCadenas {
    public static void main(String[] args) {
        // Manejo de índices en una cadena
        var cadena1 = "Hola Mundo";

        // Recuperar e primer caracter
        var primerCaracter = cadena1.charAt(0); // Recuperar el caracter de 'H'
        System.out.println("primerCaracter = " + primerCaracter);
        // Recuperar el ultimo caracter
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        var caracterMedio = cadena1.charAt(5);
        System.out.println("caracterMedio = " + caracterMedio);
    }
}
