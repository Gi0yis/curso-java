public interface Traductor {
    // Por defecto los metodos son (public y abstract)
    void traducir();

    // Metodos con implementacion por default
    default void iniciarTraductor() {
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor {

    @Override
    public void traducir() {
        System.out.println("Traduzco a Ingles");
    }
}

class Frances implements Traductor {
    public void traducir() {
        System.out.println("Traduzco a Ingles");
    }

    @Override
    public void iniciarTraductor() {
        System.out.println("Iniciando Traductor en Frances");
    }
}

class PruebaTraductor {
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();

        System.out.println();

        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}