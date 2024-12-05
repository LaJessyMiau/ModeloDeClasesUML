public class Vuelo {
    public String codigoVuelo;
    public String aerolinea;
    protected int asientosDisponibles;
    String ruta; // package-private

    protected boolean reservarAsiento(int numero) {
        boolean reservaExitosa = false;
        if (asientosDisponibles >= numero) {
            asientosDisponibles -= numero;
            reservaExitosa = true;
        }
        return reservaExitosa;
    }

    protected void modificarRuta(String nuevaRuta) {
        this.ruta = nuevaRuta;
    }
}
