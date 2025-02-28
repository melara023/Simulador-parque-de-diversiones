package park;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BoletoTest {
    @Test
    void testCrearBoletoInfantil() {
        Boleto boleto = new Boleto(Boleto.Tipo.INFANTIL);
        assertEquals(Boleto.Tipo.INFANTIL, boleto.getTipo());
        assertEquals(5.0, boleto.getPrecio());
    }

    @Test
    void testCrearBoletoAdulto() {
        Boleto boleto = new Boleto(Boleto.Tipo.ADULTO);
        assertEquals(Boleto.Tipo.ADULTO, boleto.getTipo());
        assertEquals(10.0, boleto.getPrecio());
    }

    @Test
    void testCrearBoletoVIP() {
        Boleto boleto = new Boleto(Boleto.Tipo.VIP);
        assertEquals(Boleto.Tipo.VIP, boleto.getTipo());
        assertEquals(20.0, boleto.getPrecio());
    }
}
