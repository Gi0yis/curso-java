public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        // Sin el uso de var
        String nombre1 = "Giovanni";
        System.out.println("nombre1 = " + nombre1);

        // Con el uso de var
        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);

        // Definir otras variables
        var edad = 30; // Se infiere el tipo int
        System.out.println("edad = " + edad);
        var sueldo = 500.50F; // se infiere el tipo float
        var esCasado = false; // se infiere el tipo boolean
        esCasado = true;
//      esCasado = "No"; // No podemos asignar un tipo distinto

        // se debe definir un valor
//        var precio; eato lanza un error, tenemos que asignar un valor
//        precio = 10;

        // se debe inferir el tipo de dato
//        var apellido = null; no se puede inferir el tipo de dato












    }
}
