public class Comercio {
    public String nombreComercio;
    String direccion; // package-private
    double ingresosAnuales; // package-private
    private String claveRegistro;

    protected int registrarVenta(float cantidad) {
        ingresosAnuales += cantidad;
        return (int) (Math.random() * 10000); // Devuelve un registro único (simulado)
    }

    private String consultarClave() {
        return claveRegistro;
    }
}
