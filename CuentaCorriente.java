package U07_A02;

public class CuentaCorriente {
    private String dni;
    private String nombre;
    private double saldo;

    public CuentaCorriente(String dni, double saldo) {
        this(dni, "Desconocido", saldo);
    }

    public CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public boolean sacarDinero(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public void ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void mostrarInformacion() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo: " + saldo);
    }
}
