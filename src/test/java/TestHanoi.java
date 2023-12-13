import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHanoi {

    // Teste 0 discos deve retornar 0 movimentos
    @Test
    public void testResolverTorreDeHanoiComZeroDiscos() {
        TorreDeHanoi torreDeHanoi = new TorreDeHanoi();
        assertEquals(0, torreDeHanoi.resolverTorreDeHanoi(0));
    }

    // Teste 1 disco deve devolver 1 movimento
    @Test
    public void testResolverTorreDeHanoiComUmDisco() {
        TorreDeHanoi torreDeHanoi = new TorreDeHanoi();
        assertEquals(1, torreDeHanoi.resolverTorreDeHanoi(1));
    }


    // Teste 3 discos deve devolver 7 movimentos
    @Test
    public void testResolverTorreDeHanoiComTresDiscos() {
        TorreDeHanoi torreDeHanoi = new TorreDeHanoi();
        assertEquals(7, torreDeHanoi.resolverTorreDeHanoi(3));
    }


}
