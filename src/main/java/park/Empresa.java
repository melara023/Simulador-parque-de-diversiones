package park;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Atraccion> atracciones;
    private List<String> historialEventos;


    public Empresa() {
        atracciones = new ArrayList<Atraccion>();
        historialEventos = new ArrayList<String>();
    }


    public void agregarAtraccion(Atraccion atraccion) {
        atracciones.add(atraccion);
    }


    public void registrarEvento(String evento) {
        historialEventos.add(evento);  //
    }


    public void mostrarHistorialEventos() {
        System.out.println("Historial de Eventos:");
        for (String evento : historialEventos) {
            System.out.println("- " + evento);
        }
    }

    public List<Atraccion> getAtracciones() {
        return atracciones;
    }
}
