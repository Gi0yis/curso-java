package zona_fit.dominio;

import java.util.Objects;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private int menbresia;

    public Cliente() {}

    public Cliente(int id) {
        this.id = id;
    }

    public Cliente(String nombre, String apellido, int menbresia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.menbresia = menbresia;
    }

    public Cliente(int id, String nombre, String apellido, int menbresia) {
        this(nombre, apellido, menbresia);
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getMenbresia() {
        return this.menbresia;
    }

    public void setMenbresia(int menbresia) {
        this.menbresia = menbresia;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", menbresia=" + menbresia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id && menbresia == cliente.menbresia && Objects.equals(nombre, cliente.nombre) && Objects.equals(apellido, cliente.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, menbresia);
    }
}
