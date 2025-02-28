package park;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
public class AtraccionTest {
    @Test
    void testAgregarVisitanteConBoletoValido() {
        Atraccion montañaRusa = new MontañaRusa();
        Visitante adulto = new Visitante("Ana", 25, Arrays.asList(new Boleto(Boleto.Tipo.ADULTO)));

        assertTrue(montañaRusa.agregarVisitante(adulto));
    }

    @Test
    void testNoAgregarVisitantePorEdad() {
        Atraccion montañaRusa = new MontañaRusa();
        Visitante niño = new Visitante("Pepe", 6, Arrays.asList(new Boleto(Boleto.Tipo.INFANTIL)));

        assertFalse(montañaRusa.agregarVisitante(niño));
    }
}
