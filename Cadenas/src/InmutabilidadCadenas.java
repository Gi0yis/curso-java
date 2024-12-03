public class InmutabilidadCadenas {
    public static void main(String[] args) {
        // Inmutavilidad de Cadenas
        var caden1 = "Hola";
        System.out.println("caden1 = " + caden1);
        var cadena2 = caden1;
        caden1 = "Adios";
        System.out.println("caden1 Modificada = " + caden1);
        System.out.println("cadena2 = " + cadena2);
    }
}
