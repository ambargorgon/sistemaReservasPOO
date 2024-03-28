import java.util.ArrayList;

public class Flota {
    private Boolean es_comercial;
    private int cantidad_aviones;

    public Flota(Boolean es_comercial, int cantidad_aviones, ArrayList<Avion> aviones) {
        this.es_comercial = es_comercial;
        this.cantidad_aviones = cantidad_aviones;
        this.aviones = aviones;
    }

    //Composicion con Avion
    private ArrayList<Avion> aviones = new ArrayList<>();

    public Boolean getEs_comercial() {
        return es_comercial;
    }
}
