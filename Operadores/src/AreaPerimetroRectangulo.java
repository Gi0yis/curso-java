import java.util.Scanner;

public class AreaPerimetroRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calcular Área y Perímetro de un Rectángulo ---");

        System.out.print("Base del rectángulo (cm): ");
        var baseRectangulo = Double.parseDouble(scanner.nextLine());

        System.out.print("Altura del rectángulo (cm): ");
        var alturaRectangulo = Double.parseDouble(scanner.nextLine());


        // Calcular el área
        var area = baseRectangulo * alturaRectangulo;
        // Calcular el perímetro
        var perimetro = 2 * (baseRectangulo + alturaRectangulo);

        System.out.printf("""
                %n--------------------------------
                Área y Perímetro del Rectángulo
                Área = %.2f
                Perímetro = %.2f
                --------------------------------
                """, area, perimetro);
    }
}
