package park;
import java.util.List;

public class ParqueDiversiones {
    private List<Atraccion> atracciones; // Corrección en el nombre de la variable

    public ParqueDiversiones(List<Atraccion> atracciones) {
        this.atracciones = atracciones;
    }

    public void asignarVisitante(Visitante visitante, Atraccion atraccion) {
        if (atraccion.getEstado().equals("En mantenimiento")) { // Se usa un método getter
            System.out.println("Reubicando visitante a otra atracción...");
            for (Atraccion otra : atracciones) {
                if (!otra.getEstado().equals("En mantenimiento") && visitante.puedeEntrar(otra) && otra.puedeRecibirMasVisitantes()) {
                    otra.agregarVisitante(visitante); // Ahora pasamos el visitante
                    System.out.println("Visitante reubicado a " + otra.getNombre());
                    return;
                }
            }
            System.out.println("No hay atracciones disponibles.");
        } else if (visitante.puedeEntrar(atraccion)) {
            if (atraccion.puedeRecibirMasVisitantes()) {
                atraccion.agregarVisitante(visitante); // Ahora pasamos el visitante
                System.out.println("Visitante ingresó a " + atraccion.getNombre());
            } else {
                System.out.println("La atracción " + atraccion.getNombre() + " está llena.");
            }
        } else {
            System.out.println("Acceso denegado por restricción de edad.");
        }
    }
}
