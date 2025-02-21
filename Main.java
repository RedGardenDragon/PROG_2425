package U07_A02;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", 500.0);
        CuentaCorriente cuenta2 = new CuentaCorriente("87654321B", "Juan Pérez", 1000.0);

        System.out.println("Información de cuenta1:");
        cuenta1.mostrarInformacion();
        
        System.out.println("\nSacando 200 de cuenta1: " + (cuenta1.sacarDinero(200) ? "Éxito" : "Fondos insuficientes"));
        cuenta1.mostrarInformacion();

        System.out.println("\nIngresando 300 en cuenta2");
        cuenta2.ingresarDinero(300);
        cuenta2.mostrarInformacion();
    }
}
