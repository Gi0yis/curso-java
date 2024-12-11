package maquina_snacks_archivos.dominio;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int contadorSnack = 0;
    private int idSnak;
    private String nombre;
    private double precio;

    public Snack() {
        this.idSnak = ++Snack.contadorSnack;
    }

    public static int getContadorSnack() {
        return contadorSnack;
    }

    public Snack(String nombre, double precio) {
        this(); // llamar al constructor vacio, debe ser la primer linea
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdSnak() {
        return idSnak;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "idSnak=" + idSnak +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public String escribirSnacks(){
        return idSnak + "," + nombre + "," + precio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnak == snack.idSnak && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnak, nombre, precio);
    }
}
