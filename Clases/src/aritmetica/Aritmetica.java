package aritmetica;

public class Aritmetica {
    private int operando1;
    private int operando2;

    // Constructor vacio
    public Aritmetica() {
        // operando1 = 10; // Es posible inicializar valores pero no es recomendado. Es mejor a partir de parametros.

    } // Se crea de manera automatica si no se crea uno. Si creamos uno ya no crea uno de manera automatica.

    // Sobrecarga de constructores
    // Constructor
    public Aritmetica(int operando1, int operando2) {
//        System.out.println("Ejecutando el constructor");
        this.operando1 = operando1; // this --> solo funciona dentro de la clase
        this.operando2 = operando2;
//        System.out.println("Operador this: " + this);
    }

    public void sumar() {
        var resultado = this.operando1 + this.operando2;
        System.out.println("Resultado Suma: " + resultado);
    }

    public void restar() {
        var resultado = this.operando1 - this.operando2;
        System.out.println("Resultado resta: " + resultado);
    }

    public int getOperando1() {
        return this.operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return this.operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
