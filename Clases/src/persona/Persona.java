package persona;

public class Persona {
//    public static int contadorPersonas = 0;
    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        // incrementar el atributo static
//        Persona.contadorPersonas++;
        this.idPersona = ++Persona.contadorPersonas; // Asignamos el id unico con ayuda de la variable estatica
    }

    @Override
    public String toString() {
        return "ID: " + this.idPersona + ", Nombre: " + this.nombre + ", Apellido: " + apellido
                + ", Dir. Mem. " + super.toString();
    }

//    public void mostarPersona() {
//        System.out.println("Nombre: " + this.nombre);
//        System.out.println("Apellido: " + this.apellido);
//    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public static int getContadorPersonas() {
        return Persona.contadorPersonas;
    }
}

// Se pueden tener varias clases, pero la recomendación es una por archivo.
//class Clase2 {
//
//}
//
//class Clase3 {
//
//}