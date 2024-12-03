public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hotelles ***");

        // Definimos las variables
        var nombreDelCliente = "Giovanni López";
        var diasDeEstancia = 7;
        var tarifaDiaria = 1300.00;
        var tieneVistaAlMar = true;

        System.out.println("nombreDelCliente = " + nombreDelCliente);
        System.out.println("diasDeEstancia = " + diasDeEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);

        // Modificando valores
        diasDeEstancia = 3;
        tarifaDiaria = 1000.00;
        tieneVistaAlMar = false;

        System.out.println();
        System.out.println("nombreDelCliente = " + nombreDelCliente);
        System.out.println("diasDeEstancia = " + diasDeEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);
    }
}
