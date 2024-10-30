package listas.lista03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {
    @Test
    public void testLarguraAlturaNegativos() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Retangulo(-5, 10);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Retangulo(5, -10);
        });
    }
    
}
