import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scLine = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        //Creacion de Pilotos
        Piloto pil1 = new Piloto("Juan Perez", 45, 27890043, 33401, 10);
        Piloto pil2 = new Piloto("Sandra Martinez", 32, 30230003, 54144, 5);
        // Flota
        ArrayList<Avion> avionesNacionales = new ArrayList<>();
        ArrayList<Avion> avionesInternacionales = new ArrayList<>();

        Flota flotaNacional = new Flota(true, 2, avionesNacionales);
        Flota flotaInternacional = new Flota(false, 2, avionesInternacionales);

        //Creacion de Aviones
        Avion avion1 = new Avion("Boeing737", 150, 2010, flotaNacional);
        Avion avion2 = new Avion("Airbus A320", 200, 2005, flotaNacional);
        avionesNacionales.add(avion1);
        avionesNacionales.add(avion2);
        Avion avion3 = new Avion("Gulfstream G650", 5, 2016, flotaInternacional);
        Avion avion4 = new Avion("Global 6000 ", 8, 2020, flotaInternacional);
        avionesInternacionales.add(avion3);
        avionesInternacionales.add(avion4);

        //Vuelos
        ArrayList<Reserva> reservas = new ArrayList<>();
        ArrayList<Vuelo> vuelosDisponibles = new ArrayList<>();
        Vuelo vuelo1 = new Vuelo("23/04/24", "23:30", "Buenos Aires", "Mendoza", pil2, avion1, reservas);
        Vuelo vuelo2 = new Vuelo("05/06/24", "12:25", "Barcelona", "Buenos Aires", pil1, avion3, reservas);
        Vuelo vuelo3 = new Vuelo("ABIERTO", "SIN HORA", "SIN DESTINO", "SIN ORIGEN", null, null, null);
        vuelosDisponibles.add(vuelo1);
        vuelosDisponibles.add(vuelo2);

        //Servicio de reservas

        Vuelo vueloElegido = vuelo3;
        System.out.println("----------------");
        System.out.println("NUEVA RESERVA");
        System.out.println("Vuelos Disponibles: ");
        int index = 1;
        for(Vuelo vuelo : vuelosDisponibles){
            System.out.println("-----------VUELO "+index+"-----------");
            System.out.println("ORIGEN: "+ vuelo.getOrigen());
            System.out.println("DESTINO: "+ vuelo.getDestino());
            System.out.println("FECHA: "+ vuelo.getFecha());
            System.out.println("HORARIO: "+ vuelo.getHora());
            System.out.println("----------------------------");
            index++;
        }
        System.out.println("INGRESE NUMERO DE VUELO A ELEGIR: ");
        int numeroVuelo = sc.nextInt();
        if (numeroVuelo == 1) {
            vueloElegido = vuelo1;
        } else if (numeroVuelo == 2) {
            vueloElegido = vuelo2;
        }

        System.out.println("INGRESASTE EL VUELO "+numeroVuelo);
        System.out.println("Ingrese nombre del pasajero: ");
        String nombre = scLine.nextLine();
        System.out.println("Ingrese asiento: (NUM-CHAR)");
        String asiento = scLine.nextLine();

        Reserva reserva1 = new Reserva(generarNumeroAleatorio(),nombre, asiento, vueloElegido);
        reservas.add(reserva1);


        System.out.println("RESERVA REGISTRADA CORRECTAMENTE");
        System.out.println("Los datos de tu vuelo son: ");
        System.out.println("---------------------------------");
        System.out.println("NOMBRE PASAJERO: "+ reserva1.getPasajero());
        System.out.println("FECHA:" + reserva1.getVueloDesignado().getFecha());
        System.out.println("ORIGEN: "+ reserva1.getVueloDesignado().getOrigen());
        System.out.println("DESTINO: "+ reserva1.getVueloDesignado().getDestino());
        System.out.println("HORA: "+ reserva1.getVueloDesignado().getHora());
        System.out.println("PILOTO: "+ reserva1.getVueloDesignado().getPilotoDesignado());
        System.out.println("----AVION----");
        System.out.println("MODELO:"+ reserva1.getVueloDesignado().getAvionDesignado().getModelo());
        System.out.println("FLOTA COMERCIAL: " + reserva1.getVueloDesignado().getAvionDesignado().getFlotaPerteneciente().getEs_comercial());
        System.out.println("CAPACIDAD: "+ reserva1.getVueloDesignado().getAvionDesignado().getCapacidad() +" personas");
        System.out.println("AÑO FABRICACION: "+ reserva1.getVueloDesignado().getAvionDesignado().getAnio());
        System.out.println("------------------------------------");
        System.out.println("Listos para despegar");
        reserva1.getVueloDesignado().getPilotoDesignado().volar();
    }

    public static int generarNumeroAleatorio() {
        Random rand = new Random();
        int numero = rand.nextInt(90000) + 10000; // Genera un número aleatorio entre 10000 y 99999
        return numero;
    }
}
