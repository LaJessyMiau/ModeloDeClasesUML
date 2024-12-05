public class Usuario {
    public String email;
    public String nombre;
    int nivelDeAcceso; // package-private
    private String contrasenya;

    private boolean realizarPago(double monto) {
        // Lógica para realizar pago
        return true; // Suponemos que el pago fue exitoso
    }

    private void cambiarContrasenya(String nuevaContrasenya) {
        this.contrasenya = nuevaContrasenya;
    }
}
