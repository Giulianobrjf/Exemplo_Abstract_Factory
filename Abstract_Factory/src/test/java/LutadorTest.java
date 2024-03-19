import org.example.FabricaAbstrata;
import org.example.FabricaPesado;
import org.example.FabricaPena;
import org.example.Lutador;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LutadorTest {
    @Test
    void deveEmitirRelatorioPena() {
        FabricaAbstrata fabrica = new FabricaPena();
        Lutador lutador  = new Lutador(fabrica);
        assertEquals("Relatorio de Lutador Peso Pena", lutador.emitirRelatorio());
    }

    @Test
    void deveEmitirRelatorioPesado() {
        FabricaAbstrata fabrica = new FabricaPesado();
        Lutador lutador  = new Lutador(fabrica);
        assertEquals("Relatorio de Lutador Peso Pesado", lutador.emitirRelatorio());
    }

    @Test
    void deveEmitirCategoriaPena() {
        FabricaAbstrata fabrica = new FabricaPena();
        Lutador lutador  = new Lutador(fabrica);
        assertEquals("Lutador Peso Pena", lutador.emitirTorneioUFC());
    }

    @Test
    void deveEmitirCategoriaPesado() {
        FabricaAbstrata fabrica = new FabricaPesado();
        Lutador lutador  = new Lutador(fabrica);
        assertEquals("Lutador Peso Pesado", lutador.emitirTorneioUFC());
    }

}
