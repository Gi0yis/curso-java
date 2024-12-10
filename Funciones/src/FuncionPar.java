import java.util.Scanner;

public class FuncionPar {

    static boolean esPar(int numero) {
//        if (numero % 2 == 0)
//            return true;
//        else
//            return false;
        return (numero % 2 == 0) ? true : false;
    }

    public static void main(String[] args) {
        System.out.print("Proporciona en valor numérico: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("¿Número par? " + esPar(numero));
    }
}
