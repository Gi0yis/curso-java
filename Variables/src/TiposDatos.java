public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en Java
        // Enteros (su valor por defecto es 0)

        byte tipoByte = 127;
        // soutv
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // L o l para indicar tipo long
        System.out.println("tipoLong = " + tipoLong);

        // Punto flotante (su valor por defecto es 0.0)
        float tipoFloat = 3.14f; // F o f para indicar tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1415d; // D o d para indicar tipo double (opcional)
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter (su valor por defecto es '\u0000')
        char tipoChar = 'A'; // caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (su valor por defecto es false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object (Referencia)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Giovanni";
        System.out.println("nombre = " + nombre);

    }
}
