public class Reserva {
    private int nro_reserva;
    private String pasajero;
    private String asiento;
    private Vuelo vueloDesignado;

    public Reserva(int nro_reserva, String pasajero, String asiento, Vuelo vueloDesignado) {
        this.nro_reserva = nro_reserva;
        this.pasajero = pasajero;
        this.asiento = asiento;
        this.vueloDesignado = vueloDesignado;
    }

    public int getNro_reserva() {
        return nro_reserva;
    }

    public void setNro_reserva(int nro_reserva) {
        this.nro_reserva = nro_reserva;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public Vuelo getVueloDesignado() {
        return vueloDesignado;
    }

    public void setVueloDesignado(Vuelo vueloDesignado) {
        this.vueloDesignado = vueloDesignado;
    }
}
