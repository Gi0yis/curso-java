public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("*** Operador Or ***");
        boolean a = true, b = false;
        // or (regresa true si cualquiera de los valores es true)
        var resultado = a || b; // (||) --> Caracter pipe
        System.out.println("resultado = " + resultado);
    }
}
