package listas.lista03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {
    @Test
    public void testNotasNegativas() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Aluno(-5, 10, 10, 10);
        });
    }
    
}
