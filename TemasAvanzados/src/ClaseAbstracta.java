public class ClaseAbstracta {
    public static void main(String[] args) {
        // FiguraGeometrica figuraGeometrica = new FiguraGeometrica(); // error, no se puede instanciar

        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();

        Circulo circulo = new Circulo();
        circulo.dibujar();
    }
}

// Clase abstracta
abstract class FiguraGeometrica { // No se pueden instanciar
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica {

    // Implementación
    @Override
    public void dibujar() {
        System.out.println("Se dibuja un Rectangulo");
    }
}

class Circulo extends FiguraGeometrica {
    public void dibujar() {
        System.out.println("Se dibuja un Circulo");
    }
}