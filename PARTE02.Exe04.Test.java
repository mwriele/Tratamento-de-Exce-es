package listas.lista03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
    @Test
    public void testPesoAlturaNegativos() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Pessoa("João", -70, 1.75);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Pessoa("Maria", 70, -1.65);
        });
    }
    
}
