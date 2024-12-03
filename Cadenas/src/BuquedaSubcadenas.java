public class BuquedaSubcadenas {
    public static void main(String[] args) {
        // Buscar subcadenas
        // indexOf - Devuelve el indice de la primera aparicion de la subcadena
        var cadena1 = "Hola Mundo";
        // subcadena a buscar
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        // lastIndexOf - devuelve el indice de la ultima aparicion de la subcadena
        // subcadena de mundo
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        // Subcadena no encontrada devuelve -1
//        var indice3 = cadena1.indexOf("Java");
        var indice3 = cadena1.lastIndexOf("Java");
        System.out.println("indice3 = " + indice3);









    }
}
