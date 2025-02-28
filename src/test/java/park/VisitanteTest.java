package park;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class VisitanteTest {
    @Test
    void testTieneBoletoVIP() {
        Visitante visitante = new Visitante("Carlos", 30, Arrays.asList(new Boleto(Boleto.Tipo.VIP)));
        assertTrue(visitante.tieneBoletoVIP());
    }

    @Test
    void testNoTieneBoletoVIP() {
        Visitante visitante = new Visitante("Ana", 25, Arrays.asList(new Boleto(Boleto.Tipo.ADULTO)));
        assertFalse(visitante.tieneBoletoVIP());
    }
}
