package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks {
    private static final List<Snack> snacks;

    // Bloque static inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 35));
        snacks.add(new Snack("Refresco", 25));
        snacks.add(new Snack("Sandwich", 60));
    }

    public void agregarSnack(Snack snack) {
        snacks.add(snack);
    }

    public void mostarSnacks() {
        var inventarioSnacks = "";
        for (var snack : snacks)
            inventarioSnacks += snack.toString() + "\n";
        System.out.println("--- maquina_snacks.presentacion.servicio.Snacks en el Inventario ---");
        System.out.println(inventarioSnacks);
    }

    public List<Snack> getSnacks() {
        return snacks;
    }
}
