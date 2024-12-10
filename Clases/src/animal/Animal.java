package animal;

public class Animal {
    // protected --> los metodos solo se pueden acceder desde clases hijas o del mismo paquete.
//    protected void comer() {
//        System.out.println("Como muchas veces al día");
//    }
//
//    protected void dormir() {
//        System.out.println("Duermo muchas horas");
//    }
    protected void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}


class Perro extends Animal {
//    public void hacerSonido() {
//        System.out.println("Puedo ladrar");
//    }
//
//    @Override // no es necesario pero es recomendado usarlo.
//    protected void dormir() {
//        System.out.println("Duermo 15 horas al día");
//        System.out.println("Mét0do clase padre: ");
//        // Acceder al metodo de la clase padre
//        // super.dormir();
//    }

    protected void hacerSonido() {
        System.out.println("El perro hace wauf");
    }
}

class Gato extends Animal {
    protected void hacerSonido() {
        System.out.println("EL gato hace miau");
    }
}

class PruebaAnimal {
    // metodo polimorfico
    static void imprimirSonido(Animal animal) {
        animal.hacerSonido();
    }

    public static void main(String[] args) {
//        System.out.println("*** Ejemplo de herencia ***");
//        System.out.println("Clase padre, soy un Animal");
//
//        var animal1 = new Animal();
//
//        animal1.comer();
//        animal1.dormir();
//        // animal1.hacerSonido(); // Este metodo no existe en la clase padre
//
//        System.out.println("\nClase hija, soy un Perro");
//        var perro1 = new Perro();
//        perro1.comer();
//        perro1.dormir();
//        perro1.hacerSonido();

        // Objeto clase padre (Animal)
//        var animal = new Animal();
//        var animal = new Perro();
        var animal = new Gato();

        imprimirSonido(animal);


    }
}