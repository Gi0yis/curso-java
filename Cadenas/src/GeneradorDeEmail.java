public class GeneradorDeEmail {
    public static void main(String[] args) {
        var nombre = "  Giovanni Yisrael López  ";
        var empresa = "  Universidad San Carlos"      ;
        var dominio = "edu.gt";

        // Normalizar datos
        nombre = nombre.trim();
        empresa = empresa.trim();
        var usuarioNormalizado = nombre.toLowerCase().replace(" ", ".").replace("ó", "o");
        var empresaNormalizada = empresa.toLowerCase().replace(" ", "");
        var extensionDominio = String.join("", ".", dominio);
        var dominioEmail = new StringBuffer();
        var dominioNormalizado = dominioEmail.append("@").append(empresaNormalizada).append(extensionDominio).toString();

        var emailGenerado = String.join("", usuarioNormalizado, dominioNormalizado);

        // Mostar datos
        System.out.println("*** Generador de Emails ***");
        System.out.println("Nombre usuario: " + nombre);
        System.out.println("Nombre de usuario normalizado: " + usuarioNormalizado);

        System.out.println("\nNombre empresa: " + empresa);
        System.out.println("Extensión del dominio: " + extensionDominio);
        System.out.println("Domino de email normalizado: " + dominioNormalizado);

        System.out.println("\nEmail final generado: " + emailGenerado);

    }
}
