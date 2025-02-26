package park;

public class Boleto {

    //enumeracion tipos de boletos
    public enum Tipo { INFANTIL, ADULTO, VIP }

    private Tipo tipo;
    private double precio;

    public Boleto(Tipo tipo) {
        this.tipo = tipo;
        switch (tipo) {
            case INFANTIL:
                this.precio = 5.0;
                break;
            case ADULTO:
                this.precio = 10.0;
                break;
            case VIP:
                this.precio = 20.0;
                break;
            }
        }

        public double getPrecio() {
        return precio;
    }

        public Tipo getTipo() {
        return tipo;
    }

}

