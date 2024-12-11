package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<maquina_snacks.Snack> snacks;

    // Bloque static inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 35));
        snacks.add(new Snack("Refresco", 25));
        snacks.add(new Snack("Sandwich", 60));
    }

    public static void agregarSnack(Snack snack) {
        snacks.add(snack);
    }

    public static void mostarSnacks() {
        var inventarioSnacks = "";
        for (var snack : snacks)
            inventarioSnacks += snack.toString() + "\n";
        System.out.println("--- maquina_snacks.presentacion.servicio.Snacks en el Inventario ---");
        System.out.println(inventarioSnacks);
    }

    public static List<Snack> getSnacks() {
        return snacks;
    }
}
