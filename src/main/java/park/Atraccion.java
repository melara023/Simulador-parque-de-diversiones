package park;
import java.util.ArrayList;
import java.util.List;

    interface Operable {
        void iniciar();

        void detener();

        void realizarMantenimiento();

    }


    public abstract class Atraccion {
        protected String nombre;
        protected int capacidadMaxima;
        protected int edadMinima;
        protected boolean enMantenimiento;
        protected List<Visitante> visitantes;


    public Atraccion(String nombre, int capacidadMaxima, int edadMinima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.edadMinima = edadMinima;
        this.enMantenimiento = false;
        this.visitantes = new ArrayList<Visitante>();
    }

        public String getNombre() {
            return nombre;
        }

        public int getCapacidadMaxima() {
            return capacidadMaxima;
        }

        public int getEdadMinima() {
            return edadMinima;
        }

        public boolean isEnMantenimiento() {
            return enMantenimiento;
        }

        //validaciones
        public boolean agregarVisitante(Visitante visitante) {
            if (visitantes.size() < capacidadMaxima) { //validacion capacidad maxima
                if (visitante.tieneBoletoVIP() || visitante.getEdad() >= edadMinima) { //validacion de edad minima o VIP
                    visitantes.add(visitante);
                    return true;
                } else {
                    System.out.println(visitante.getNombre() + " no cumple con la edad mínima para " + nombre);
                }
            } else {
                System.out.println(nombre + " está lleno.");
            }
            return false;
        }

        //metodo reubicar a otra atraccion
        public void reubicarVisitantes(Atraccion nuevaAtraccion) {
            for (Visitante visitante : new ArrayList<Visitante>(visitantes)) {
                if (nuevaAtraccion.agregarVisitante(visitante)) {
                    System.out.println(visitante.getNombre() + " ha sido reubicado a la atracción: " + nuevaAtraccion.getNombre());
                    visitantes.remove(visitante);
                }
            }
        }


        public void iniciar() {
            if (!enMantenimiento) {
                System.out.println(nombre + " ha comenzado a funcionar.");
            } else {
                System.out.println(nombre + " no puede iniciar porque está en mantenimiento.");
            }
        }

        public void detener() {
            System.out.println(nombre + " se ha detenido.");
        }


        public void realizarMantenimiento() {
            enMantenimiento = true;
            System.out.println(nombre + " está en mantenimiento.");
        }

        public String getEstado() {
            return enMantenimiento ? "En mantenimiento" : "Operativa";
        }


        public boolean puedeRecibirMasVisitantes() {
            return visitantes.size() < capacidadMaxima; // Verifica si hay cupo disponible
        }


    }

