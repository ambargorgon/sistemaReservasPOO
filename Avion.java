import java.util.ArrayList;
public class Avion {
    private String modelo;
    private int capacidad;
    private int anio;

    private Flota flotaPerteneciente;

    public Avion(String modelo, int capacidad, int anio, Flota flotaPerteneciente) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.anio = anio;
        this.flotaPerteneciente = flotaPerteneciente;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getAnio() {
        return anio;
    }

    public Flota getFlotaPerteneciente() {
        return flotaPerteneciente;
    }
}