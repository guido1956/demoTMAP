import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EenvoudigeTest {
    @Test
    public void testOptellenVanTweeGeheleGetallen() {
        Rekenen sommetje = new Rekenen();
        int getal1 = 20;
        int getal2 = 30;
        int verwachtResultaat = 50;
        int echtResultaat = sommetje.optellen(getal1, getal2);
        assertEquals(verwachtResultaat, echtResultaat, "Optelling twee getallen niet juist");
    }
 }