package prueba;

import persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objetos ***");
        var objeto1 = new Persona("Jose", "Perez");
        objeto1.mostarPersona();
        System.out.println();

        objeto1.setNombre("Giovanni");
        objeto1.setApellido("López");

        objeto1.mostarPersona();

        System.out.println();
        var objeto2 = new Persona("Juan", "Perez");

        objeto2.mostarPersona();

        System.out.println();
        System.out.println(objeto2.getNombre());
        System.out.println(objeto2.getApellido());
    }
}
