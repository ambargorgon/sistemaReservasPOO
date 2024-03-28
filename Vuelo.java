import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
    private String fecha;
    private String hora;
    private String destino;
    private String origen;

    //Asociacion directa con Piloto
    private Piloto pilotoDesignado;

    //Asociacion 1 a 1 con Avion
    private Avion avionDesignado;

    //Agregacion con reserva
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public Vuelo(String fecha, String hora, String destino, String origen, Piloto pilotoDesignado, Avion avionDesignado, ArrayList<Reserva> reservas) {
        this.fecha = fecha;
        this.hora = hora;
        this.destino = destino;
        this.origen = origen;
        this.pilotoDesignado = pilotoDesignado;
        this.avionDesignado = avionDesignado;
        this.reservas = reservas;
    }


    //GET para acceder desde MAIN
    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigen() {
        return origen;
    }

    public Piloto getPilotoDesignado() {
        return pilotoDesignado;
    }

    public Avion getAvionDesignado() {
        return avionDesignado;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
}
