package park;
import java.util.Arrays;


public class TestPark {
    public static void main(String[] args) {
        Atraccion montañaRusa = new MontañaRusa();
        Atraccion carrusel = new Carrusel();
        Atraccion casaDelTerror = new CasaTerror();

        ParqueDiversiones parque = new ParqueDiversiones(Arrays.asList(montañaRusa, carrusel, casaDelTerror));

        Visitante niño = new Visitante("Pepe", 6, Arrays.asList(new Boleto(Boleto.Tipo.INFANTIL)));
        Visitante adulto = new Visitante("Ana", 25, Arrays.asList(new Boleto(Boleto.Tipo.ADULTO)));
        Visitante vip = new Visitante("Carlos", 30, Arrays.asList(new Boleto(Boleto.Tipo.VIP)));

        // Prueba de restricción de edad
        parque.asignarVisitante(niño, montañaRusa); // Debe fallar

        // Prueba de boleto VIP
        parque.asignarVisitante(vip, montañaRusa); // Debe entrar sin restricciones

    }
}
