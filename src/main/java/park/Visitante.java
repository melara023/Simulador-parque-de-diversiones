package park;
import java.util.ArrayList;
import java.util.List;

public class Visitante {

    private String nombre;
    private int edad;
    private List<Boleto> listaDeBoletos;

    // 🔹 Nuevo constructor que acepta boletos
    public Visitante(String nombre, int edad, List<Boleto> boletos) {
        this.nombre = nombre;
        this.edad = edad;
        this.listaDeBoletos = new ArrayList<>(boletos); // Copia la lista pasada
    }

    public Visitante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.listaDeBoletos = new ArrayList<Boleto>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void agregarBoleto(Boleto boleto) {
        listaDeBoletos.add(boleto);
    }


    //validaciones
    public boolean tieneBoletoVIP() {
        for (Boleto boleto : listaDeBoletos) {
            if (boleto.getTipo() == Boleto.Tipo.VIP) {
                return true;
            }
        }
        return false;
    }

    public List<Boleto>getListaDeBoletos(){
        return listaDeBoletos;
    }

    public boolean puedeEntrar(Atraccion atraccion) {
        return this.edad >= atraccion.getEdadMinima() || tieneBoletoVIP();
    }
}
