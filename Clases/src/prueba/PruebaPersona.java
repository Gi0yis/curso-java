package prueba;

import persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objetos ***");
        System.out.println("Variable estática: " + Persona.getContadorPersonas());
        var objeto1 = new Persona("Jose", "Perez");
        System.out.println(objeto1); // Automaticamente se llama toString
        System.out.println("Variable estática: " + Persona.getContadorPersonas()); // Metodo estatico

        // Objeto 2
//        var objeto2 = new Persona("Ian", "Gomez");
//        System.out.println(objeto2);
//        System.out.println("Variable estática: " + Persona.contadorPersonas); // no es buena practica acceder desde objetos

//        objeto1.mostarPersona();
//        System.out.println();
//
//        objeto1.setNombre("Giovanni");
//        objeto1.setApellido("López");
//
//        objeto1.mostarPersona();
//
//        System.out.println();
//        var objeto2 = new Persona("Juan", "Perez");
//
//        objeto2.mostarPersona();
//
//        System.out.println();
//        System.out.println(objeto2.getNombre());
//        System.out.println(objeto2.getApellido());
    }
}
