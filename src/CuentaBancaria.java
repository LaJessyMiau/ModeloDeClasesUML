public class CuentaBancaria {
    public String numeroCuenta;
    public String nombreTitular;
    private double saldo;
    String moneda; // package-private

    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    private boolean retirar(double cantidad) {
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }
}
