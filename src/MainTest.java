import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.junit.Assert.assertEquals;

class MainTest {
    private Main testing = new Main ();
    OffsetDateTime dataEsercizio3 = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void dataFormattata() {
        String result = testing.dataFormattata(dataEsercizio3);
        assertEquals("01 03 2023", result);
    }
}



