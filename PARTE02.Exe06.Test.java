package listas.lista03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContribuinteTest {
    @Test
    public void testSexoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contribuinte("X", 10, 30);
        });
    }

    @Test
    public void testTempoIdadeNegativos() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contribuinte("M", -5, 30);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Contribuinte("F", 5, -30);
        });
    }

    @Test
    public void testTempoMaiorQueIdade() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contribuinte("M", 30, 30);
        });
    }

}
