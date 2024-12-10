package prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo aritmetica.Aritmetica ***");
        var aritmetica1 = new Aritmetica(5, 7);
//        aritmetica1.operando1 = 5;
//        aritmetica1.operando2 = 7;

        System.out.println("Atributo operando1: " + aritmetica1.getOperando1());
        aritmetica1.setOperando1(10);
        aritmetica1.setOperando2(15);

        aritmetica1.sumar();
        aritmetica1.restar();

//        System.out.println("Dirección de memoria obj1: " + aritmetica1);

//        System.out.println();
//
//        var aritmetica2 = new aritmetica.Aritmetica();
//        aritmetica2.operando1 = 12;
//        aritmetica2.operando2 = 16;
//
//        aritmetica2.sumar();
//        aritmetica2.restar();

//        System.out.println();
//
//        var aritmetica2 = new aritmetica.Aritmetica();
//        aritmetica2.operando1 = 12;
//        aritmetica2.operando2 = 8;
//        aritmetica2.sumar();
//        System.out.println();

//        var aritmetica2 = new Aritmetica(12, 16);
//        aritmetica2.sumar();
//        System.out.println("Dirección de memoria obj1: " + aritmetica2);
    }
}
