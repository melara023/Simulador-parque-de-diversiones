package park;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
public class ParqueDiversionesTest {
    @Test
    void testAsignarVisitanteAUnaAtraccion() {
        Atraccion montañaRusa = new MontañaRusa();
        Atraccion carrusel = new Carrusel();
        ParqueDiversiones parque = new ParqueDiversiones(Arrays.asList(montañaRusa, carrusel));

        Visitante adulto = new Visitante("Ana", 25, Arrays.asList(new Boleto(Boleto.Tipo.ADULTO)));

        parque.asignarVisitante(adulto, montañaRusa);
        assertTrue(montañaRusa.getVisitantes().contains(adulto));
    }
}
