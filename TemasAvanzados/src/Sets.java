import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos"); // No permite duplicados
        conjunto.add("Karla");
        conjunto.add("Victoria");

        System.out.println("Elementos del set");
        conjunto.forEach(System.out::println);

        // Remover elemtos
        conjunto.remove("Karla");
        System.out.println("\nNuevos Elementos del set");
        conjunto.forEach(System.out::println);
    }
}
